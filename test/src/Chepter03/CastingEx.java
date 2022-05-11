package Chepter03;
//3-6 형변환(casting)
public class CastingEx {

	public static void main(String[] args) {
		// int < long < double 작은 것에서 큰 것으로는 자동형변환, 큰 것에서 작은 것으로는 강제형변환 필요
		int a = 10;
		long b = a; // 이럴 때 형변환이 발생 long에 int를 담음 a가 long에 대입
		//int c = b; // 이럴때는 에러. long을 int로 변환은 X
		
		int c = (int)b; // 강제 형변환 long -> int
		System.out.println(c); 
		double d = a; // int가 덜 포괄적이기 때문에 자동형변환
		
	    double pi = 3.14;
	    int pi2 = (int)pi; // 강제 형변환이 필요함
	    System.out.println(pi2); // 소수점 아래 값은 사라짐
	    
	    int kor = 90;
	    int eng = 80;
	    int math = 90;
	    // 합계점수
	    int total = kor + eng + math;
	    System.out.println(total);
	    // 평균점수 환산
	    int avg = total / 3;
	    System.out.println(avg); // 86으로 출력 why? int는 정수
	    
	    double avg2 = total / 3;
	    System.out.println(avg2); 
	    // 실수까지 표현 자바는 정수와 정수의 연산은 정수로 출력 total 선언을 int로 해서
	    // 소수점까지 연산하기 위해서는 total을 실수로 강제 형변환해야한다.
	    
	    double avg3 = (double)total / 3; //double로 강제형변환 후 나누기
	    System.out.println(avg3);
	    
	}
}