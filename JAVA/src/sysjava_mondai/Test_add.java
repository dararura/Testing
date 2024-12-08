package sysjava_mondai;
import java.util.Scanner;
public class Test_add {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력");
		x=sc.nextInt();
		System.out.println(x+10);
		System.out.println(x-10);
		sc.close();

	}

}
