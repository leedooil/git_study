package day22;

public class ObjectArray1 {
	public static void main(String[] args) {
		Aclass ar[]=new Aclass[3];
		ar[0]=new Aclass();
		ar[0].x=100;
		ar[0].f1();
		System.out.println(ar[0].x);

	}
		

}
class Aclass{
	int x;
	void f1() {
		System.out.println("f1()");
	}
}
