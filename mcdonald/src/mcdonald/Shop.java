package mcdonald;

public class Shop {
    public static void main(String[] args) {

        Hamberger hamberger=new Hamberger();
        Chips chips=new Chips();
        Soda soda=new Soda();

        Value value=new Value(50000);
        value.checkAmount();

        Customer customerA=new Customer("손님A",50000);
        Customer customerB=new Customer("손님B",35000);
        Customer customerC=new Customer("손님C",15000);

        Counter counter=new Counter();
        counter.purchase(customerA,hamberger,3);
        counter.purchase(customerB,chips,5);
        counter.purchase(customerC,soda,1);

//        System.out.println(customerA.getOwnMoney());

        counter.checkBalance();
        int todayIncome= counter.settlement(52000);

        value.save(todayIncome);
        value.checkAmount();

    }
}
