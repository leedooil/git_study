package day34;

import java.time.LocalDate;

public class Leap {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		LocalDate new_ld;
		int count=0;
		
		for(int i=1900;i<=2100;i++) {
			new_ld=ld.withYear(i);
			if(new_ld.isLeapYear()) {
				System.out.println(new_ld.getYear()+"년은 윤년입니다.");
				count++;
			}
		}
		System.out.println("1900년 부터 2100년까지 윤년은 총"+count+"번 있습니다.");
	}

}
