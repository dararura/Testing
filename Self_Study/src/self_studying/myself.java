package self_studying;

import java.util.Scanner;

public class myself {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("x 값 입력: ");
		int strX=scanner.nextInt();

		System.out.println("y 값 입력: ");
		int strY=scanner.nextInt();
		

		int result=strX+strY;
		System.out.println("x+y= "+result);
		System.out.println();

		while(true){
			System.out.println("입력 문자열 : ");
			String data=scanner.next();
			if(data.equals("q")){
				break;
			}
			System.out.println("출력 문자열 : "+data);
			System.out.println();
		}
		System.out.println("출력 종료");

		scanner.close();
	}
}