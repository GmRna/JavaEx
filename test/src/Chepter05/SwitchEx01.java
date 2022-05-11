package Chepter05;
//Switch 문
import java.util.Scanner;
// 자바 유틸리티로 콘솔창에 입력할 수 있도록 해주는 도구

public class SwitchEx01 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		// scanner가 클래스명, 내가 입력한 단어를 컴퓨터가 읽을 수 있도록 하는 것
		// ctrl + shift + O(알파벳)를 누르면 자동 import
		// 같은 패키지에 있는 것만 가능 (String의 경우 Java.lang에 있음-다른 클래스에 있으면 import 해야함)
		// 폰트 네이버 나눔고딕 코딩글꼴 tip! 
		
		
		int score = scan.nextInt();
		String grade = ""; // 여기 선언한 이유는 중괄호 안에서 선언하면 중괄호 안에서만 사용가능한 변수가 된다.
		switch (score / 10) { // 10의 자리수를 출력하기 위해서 ex) 95점을 입력해서 9가 출력되도록
			case 9:
				grade ="A";
			    break;
			case 8:
				grade ="B"; 
				break;
			case 7:
				grade ="C";
				break;
			case 6:
				grade ="D";
				break;
			default :
				grade ="F";
		}
		System.out.println("학점 : "+grade); 
		// 하지만 출력은 F가 나옴. why? break;를 뺴먹어서 계속 연산해서 결국 디폴트값이 나오게 됨
	}

}
