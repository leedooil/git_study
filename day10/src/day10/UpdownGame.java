package day10;

import java.util.Random;
import java.util.Scanner;

public class UpdownGame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(100)+1;
		int user = -1;
		while(user!=num) {
			System.out.println("�����Է� : ");
			user = sc.nextInt();
			if(user==num) {
				System.out.println("�����Դϴ�!");
			}else if(user>num) {
				System.out.println("Down!");
			}else {
				System.out.println("Up!");
			}
			
		}
		
		
	}

}
