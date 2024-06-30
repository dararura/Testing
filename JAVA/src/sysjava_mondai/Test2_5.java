package sysjava_mondai;

import java.util.Scanner;

public class Test2_5 {

	public static void main(String[] args) {
		int anynum;
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자입력");
		anynum=sc.nextInt();
		System.out.println("입력한 숫자 :"+anynum);
		sc.close();
	}

}
