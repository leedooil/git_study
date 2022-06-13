package mcdonald;

public class Counter {

    private int balance = 0;

    public void checkBalance() {
        System.out.println("현재 카운터의 잔액은" + balance + "원 입니다.");
    }

    public int settlement(int amount){
        if(balance<amount){
            System.out.println("카운터 안의 금액보다 더 많은 돈은 정산할 수 없습니다.");
            return 0;
        }
        balance-=amount;
        return amount;
    }

    public void purchase(Customer customer, Chips chips, int amount) {
        int currentTotalAmount = chips.price * amount;
        int ownMoney = customer.getOwnMoney();

        if (ownMoney < currentTotalAmount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance += currentTotalAmount;
        customer.setOwnMoney(ownMoney - currentTotalAmount);
        customer.setInventory(customer.getInventory() + Chips.name);

        System.out.println(customer.getName() + "님이" + Chips.name + "을/를" + amount + "개 만큼 구매했고," + currentTotalAmount + "원 나왔습니다.");
    }

    public void purchase(Customer customer, Hamberger hamberger, int amount) {
        int currentTotalAmount = hamberger.price * amount;
        int ownMoney = customer.getOwnMoney();

        if (ownMoney < currentTotalAmount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance += currentTotalAmount;
        customer.setOwnMoney(ownMoney - currentTotalAmount);
        customer.setInventory(customer.getInventory() + Hamberger.name);

        System.out.println(customer.getName() + "님이" + Hamberger.name + "을/를" + amount + "개 만큼 구매했고," + currentTotalAmount + "원 나왔습니다.");


    }

    public void purchase(Customer customer, Soda soda, int amount) {
        int currentTotalAmount = soda.price * amount;
        int ownMoney = customer.getOwnMoney();

        if (ownMoney < currentTotalAmount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance += currentTotalAmount;
        customer.setOwnMoney(ownMoney - currentTotalAmount);
        customer.setInventory(customer.getInventory() + Soda.name);

        System.out.println(customer.getName() + "님이" + Soda.name + "을/를" + amount + "개 만큼 구매했고," + currentTotalAmount + "원 나왔습니다.");

    }
}
