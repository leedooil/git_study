package day24;

public class Inheritance2 {

	public static void main(String[] args) {
		Leader leader=new Leader();
		leader.say();

	}

}
class Student2{
	void learn() {
		System.out.println("¹è¿ì±â");
	}
	void eat() {
		System.out.println("¹ä¸Ô±â");
	}
	void say() {
		System.out.println("¼±»ý´Ô ¾È³çÇÏ¼¼¿ä~");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() {
		System.out.println("¼±»ý´Ô²² ÀÎ»ç!");
		super.say();
	}
}

