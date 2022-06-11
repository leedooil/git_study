package day12;

public class Array_1 {
	public static void main(String[] args) {

		int score1=100;
		int score2=80;
		int score3=70;
		System.out.println("1번째 학생의 점수:"+score1+"점");
		System.out.println("2번째 학생의 점수:"+score2+"점");
		System.out.println("3번째 학생의 점수:"+score3+"점");
		System.out.println();
		
		int scores[]=new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for(int i=0;i<3;i++) {
			System.out.println(i+1+"번째 학생의 점수:"+scores[i]+"점");
		}
		
	
		
		
		
		
	}

}
