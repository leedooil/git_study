package day18;

public class Calc {
	public static void main(String[] args) {
		System.out.println("--정수의 사칙연산--");
		System.out.println("sum(10,20) : "+sum(10,20));
		System.out.println("sub(10,20) : "+sub(10,20));
		System.out.println("mul(10,20) : "+mul(10,20));
		System.out.println("div(10,20) : "+div(10,20));
		System.out.println("--실수의 사칙연산--");
		System.out.println("sum(1.2,2.3) : "+sum(1.2,2.3));
		System.out.println("sub(1.2,2.3) : "+sub(1.2,2.3));
		System.out.println("mul(1.2,2.3) : "+mul(1.2,2.3));
		System.out.println("div(1.2,2.3) : "+div(1.2,2.3));
		System.out.println("sum(hello,world) : "+sum("hello","world!"));

	}
	static int sum(int x,int y) {return x+y;}
	static int sub(int x,int y) {return x-y;}
	static int mul(int x,int y) {return x*y;}
	static int div(int x,int y) {return x/y;}
	
	static double sum(double x,double y) {return x+y;}
	static double sub(double x,double y) {return x-y;}
	static double mul(double x,double y) {return x*y;}
	static double div(double x,double y) {return x/y;}
	
	static String sum(String x,String y) {return x+y;}
		

}
