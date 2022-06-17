package nintendo;

public class SuperMario {

    private String name = "슈퍼 마리오";
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
