package nintendo;

public class AnimalCross {

    private String name = "놀러와요 동물의 숲";
    public String getName(){
        return name;
    }

    public void launch(){
        System.out.println(name+"을 실행했습니다.");
    }

    public void exit() {
        System.out.println(name+"을 종료했습니다.");

    }
}
