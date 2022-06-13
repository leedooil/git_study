package mcdonald;

public class Value {
   private int money;
   public Value(int money){
       this.money = money;
   }
   public void save(int amount){
       money += amount;
       System.out.println(amount+"원을 입금하셨습니다.");
   }
   public void checkAmount(){
       System.out.println("현재 금고에 있는 금액은"+money+"원 입니다.");
   }
}

