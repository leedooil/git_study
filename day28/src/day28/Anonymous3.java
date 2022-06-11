package day28;

public class Anonymous3 {

	public static void main(String[] args) {
//		Inter1 it1=new Inter1();
		Inter1 it=new Inter1() {

			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
				
			}
			
		};
		it.f1();
	}

}
interface Inter1{
	void f1();
}
class Inter1Imp1 implements Inter1{

	@Override
	public void f1() {
		
	}
}	