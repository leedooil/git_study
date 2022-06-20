package rpg;

public class Sword {

    private String name;
    public Sword(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void attack(){
        System.out.println(name+"을/를 취득하였습니다.");
    }
}
