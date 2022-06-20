package rpg;

public class Field {
    public static void main(String[] args) {
        Adventurer adventurer = new Adventurer("짱구");
        adventurer.check();
        adventurer.attack();

        Sword sword = new Sword("야구방망이");

        adventurer.setSword(sword);
        adventurer.check();
        adventurer.attack();
    }
}
