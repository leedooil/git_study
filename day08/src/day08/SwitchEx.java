package day08;

public class SwitchEx {
	public static void main(String[] args) {

		int book=50;
		//book=book/10;
		switch(book/10) {
		case 0:
			System.out.println("���� �� ����ϼ���!");
			break;
		case 1:
			System.out.println("å �д� ���� ���ô� ���̽ó׿�!");
		    break;
		case 2:
			System.out.println("å�� ����ϴ� ���̽ó׿�!");
			break;
	    default:
	    	System.out.println("����� �ٵ����Դϴ�!");
	    	
		}
	}

}
