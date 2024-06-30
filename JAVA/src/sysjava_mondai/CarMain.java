package sysjava_mondai;

public class CarMain {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println("제작회사:"+c.company);
		System.out.println("모델:"+c.model);
		System.out.println("색깔:"+c.color);
		System.out.println("최고속도:"+c.maxspeed);
		System.out.println("속도:"+c.speed);
		c.speed=60;
		System.out.println("수정후 속도:"+c.speed);

	}

}
