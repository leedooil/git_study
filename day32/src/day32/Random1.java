package day32;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random=new Random(); //seed:����ð�
		Random random1=new Random();//seed:����ð�
		Random random2=new Random(2);//seed:2
		Random random3=new Random(2);//seed:2
		System.out.println(System.currentTimeMillis());
		for(int i=0;i<5;i++) {
			System.out.println("random:"+i+"��° ��:"+random.nextInt());
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.println("random1:"+i+"��° ��:"+random1.nextInt());
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.println("random2:"+i+"��° ��:"+random2.nextInt());
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			System.out.println("random3:"+i+"��° ��:"+random3.nextInt());
		}
		System.out.println();
	}

}
