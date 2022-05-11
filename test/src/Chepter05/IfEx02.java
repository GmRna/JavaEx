package Chepter05;
//5-2조건문
public class IfEx02 {

		public static void main(String[] args) {
			int score = 80;
			String grade = "";
			
			System.out.println("학점부여 시작");
			if (score >= 95) {			//첫번째 조건이 트루이면 멈추고 false이면다
				grade = "A+";
			} else if (score >= 90)  {
				grade = "A";
			} else if (score >= 85)  {
				grade = "B+";
		    } else if (score >= 80)  {
		    	grade = "B";
		    } else if (score >= 70)  {
		    	grade = "C";
		    } else if (score >= 60)  {
		    	grade = "D";
		    } else {
		    	grade = "F";
		    }
		    System.out.println("당신의 학점은 "+grade+"입니다.");
		    System.out.println("학점부여 ");
		}
}