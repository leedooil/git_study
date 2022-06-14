package day42;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("현재 실행되고 있는 스레드의 이름: "+Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 스레드의 상태: "+Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 스레드의 우선순위: "+Thread.currentThread().getPriority());
	}

}
