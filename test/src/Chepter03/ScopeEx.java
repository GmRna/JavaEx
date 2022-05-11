package Chepter03;
//3-5 변수(핵심 괄호의 범위를 잘파악하자)
public class ScopeEx {
	
	int no; // 클래스 블럭 내에서 사용가능한 변수(클래스 중괄호 내에서는 어디서든 사용)
	         
	public static void main(String[] args) { // 메인메서드 블럭
		String name; // 이 변수는 메인 메서드에서만 사용가능한 변수이다.
	}
	
	void test2() {
		int age = 30;
		if (true) {
			no = 10; //클래스에서 정의된 변수이기 때문에 사용가능 만약 void test2에서 no가 다시 선언된 것이 있다면 그것으로 사용
			// 가까운 변수선언부터 사용한다.
			age = 40;
		}
	}
	
	void test1() {
		no=10; // 클래스에서 정의된 변수 
	 	//age = 40; // test2 메서드에서 정의된 변수이기 때문에 에러가 나타난다. test1 메서드에서는 age가 선언되지 않음
	}
}