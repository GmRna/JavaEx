package Chepter05;
/* 5-3.2 반복문의 while문
 * 구조 : while(조건식) {
 *         실행문;
 *         }
 *       조건식이 true일경우 실행되나 조건에 따라 무한반복 될 수있다.
 */
public class WhileEx {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while (i <= 100) {
			sum += i;
			System.out.println(i); // 이것만 있다면 무한반복되어버린다.
			i++;
		} // i는 1부터 시작하고 i가 100보다 작거나 같은때까지 실행
		System.out.println("합계 :"+sum );
		System.out.println("반복이 끝난 후 : "+i); // 반복이 끝난 후는 101이다.
		
	}

}
