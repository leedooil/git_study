package day11;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("숫자 입력 : ");
			num = sc.nextInt();
			if(num==0) {
				System.out.println("반복 종료!");
				break;
			}
			System.out.println("입력값 : "+num);
		}
	
		
	
	}

}
