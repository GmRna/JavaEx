package Chepter04;
// 4-8 문자열 연산
public class OpEx08 {

	public static void main(String[] args) {
		System.out.println(100 + "cm"); // "100" + "cm" 이렇게 인식하고 출력
		System.out.println(1 + "1"); // "1" + "1" 이렇게 인식하고 출력
		System.out.println(true + "true"); // "true" + "true" 이렇게 인식하고 출력 (자동 형변환)
	
		int age = 30;
		String age2 = age + ""; // 자동 형변환이 일어남 문자열 정수 + 문자열 = 문자
		String age3 = String.valueOf(age);
		// 위의 age2와 같게 출력됨 age2는 자동형변환을 활용하여 사용한 것
		
		// 4-9 연산자 우선순위
		// 괄호()가 제일우선 대입(+=, -=, ==, /=, *=)이 제일 마지막
	}

}
