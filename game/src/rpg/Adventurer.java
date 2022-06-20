package rpg;

public class Adventurer {

    private String name;

    private Sword sword = null;

    public void setSword(Sword sword){
        this.sword = sword;

    }

    public Adventurer(String name){
        this.name = name;
    }

    public void check(){
        System.out.println("제 이름은 "+name+"입니다.");
        if(sword==null){
            System.out.println("저는 무기가 따로 없습니다.");
            return;
        }
        System.out.println("저는"+sword.getName()+"를 지니고 있습니다.");
    }
    public void attack(){
        if(sword==null){
            System.out.println("맨손을 휘둘렀습니다.");

        } else{
            System.out.println(sword.getName()+"을/를 휘둘렀습니다.");
        }
    }

}
