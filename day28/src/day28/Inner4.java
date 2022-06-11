package day28;

public class Inner4 {

	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		System.out.println("OuterClass의 a의 값 : "+oc.a);
		System.out.println("OuterClass의 b의 값 : "+OuterClass.b);
		
		System.out.println("===Inner 클래스 접근하기===");
		OuterClass oc2=new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		
		System.out.println("Inner의 c의 값 : "+i.c);
		i.innerMethod();
		
		OuterClass.StaticInner si=new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값 : "+si.d);
		
//		si.staticMethod();
		OuterClass.StaticInner.staticMethod();
	}

}
class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
		
	}
}