package Chepter04;
//4-1 대입연산
public class OpEx01 {

	public static void main(String[] args) {
		// = +=, -=, *=, /=, %
		int number1 = 10;
		System.out.println("number1 = 10 -> "+number1);
		number1 += 10; // 더하고 대입
		System.out.println("number1 += 10 -> "+number1);
		number1 -= 10; // 빼고 대입
		System.out.println("number1 -= 10 -> "+number1);
		number1 *= 2; // 곱하고 대입
		System.out.println("number1 *= 2 -> "+number1);
		number1 /= 2; // 나누고 대입
		System.out.println("number1 /= 2 -> "+number1);
		number1 %= 3; // 나머지대입
		System.out.println("number1 %= 3 -> "+number1);
	    // 줄을 드래그 해서 ctrl + alt + 방향키하면 줄이 복사되서 내려옴 
		// 오른쪽에 있는 값을 왼쪽 변수에 대입한다. (기본 개념)
		}

	}
