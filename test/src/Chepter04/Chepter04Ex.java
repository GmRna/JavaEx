package Chepter04;
// 4단원 마무리
public class Chepter04Ex {

	public static void main(String[] args) {
		// 문제 3
		System.out.println("* 문제 3번정답");
		int colorPen = 5 * 12;
		int studentCount = 27;
		
		int divColorPen = colorPen / studentCount;
		System.out.println("- 학생당 나눠가지는 색연필수 :"+divColorPen);
		
		int remainColorPen = colorPen % studentCount;
		System.out.println("- 똑같이 나눠가지고 남는 색연필수 :"+divColorPen);
		
		// 문제 4
		System.out.println("* 문제 4번정답");
		int age = 6;
		int height = 120;
		boolean parent = true;
		boolean hearchDease = true;
		
		if (age >= 6 && height >= 120 && hearchDease) {
			System.out.println("- 탑승가능");
		} else if (age < 6 && height >= 120 && parent && hearchDease) {
			System.out.println("- 탑승가능");
		} else {
			System.out.println("- 탑승불가");
		}
		
		//문제 5
		System.out.println("* 문제 5번정답");
		int year = 2020;
		boolean leapyear = (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0);
		// 윤년이면true, 윤년이 아니면 false
		System.out.println("- "+leapyear);
		
		//문제 6
		System.out.println("* 문제 6번정답");
		int price = 187000;
		int oman = price / 50000;
		int ilman = (price / 10000) % 5;
		int ochun = (price % 10000) / 5000;
		int ilchun = (price % 5000) / 1000;
		
		System.out.println("- 5만원권 : "+oman+"장");
		System.out.println("- 1만원권 : "+ilman+"장");
		System.out.println("- 5천원권 : "+ochun+"장");
		System.out.println("- 1천원권 : "+ilchun+"장");
		
		//문제 7
		System.out.println("* 문제 7번정답");
		int number = 1234;
		int result = (number / 100) * 100;
		System.out.println("- "+result);
	}

}
