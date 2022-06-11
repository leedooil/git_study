package day15;

import java.util.Arrays;

public class Array_4 {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		int[] b= {0,0,0,0,0,0,0};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b)); 
		
		System.arraycopy(a, 2, b, 3, 4);
		System.out.println(Arrays.toString(b));

		
	}

}
