package object_class; // asd

// 은행계좌 클래스(신한은행) => 멤버변수 접근제한자로 보호, getter/setter 설정

public class Account {
	
	// 멤버변수 (필드)
	static final String BANKNAME = "신한은행"; // static: 정적인 멤버변수, 안붙으면 인스턴스 멤버변수 
	String accountNo; // 계좌번호
	String ownerName; // 예금주 이름
	int balance;      // 잔액
	
	// (static) 정적인 멤버변수는 변수를 호출할 때 원본(선언한 클래스의 멤버변수)에서 호출한다. 
	// 동적인 (인스턴스) 멤버변수는 new를 통해서 인스턴스 변수를 만들어 멤버변수에 접근한다.
	// -> ex) System.out.println("거래은행 : " + Account.BANKNAME); // static -> Account 클래스에서 바로 불러냄
	// 		  System.out.println("계좌번호 : " + obj.accountNo); // instance -> obj라는 매개변수에서 불러냄

	
	// 생성자 : 생성과 동시에 초기화하는 것
	// 클래스의 구성요소: 1. 멤버변수 2. 생성자 3. 메소드
	
	// 생성자: 매개변수를 3개받는 생성자
	// 멤버변수와 매개변수의 이름을 같게 할 때는 멤버변수 앞에 this. 를 붙혀줌으로써 구분해준다.
	public Account (String accountNo, String ownerName, int balance) { // 생성자
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 생성자: 빈 생성자
	public Account() { // 빈생성자 (매개변수로 어떤 값도 받지 않는 생성자)	
		
	}
	
	
	// 예금한다 메소드
	void deposit (int amount) { // void는 리턴값이 없을 때
		balance += amount;
	}
	
	//출금한다 메소드
	int withdraw (int amount) throws Exception{ // 예외가 발생할 수 있는 상황을 throw문을 통해서 메인 함수로 (메소드가 호출된 곳으로) 넘김
		if (balance < amount) { // amount는 인출하려는 금액
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
	
}
