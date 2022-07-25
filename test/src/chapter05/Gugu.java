package Chepter05;
// 5-3.4 중첩 반복문
public class Gugu {

	public static void main(String[] args) {
		abc : for (int i=1; i<=9; i++) {
			System.out.println("2 * "+i+" = "+ 2 * i);
		}
		// i는 1이고 i가 9가 될때까지 계속해서 산출하여 출력	
			
		for (int j=2; j<=9; j++) {
			System.out.println("["+j+"단]"); // 이것을 통해 각단마다 구분이 가능하다.
			abc : for(int i=1; i<=9; i++) {
				System.out.println(j+" * "+i+" = "+i*j);
				if (i == 6) {
					break abc; // 6단에 멈춰서 6단까지만 출
				} 
			}
	    // j는 2부터 시작해서 9가될때가지 1씩 증가하는데 j가 2일때 0
		}
	}   
 	/* for문과 while문을 주로 쓰는 코드
	     * for : 반복횟수가 정해져 있을 때
	     * while : 반복횟수가 정해져 있지 않을 때
	     */
}