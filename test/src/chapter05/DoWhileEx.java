package Chepter05;
// 5-3.3 반복문의 while문
public class DoWhileEx {

	public static void main(String[] args) {
			int i = 1;
			int sum = 0;
            do {
				sum += i;
				i++;
                }while (i <= 100);
			 // 일단 한 번 실행 후 나중에 대입
			System.out.println("합계 :"+sum );
			System.out.println("반복이 끝난 후 : "+i); 
	}
}
