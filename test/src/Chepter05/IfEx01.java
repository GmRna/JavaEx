package Chepter05;
//5-1프로그램의 실행 제어와 제어문
//실행순서 : 자바 실행 -> main(메서드) 실행 -> 이후 위에서부터 실행
// 1,2,3,4 만약 은 특수한 경우에 실행되게 한다면 1,2,4 순서로 실행

public class IfEx01 {
	// 5-2조건문
	//조건식(if)가 true이면 실행문 진행 false이면 마무리
		public static void main(String[] args) {
			int score = 59;
			System.out.println("시험 시작");
			if (score == 100) {                  // if 가 true이면 그대로 출력
				System.out.println("만점입니다.");
			} else if (score >= 60) {            // if 가 false 일때 실행
				System.out.println("합격입니다.");
			} else {                             // if와 else if가 false일때 출력
				System.out.println("불합격입니다."); 
			}
			System.out.println("시험 끝");		
			// if안에 if가 있을 수 있다. 중첩가능 괄호의 범위를 잘 파악하자.
			// if에 들어올 수 있는 것은 boolean만 들어올 수 있다.
		}
}