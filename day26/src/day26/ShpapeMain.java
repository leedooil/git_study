package day26;

public class ShpapeMain {

	public static void main(String[] args) {
		Shape shapes[]=new Shape[3];
		shapes[0]=new Rect();
		shapes[1]=new Circle();
		shapes[2]=new Line();
		
		for(int i=0;i<3;i++) {
			shapes[i].draw();
			
		}
		

	}

}
abstract class Shape{
	abstract void draw();
}
class Rect extends Shape{
	void draw() {
		System.out.println("사각형을 그리다");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리다");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("선을 그리다");
	}
}
