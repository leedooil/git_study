package day34;

import java.time.LocalDate;

public class WithPrac {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld=ld.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(new_ld);
	}

}
