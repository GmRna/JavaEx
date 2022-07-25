package Chepter05;

import java.util.Scanner;

// 5-3.4 중첩 반복문
public class LoopEx {

	public static void main(String[] args) {
	 	/* for문과 while문을 쓸 경
	     * for : 반복횟수가 정해져 있을 때
	     * while : 반복횟수가 정해져 있지 않을 때 (랜덤과 같은 것)
	     */
		
//		while(true) {
//			Scanner scan = new canner(System.in);
//			System.out.println("숫자를 입력하세요(9는 종료)");
//			int number = scan.nextInt();
//			if (number == 9) break;
//		}
		boolean flag = true;
		while (flag) {
			Scanner scan = new Scanner(System.in);
			System.out.println("숫자를 입력하세요(9는 종료)");
			int number = scan.nextInt();
			if (number == 9) flag = false;
		}
		System.out.println("끝");
	}   
}