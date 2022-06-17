package nintendo;

public class Zelda {
    private String name = "젤다 : 야생의 숨결";
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
