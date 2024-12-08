package ch7;

public class PointArrMain {

	public static void main(String[] args) {
		//객체 배열 생성
		Point[] arr=new Point[5];
		int i;
		for(i=0;i<5;i++) {
			arr[i]=new Point();
			arr[i].x=i+1;
			arr[i].y=i+1;
		}
		for(i=0;i<5;i++) {
			System.out.println("aar["+i+"].x="+arr[i].x);
			System.out.println("arr["+i+"].y="+arr[i].y+"\n");
		}

	}

}
