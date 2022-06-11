package day24;

public class Inheritance1 {

	public static void main(String[] args) {
		Student st=new Student();
		st.breath();
		st.learn();
		
		Teacher t=new Teacher();
		t.eat();
		t.teach();

	}

}

class Person{
	void breath() {
		System.out.println("¼û½¬±â");
	}
	void eat() {
		System.out.println("¹ä¸Ô±â");
	}
	void say() {
		System.out.println("¸»ÇÏ±â");
	}
}

class Student extends Person{
	void learn() {
		System.out.println("¹è¿ì±â");
	}
	
}

class Teacher extends Person{
	void teach() {
		System.out.println("°¡¸£Ä¡±â");
	}
}



