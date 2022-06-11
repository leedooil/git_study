package day28;

public class Anonymous4 {

	public static void main(String[] args) {
//		Abstract ab1=new Abstract();
		Abstract ab=new Abstract() {

			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
			}};
			ab.f2();
	}

}
abstract class Abstract{
	abstract void f2();
}