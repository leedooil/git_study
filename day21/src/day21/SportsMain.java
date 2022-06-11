package day21;

public class SportsMain {

	public static void main(String[] args) {

		Member member1 = new Member() {};
		Member member2 = new Member() {};
		Member member3 = new Member() {};
		Member member4 = new Member() {};
		
		member1.name = "±èÃ¶¼ö";
		member1.age=32;
		member1.gender="³²ÀÚ";
		
		member2.name = "±è¹ÎÈ£";
		member2.age=28;
		member2.gender="³²ÀÚ";
		
		member3.name = "ÀÌ¿µÈñ";
		member3.age=24;
		member3.gender="¿©ÀÚ";
		
		member4.name = "°í¼®Ãµ";
		member4.age=32;
		member4.gender="³²ÀÚ";
		
		Member.centerName="Bye";
		System.out.println("member1---------");
		member1.info();
		System.out.println("member2---------");
		member2.info();
		System.out.println("member3---------");
		member3.info();
		System.out.println("member4---------");
		member4.info();
		
		
	}

}
class Member{
	static String centerName="Hello";
	String name;
	int age;
	String gender;
	
	void info() {
		System.out.println("centerName:"+centerName);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
	}
}
