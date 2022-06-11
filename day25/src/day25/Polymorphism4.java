package day25;

public class Polymorphism4 {

	public static void main(String[] args) {
		Animal lion1 = new Lion();
		Animal rabbit1 = new Rabbit();
		Animal monkey1 = new Monkey();
		
		Zookeeper james = new Zookeeper();
		james.feed(lion1);
		james.feed(rabbit1);
		james.feed(monkey1);
		
		

	}

}
class Animal{
	void breath() {System.out.println("¼û½¬±â");}
}
class Lion extends Animal{
	public String toString() {
		return "»çÀÚ";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "Åä³¢";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "¿ø¼şÀÌ";
	}
}
class Zookeeper{
	void feed(Animal animal) {
		System.out.println(animal+"¿¡°Ô ¸ÔÀÌÁÖ±â");
		
	}
	
	
	
	
	
}
