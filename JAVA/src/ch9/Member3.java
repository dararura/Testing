package ch9;

public class Member3 {
	String name;
	String tel;
	String address;
	
	Member3(String name, String tel, String address){
		this.name=name;		//this.멤버면수를 적용하여 동일한 이름의
		this.tel=tel;		//멤버변수와 지역 변수를 구분
		this.address=address;
	}
	
	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
	}
}
