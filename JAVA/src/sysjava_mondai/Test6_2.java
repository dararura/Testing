package sysjava_mondai;

public class Test6_2 {

	public static void main(String[] args) {
		int [] arr=new int[5];
		int x;
		for(x=0;x<arr.length;x++) {
			arr[x]=arr.length-x;
			System.out.println(arr[x]);
		}
	}

}
