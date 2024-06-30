package ch5;

public class Arr7 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= arr1;
		int i;
		for(i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("배열 arr1의 참조값:"+arr1);
		System.out.println("배열 arr2의 참조값:"+arr2);

	}

}
