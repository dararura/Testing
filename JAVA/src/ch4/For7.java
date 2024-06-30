package ch4;

public class For7 {

	public static void main(String[] args) {
		int x,y;
		for(x=0;x<4;x++) {
			for(y=1;y<=x+1;y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
