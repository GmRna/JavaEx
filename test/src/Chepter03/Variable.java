package Chepter03;
// 변수선언
public class Variable {

	public static void main(String[] args) {
		int a; // 변수선언(a라는 변수를 선언)
		a = 10; // 변수 초기화(앞에서 선언한 변수 a에 10을 저장)
		System.out.println(a);
		int b = 20; // 변수 선언과 초기화를 동시에 진행
	    System.out.println(b);
	    int var = 30;
	    System.out.println(var);
	    //  String mas = "성탄절" 이렇게 생성과 초기화 후 
	    //  System.out.println(mas); 성탄절 출력 후 
	    //  mas = "크리스마스" 이렇게 변경가능
	    //  System.out.println(mas); 크리스마스 출력
	    
	    /* 변수명의 선정
	     * 알파벳, 숫자, 특수문자(_,$) 한글
	     * 숫자 시작 x, 공백 사용 x
	     * 대소문자 구분
	     * 자바 명령어 사용x 
	     * 의미 부여하는 명령어 쓰자 ex) 나이변수 = "age"
	     * 명명규칙
	     * 클래스 명의 첫자는 대문자 (ex String, Math)
	     * 변수나 메서드는 소문자
	     * 여러단어로 이루어진경우
	     * camel studentNumber 첫단어 다음 단어 첫 알파벳 대문자 보통 클래스명
	     * snake student_number 단어 사이에 언더바 보통 변수와 메서드
	     * PI, MAX_NUMBER 상수는 모두 대문자로 표현
	     */
	    
	    /* 기본자료형
	     * 정수 (-,+,0), 실수(소수점 있는 수), 논리(참/거짓)
	     * 정수(byte, short, int, long, char)
	     * 거의 int(-21억 ~ +21억)와 long(21억이 넘는 것)만 사용
	     */
         // why int 와 long??
	     // 연산이 일어나면 int로 바뀌기 때문에 byte와 short를 사용 x
         // 또한, 메모리를 아낄이유가 거의 없어짐
	    int c = 2100000000;
	    long d = 2100000000L; // 보통 long은 뒤에 대문자 L을 붙임

	    /* 실수 (double)
	     * float는 뒤에 f를 써줘야함. 소수점 있는 수(실수) 기본이 double
	     * 더 편하다
	     */
	    float e = 3.14f; // f가 붙어야함
	    double f = 3.14; // f가 없어도 된다.
	    /*
	     * 논리 (boolean)은 무조건 true 와 false만 가능
	     */
	    boolean g = true;
	    boolean h = false;
	    /* char(character)
	     * -문자이고 '(홑따옴표)로 감싸서 표현 cf. "(쌍따옴표)는 문자열
	     */
	    char i = 'A'; // 정수 65
	    char i2 = 'a'; // 정수97 
	    char i3 = 'B';// 정수 66 A에서 1더한 값
	    char i4 = 'b'; // 정수 98 a에서 1 더한 값
	    System.out.println(i+i2); // 영어지만 정수로 연산 그래서 기본형
	    
	    /* 참조자료형
	     * String 타입 사용
	     * 기본 자료형이 아닌 모든 것은 참조자료
	     * 무언가를 가르키고 있다.
	     * 
	     */
	    // 문자열 ABC...
	    // "(쌍따옴표)로 감싸면 문자열 (무조건)
	    String name = "홍길동"; // 변수선언 및 초기화 기본
	    System.out.println(name); //
	    // 참조자료형은 null로 초기화 가능
	    String name2 = null; // null은 값자체가 존재하지 않는 상태
	    String name3 = ""; // 빈문자열
	    String name4 = " "; // 공백 문자열 (공백이 저장)
	    // 세가지 전부 다 다른 의미
	    String name5 = "A"; // 문자(char) 아님 -> 홑따옴표로 하면 에러
	    
	    String aa = "1"; // 숫자도 감싸면 문자열로 취급
	    
	    String tel = "01028570347"; // 정수로 선언 불가 안에 특수 문자가 들어 있을 수 있고 앞에 0이 있다.
	    System.out.println(tel);
	    // N번째 단어 출력
	    String text = "Hello Java";
	    System.out.println(text.charAt(2)); // 1부터 시작이 아니라 0부터 시
	    
	    
	    final String AA = "1";
	    //aa = "2";
	    
	    final String BB;
	    BB = "2";
	    // 변수를 쓰는 이유 (담아두면 변수만 쓰면된다. 수정이 용이)
	    // 상수 -> 바뀌면 안되는 수에 사용 (세율, 카드수수료 등)
	    
	    /* 제어문자(escape)
	     * \(원표시) 다음에 하나의 문자를 추가해서 특별한 의미 부여한 문자
	     * \n = 줄바꿈, \t = 탭, \\ = \(역슬러시 자체 출력)
	     * \' = ', \" = "
	     */
	    
	    String greet = "안녕\\하세요\n반갑습니다.";
	    System.out.println(greet);
	    System.out.println("안녕하세요 저는 \"홍길동\" 입니다."); 
	    // 줄옮기기 단축키 알트 누르고 방향키
	    
	    //예제 1
	    /* 문자 : 하나의 문자 '로 감쌈
	     * 문자열 : 문자들이 나열 "로 감쌈
	     */
	    char j = 'A';
	    int k = a;
	    char l = 66;
	    int m = a+b;
	    System.err.println(j);
	}
} 
