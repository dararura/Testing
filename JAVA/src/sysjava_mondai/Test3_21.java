package sysjava_mondai;

import java.util.Scanner;

public class Test3_21 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("계절입력(정수만):");
		x=sc.nextInt();
		switch(x)	{
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			default:
				System.out.println("정수만 입력하시오");
		}
	}

}
