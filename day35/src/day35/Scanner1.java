package day35;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름을 입력하세요:");
		String name=sc.nextLine();
		System.out.println(name+"님 환영합니다.");
	}

}
