package sysjava_mondai;

import java.util.Scanner;

public class Test3_5 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력:");
		x=sc.nextInt();
		if(x<0) {
			System.out.println("음수(-)");
		}
		else if(x==0) {
			System.out.println("0");
		}
		else {
			System.out.println("양수(+)");
		}
		

	}

}
