package mcdonald;

public class Customer {

    private String name;
    private int ownMoney;

    private String inventory="";

    public Customer(String name, int ownMoney){
        this.name=name;
        this.ownMoney=ownMoney;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public int getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(int ownMoney) {
        this.ownMoney = ownMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
