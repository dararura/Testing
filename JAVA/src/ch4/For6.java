package ch4;

public class For6 {

	public static void main(String[] args) {
		int x,y;
		for(x=0;x<10;x++) {		//단에 곱해지는 숫자를 위한 루프
			for(y=2;y<10;y++) {	//단수를 위한 루프
				if(x==0) {		//제목줄 출력
					System.out.print(y+"단\t");
				}else {System.out.print(y+"*"+x+"="+x*y+"\t");
			}
		}
			System.out.println();

	}
	}
}
