package day23;

public class Constructor3 {
	public static void main(String[] args) {
		Bclass b1 = new Bclass("���浿");
		System.out.println(b1.name);
		Bclass b=new Bclass();
		System.out.println(b);
		
		

	}

}
class Bclass{
	String name;
	Bclass(){}
	Bclass(String name){
		System.out.println("Bclass�� �Ű����� ������()");
		this.name=name;
	}
}
