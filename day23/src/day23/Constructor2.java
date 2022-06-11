package day23;

public class Constructor2 {
	public static void main(String[] args) {
		CellPhone myphone = new CellPhone();
		System.out.println(myphone.model);

	}

}
class CellPhone{
	String model="Galaxy 8";
	String color="red";
	int capacity=60;
	CellPhone(){
		System.out.println("model:"+model);
		System.out.println("color:"+color);
		System.out.println("capacity:"+capacity);
	}
}
