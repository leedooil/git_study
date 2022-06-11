package day08;

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {

		Random random = new Random();
		System.out.println("☆★☆★Random Choosing Pokemon☆★☆★");
		System.out.println("1. 피카츄 : 전기괴물");
		System.out.println("2. 꼬부기 : 물괴물");
		System.out.println("3. 이상해씨 : 풀괴물");
		int mypokemon = random.nextInt(3)+1;
		System.out.println("선택된번호 : "+mypokemon);		
		switch(mypokemon){
		case 1:
			System.out.println("피카츄 선택! 백만볼트!!!!");
			break;
		case 2:
			System.out.println("꼬부기 선택! 하이드로펌프!!!!");
			break;
		case 3:
			System.out.println("이상해씨 선택! 솔라빔!!!!");
			break;

		}
	}

}
