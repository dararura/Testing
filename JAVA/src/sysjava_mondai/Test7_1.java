package sysjava_mondai;

import java.util.Scanner;

public class Test7_1 {

	static int signOf(int n) {
		int sign = 0;
		if(n>0) {
			sign=1;
		}
		if(n<0) {
			sign=-1;
		}
		return sign; 
	}
	



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 x: ");
		int x=sc.nextInt();
		int s=signOf(x);
		System.out.println("signOf(x)는"+s+"입니다");
		
	

	}

}
