package javaSnacks;

public class MainFile {

    private static void workWithData(){

        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        VendingMachine ven1 = new VendingMachine("Food");
        VendingMachine ven2 = new VendingMachine("Drink");
        VendingMachine ven3 = new VendingMachine("Office");

        Snacks snk1=  new Snacks("Chips", 36, 1.75, ven1.getId());
        Snacks snk2 = new Snacks("Chocolate Bar", 36, 1.00, ven1.getId());
        Snacks snk3 = new Snacks("Pretzel", 30, 2.00, ven1.getId());
        Snacks snk4 = new Snacks("Soda", 24, 2.50, ven2.getId());
        Snacks snk5 = new Snacks("Water", 20, 2.75, ven2.getId());
        
        // global variables that needs to be printed each time
        double totalCost;
        double cashOnHand;
        int quantity;

        //customer 1- Jane buys 3 of snack 4(soda)
        totalCost = snk4.totalCost(3, snk4.getCost());
        cashOnHand = cust1.purchaseSnacks(totalCost);
        quantity = snk4.buySnack(3);
        System.out.println("Customer " + cust1.getId() + "cash on hand " + cashOnHand);
        System.out.println("Quantity of snack" +  snk4.getId() + "is" + quantity);
    
        //customer 1 buys 1 of snack 3(pretzel)
        totalCost = snk3.totalCost(1, snk3.getCost());
        cashOnHand = cust1.purchaseSnacks(totalCost);
        quantity = snk3.buySnack(1);
        System.out.println("Customer " + cust1.getId() + "cash on hand " + cashOnHand);
        System.out.println("Quantity of snack" +  snk3.getId() + "is" + quantity);

        //customer 2 buys 2 of snack 4
        totalCost = snk4.totalCost(2, snk4.getCost());
        cashOnHand = cust2.purchaseSnacks(totalCost);
        quantity = snk4.buySnack(2);
        System.out.println("Customer " + cust2.getId() + "cash on hand " + cashOnHand);
        System.out.println("Quantity of snack" +  snk4.getId() + "is" + quantity);

        //customer 1 finds $10.00
        cashOnHand = cust1.cash(10);
        System.out.println("Customer " + cust1.getId() + "cash on hand " + cashOnHand);

        //Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar)
        totalCost = snk2.totalCost(1, snk2.getCost());
        cashOnHand = cust1.purchaseSnacks(totalCost);
        quantity = snk2.buySnack(1);
        System.out.println("Customer " + cust1.getId() + "cash on hand " + cashOnHand);
        System.out.println("Quantity of snack" +  snk2.getId() + "is" + quantity);

        //Add 12 more items to snack 3 (Pretzel)
        quantity = snk3.totalQuantity(12);
        System.out.println("Quantity of snack" +  snk3.getId() + "is" + quantity);

        //Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        totalCost = snk3.totalCost(3, snk3.getCost());
        cashOnHand = cust2.purchaseSnacks(totalCost);
        quantity = snk3.buySnack(3);
        System.out.println("Customer " + cust2.getId() + "cash on hand " + cashOnHand);
        System.out.println("Quantity of snack" +  snk3.getId() + "is" + quantity);

    }
   
    
public static void main (String args[]){
    workWithData();
}












}