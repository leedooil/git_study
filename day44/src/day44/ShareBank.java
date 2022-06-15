package day44;

public class ShareBank {

	public static void main(String[] args) {
		Atm atm=new Atm();
		Thread mom=new Thread(atm,"����");
		Thread son=new Thread(atm,"�Ƶ�");
		
		mom.start();
		son.start(); 
	}

}
class Atm implements Runnable{
	int money=10000;

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			withdraw(1000);
			printInfo();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
	void withdraw(int money) {
		Thread.yield();
		this.money-=money;
		System.out.println(Thread.currentThread().getName()+"��(��)"+money+"�� ���!");
	}
	void printInfo() {
		System.out.println("���� �ݾ�: "+this.money+"��");
	}
}
