package day25;

public class Downcasting1 {

	public static void main(String[] args) {
		Human h1 = new Student("���浿",20,"�����ϱ�",3);
		Student s1 = (Student)h1;
		s1.study();
		

	}

}
