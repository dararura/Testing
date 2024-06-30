package ch6;

public class MethoddDef {

	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(12); //caller(콜러)
		hiEveryone(13);
		System.out.println("프로그램의 끝");

	}
public static void hiEveryone(int age) { //오픈소스는 모두 퍼블릭(public) callee
	System.out.println("좋은 아침입니다.");
	System.out.println("제 나이는 "+age+"세 입니다.");
}
}
