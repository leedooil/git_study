package day18;

public class SumEx {
	public static void main(String[] args) {
		sum(10,20);
		sum(1.23,3.12);
		sum(10,20,30);

	}
	static void sum(int x,int y) {
		System.out.println(x+y);
	}
	static void sum(double x,double y) {
		System.out.println(x+y);
	}
	static void sum(int x,int y,int z){
		System.out.println(x+y+z);
	}

}
