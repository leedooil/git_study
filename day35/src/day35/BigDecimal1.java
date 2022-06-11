package day35;

import java.math.BigDecimal;

public class BigDecimal1 {

	public static void main(String[] args) {
		double a=24.3953;
		double b=50.343998;
		System.out.println(a+b);
		
		BigDecimal number=new BigDecimal(String.valueOf(a));
		BigDecimal number2=new BigDecimal(String.valueOf(b));
		System.out.println(number.add(number2));
	}

}
