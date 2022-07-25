package Chepter04;
//4-2 산술연산
public class OpEx02 {

	public static void main(String[] args) {
		
		int a = 5 + 5;
		System.out.println("5 + 5 = "+a);
		int b = a - 5;
		System.out.println("5 + 5 = "+b);
		int c = b * 2;
		System.out.println("5 + 5 = "+c);
		int d = c / 5;
		System.out.println("5 + 5 = "+d);
		
		int e = 10 % 3; //나머지연산 나머지 사칙연산도 비슷하게 진행
		System.out.println("10 % 3 = "+e);
		
		//정수와 정수의 연산은 항상 정수 나누기에서 문제가 발생
		int kor = 95;
		int eng = 85;
		int math = 76;
		double avg = (kor+eng+math) / 3;
		System.out.println("과목평균 = "+avg); 
		// 딱 떨어질 수 없는 연산이지만 정수와 정수의 연산이기때문에 소수점 아래 값은 버려진다.
		
		//부호연산 혼동될 수 있어서 자주 사용은 X
        // + * + = +
		// + * - = -
		// - * + = -
		// - * - = +
		
		int f = -5;
		System.out.println(-f); // -(-5) 
		System.out.println("f = "+-f); // +는 문자열을 붙여주는 것인데 부호연산을 쓰면 혼동됨
		System.out.println("f = "+f*-1);
	}
}
