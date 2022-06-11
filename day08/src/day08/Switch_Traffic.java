package day08;

import java.util.Scanner;

public class Switch_Traffic {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("☆★☆★신호등 프로그램☆★☆★");
		System.out.println("빨간불:1 , 노란불:2, 초록불:3");
		System.out.println("신호:");
		int sign = sc.nextInt();
		switch(sign) {
		case 1 :
		System.out.println("빨간불입니다. 정지하세요");
		break;
		case 2 :
			System.out.println("노란불입니다. break밟으세요");
		break;
		case 3 :
			System.out.println("초록불입니다. 출발하세요");
		break;
		default:
		    System.out.println("잘못누르셨습니다.");
		}
		
	}

}
