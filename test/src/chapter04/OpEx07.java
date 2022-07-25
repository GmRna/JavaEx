package Chepter04;
// 4-7 삼항 연산
public class OpEx07 {
	
	public static void main(String[] args) {
		
		int score = 80;
		String pass = score >= 60? "합격" : "불합격"; 
		// 연산식이 true(합격)라면 합격이 출력, false(불합격) 이라면 불합격 출력
		// score >= 60? 부분에는 무조건 boolean이 와야함
		System.out.println(pass);
		
		
		//예제
		int score1 = 50;
		//점수가 60이상이면 (점수가 90이상이면 수석합격, 그렇지 않으면 합격) 미만이면 불합격
		String pass1 = score1 >= 60 ? score1 >= 90 ? "수석합격" : "합격" : "불합격";
		System.out.println(pass1);
		
		if (score1 >= 90) {
			System.out.println("수석합격");
		} else if (score1 >= 60) {
			System.out.println("합격");
		} else 
		{System.out.println("불합격");
	    } // if문으로 만든 것 (본인) -> pass로 출력되지 않음 길어진 코드에 적응 불가
		
		
		    if(score1 >= 90){
		    	pass = "수석합격";
		    } else if (score1 >= 60) {
				pass = "합격";
			} else  {
				pass = "불합격";
			}
		System.out.println(pass); // 강사님 풀이
	}
}
