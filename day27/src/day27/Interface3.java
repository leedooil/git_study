package day27;

public class Interface3 {

	public static void main(String[] args) {
		TourGuide guide=new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();

	}

}
interface Providable{
	void leisureSports();
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{

	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
		
	}
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
		
	}
	public void food() {
		System.out.println("전주 비빔밥 투어");
		
	}
	
}
class JapanTour implements Providable{

	public void leisureSports() {
		System.out.println("도쿄 타워 번지점프 투어");
	}

	public void sightseeing() {
		System.out.println("오사카 관람투어");
	}

	public void food() {
		System.out.println("초밥 투어");
	}
	
}

class TourGuide{
//	private Providable tour = new KoreaTour();
	private Providable tour = new JapanTour();
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
	
}





