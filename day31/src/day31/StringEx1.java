package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat:�������ڿ��� ����� ���� �������
		System.out.println(str.concat(" world!"));
		System.out.println(str);
		//substring(������ġ,����ġ):������ġ~����ġ ������ ������
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(3));
		//length():���ڿ��� ������ �˷���
		System.out.println(str.length());
		//toUpperCase, toLowerCase:�빮�ڷ�,�ҹ��ڷ� �ٲ���
		System.out.println(str.toUpperCase());
		System.out.println("TEST".toLowerCase());
		//charAt(�ε��� ���°), indexOf(���ڿ� ���°), equals(���ڿ��� ����?)
		System.out.println(str.charAt(1));
		System.out.println("hello world".indexOf("WORLD")); //-1�� ��ã����
		System.out.println(str.equals("hello"));
		System.out.println(str.equals("HELLO"));
		//trim():�յڰ�������, replace:���ڴ�ü, replaceAll:��ü���ڿ���ü
		System.out.println(" test ".trim());
		System.out.println("hello world".replace('l','L'));
		System.out.println("hello world".replaceAll("hello","bye"));
		
		
		
		
	}

}
