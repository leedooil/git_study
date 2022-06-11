package day31;

public class StringEx1 {

	public static void main(String[] args) {
		String str="hello";
		//concat:기존문자열에 연결된 값을 출력해줘
		System.out.println(str.concat(" world!"));
		System.out.println(str);
		//substring(시작위치,끝위치):시작위치~끝위치 전까지 가져와
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(3));
		//length():문자열의 갯수를 알려줘
		System.out.println(str.length());
		//toUpperCase, toLowerCase:대문자로,소문자로 바꿔줘
		System.out.println(str.toUpperCase());
		System.out.println("TEST".toLowerCase());
		//charAt(인덱스 몇번째), indexOf(문자열 몇번째), equals(문자열이 같니?)
		System.out.println(str.charAt(1));
		System.out.println("hello world".indexOf("WORLD")); //-1은 못찾을때
		System.out.println(str.equals("hello"));
		System.out.println(str.equals("HELLO"));
		//trim():앞뒤공백제거, replace:문자대체, replaceAll:전체문자열대체
		System.out.println(" test ".trim());
		System.out.println("hello world".replace('l','L'));
		System.out.println("hello world".replaceAll("hello","bye"));
		
		
		
		
	}

}
