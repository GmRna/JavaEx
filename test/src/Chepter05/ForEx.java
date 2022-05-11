package Chepter05;

/* 5-3.1 반복문의 for문
 * 구조 : for(초기화식; 조건; 증감식) {
 *         실행문;
 *         }
 *       ① 초기화 진행 int a = 0
 *       ② 조건식 a < 5
 *       ③ 증감 a++ 또는 a--
 *       ④ 실행문 조건식이 true 일때만 진행
 *       반복문의 조건이 true인 동안 중괄호 실행문을 반복적으로 실행
 */
public class ForEx {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { // 보통 i로 많이한다. 하지만, 배열에서 index로 많이해서
			System.out.println("i = "+i);
// i는 0부터 시작(초기화) i가 10보다 작을때 1을 증가하고 조건문과 비교 해서 10보다 작으면 출력
// 10이 되면 조건식이 false 이기 때문에 출력하지 않음
		}
		// 1. 반복
		// 철수야 안녕? 출력을 100번 출력
		System.out.println("철수야 안녕?");
		// 2. 패턴
		// 1 ~ 100 까지 더하
		int sum = 0;
		for (int x = 1; x <= 100; x++) {
			sum = sum + x;
		}
		System.out.println("1~100까지 합친 수 : "+sum);
	}

}
