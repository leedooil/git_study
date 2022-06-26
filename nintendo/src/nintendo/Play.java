package nintendo;

public class Play {
	public static void main(String[] args) {
		NintendoSwitch nintendoSwitch = new NintendoSwitch();
		
		AnimalCross aniCross = new AnimalCross();
		Zelda zelda = new Zelda();
		SuperMario superMario = new SuperMario();
		
		nintendoSwitch.palyGame();
		
		nintendoSwitch.powerOn();
		nintendoSwitch.checkChip();
		
		nintendoSwitch.setChip(aniCross);
		nintendoSwitch.checkChip();
		
		nintendoSwitch.palyGame();
		nintendoSwitch.exitGame();
	}
}
