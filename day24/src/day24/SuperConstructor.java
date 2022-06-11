package day24;

public class SuperConstructor {
	public static void main(String[] args) {
		SportsCar mycar=new SportsCar("red",300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
		
	}

}
class Car{
	int wheel;
	int speed;
	String color;
	Car(String color){
		this.color=color;
		
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color,int speedLimit){
		super(color);
		this.color=color;
		this.speedLimit=speedLimit;
	}
}
