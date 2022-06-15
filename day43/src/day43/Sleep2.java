package day43;

public class Sleep2 {

	public static void main(String[] args) {
		SleepThread t=new SleepThread();
		t.start();
	}

}

class SleepThread extends Thread{

	@Override
	public void run() {
		System.out.println("카운트 다운 5초");
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			if(i!=0) {
				try {
					Thread.sleep(1000);
				}catch (InterruptedException ie) {
					System.err.println(ie.toString());
				}
			}
		}
		System.out.println("종료 !");
	}
	
}
