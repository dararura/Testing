package ch05;

public class SubStringExample {

	public static void main(String[] args) {
		String ssn="000828-1234123";
		
		String firstNum=ssn.substring(0,6);	//0번째 부터 6-1(5)까지 000828까지
		System.out.println(firstNum);
		
		String secondNum=ssn.substring(7);
		System.out.println(secondNum);
	}

}
