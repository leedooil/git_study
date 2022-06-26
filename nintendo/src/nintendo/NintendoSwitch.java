package nintendo;

public class NintendoSwitch {

	private boolean power = false;
	private AnimalCross game1;
	private Zelda game2;
	private SuperMario game3;

	public void powerOn() {
		if (power) {
			System.out.println("이미 전원이 켜져있습니다.");
			return;

		}
		power = true;
		System.out.println("닌텐도 스위치 전원을 켰습니다.");

	}

	public void powerOff() {
		if (!power) {
			System.out.println("이미 전원이 꺼져있습니다.");
			return;
		}
		power = false;
		System.out.println("닌텐도 스위치의 전원을 껐습니다.");
	}

	public void checkChip() {
		if (!power) {
			System.out.println("닌텐도의 전원을 먼저 켜주시기 바랍니다.");
			return;
		}
		if (game1 != null) {
			System.out.println("현재 장착되어 있는 칩은" + game1.getName() + "입니다.");

		} else if (game2 != null) {
			System.out.println("현재 장착되어 있는 칩은" + game2.getName() + "입니다.");
		} else if (game3 != null) {
			System.out.println("현재 장착되어 있는 칩은" + game3.getName() + "입니다.");
		} else {
			System.out.println("현재 칩이 장착되어 있지 않습니다.");
		}
	}

	public void removeChip() {
		game1 = null;
		game2 = null;
		game3 = null;
		System.out.println("게임기에 장착되어있던 칩을 제거 했습니다.");
	}

	public void setChip(AnimalCross animalcross) {
		game1 = animalcross;
		game2 = null;
		game3 = null;
		System.out.println(animalcross.getName() + "을/를 장착했습니다.");
	}

	public void setChip(Zelda zelda) {
		game1 = null;
		game2 = zelda;
		game3 = null;
		System.out.println(zelda.getName() + "을/를 장착했습니다.");
	}

	public void setChip(SuperMario superMario) {
		game1 = null;
		game2 = null;
		game3 = superMario;
		System.out.println(superMario.getName() + "을/를 장착했습니다.");
	}

	public void palyGame() {
		if(!power) {
			System.out.println("닌텐도의 전원을 먼저 켜주시기 바랍니다.");
			return;
		}
		if(game1 != null) {
			game1.launch();
		}else if(game2 != null) {
			game2.launch();
		}else if(game3 !=null) {
			game3.launch();
		}else {
			System.out.println("현재 칩이 장착되어있지 않습니다.");
		}
	}
	public void exitGame() {
		if(!power) {
			System.out.println("닌텐도 전원을 먼저 켜주시기 바랍니다.");
			return;
		}
		if(game1 != null) {
			game1.exit();
		}else if(game2 != null) {
			game2.exit();
		}else if(game3 !=null) {
			game3.exit();
		}else {
			System.out.println("현재 칩이 장착되어있지 않습니다.");
		}
	}

}
