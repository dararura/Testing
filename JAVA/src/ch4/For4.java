package ch4;

public class For4 {

	public static void main(String[] args) {
		int x,y;
		System.out.println("구구단");
		for(x=2;x<10;x++) {
			for(y=1;y<10;y++) {
				System.out.println(x+"*"+y+"="+x*y);
				if(y==9) {
					System.out.println();
				}
			}
		}

	}

}
