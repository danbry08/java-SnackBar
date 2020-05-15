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
        System.out.println("Customer  "  + cust1.getName() + " cash on hand $" + String.format("%.2f", cashOnHand));
        System.out.println("Quantity of snack " +  snk4.getName() + " is " + quantity);
        System.out.println();
    
        //customer 1 buys 1 of snack 3(pretzel)
        totalCost = snk3.totalCost(1, snk3.getCost());
        cashOnHand = cust1.purchaseSnacks(totalCost);
        quantity = snk3.buySnack(1);
        System.out.println("Customer  "  +  cust1.getName() + " cash on hand $" + String.format("%.2f", cashOnHand));
        System.out.println("Quantity of snack " +  snk3.getName() + " is " + quantity);
        System.out.println();

        //customer 2 buys 2 of snack 4
        totalCost = snk4.totalCost(2, snk4.getCost());
        cashOnHand = cust2.purchaseSnacks(totalCost);
        quantity = snk4.buySnack(2);
        System.out.println("Customer " + cust2.getName() + " cash on hand $" + String.format("%.2f", cashOnHand));
        System.out.println("Quantity of snack " +  snk4.getName() + " is " + quantity);
        System.out.println();

        //customer 1 finds $10.00
        cashOnHand = cust1.cash(10);
        System.out.println("Customer " + cust1.getName() + " cash on hand$ $" + String.format("%.2f", cashOnHand));
        System.out.println();

        //Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar)
        totalCost = snk2.totalCost(1, snk2.getCost());
        cashOnHand = cust1.purchaseSnacks(totalCost);
        quantity = snk2.buySnack(1);
        System.out.println("Customer " + cust1.getName() + " cash on hand $" + String.format("%.2f", cashOnHand));
        System.out.println("Quantity of snack " +  snk2.getName() + " is " + quantity);
        System.out.println();

        //Add 12 more items to snack 3 (Pretzel)
        quantity = snk3.totalQuantity(12);
        System.out.println("Quantity of snack " +  snk3.getName() + " is " + quantity);
        System.out.println();

        //Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        totalCost = snk3.totalCost(3, snk3.getCost());
        cashOnHand = cust2.purchaseSnacks(totalCost);
        quantity = snk3.buySnack(3);
        System.out.println("Customer " + cust2.getName() + " cash on hand $" + String.format("%.2f", cashOnHand));
        System.out.println("Quantity of snack " +  snk3.getName() + " is " + quantity);
        System.out.println();

        //STRETCH GOALS

        //Display each snack with Name, Vending Machine Name, Quantity on Hand
        //total cost of all of the quantities of this snack on hand

        String name;
        String vendingMachineName;
        double totalCostOfQuantities;

        name = snk1.getName();
        vendingMachineName = ven1.getName();
        quantity = snk1.getQuantity();
        totalCostOfQuantities = quantity * snk1.getCost();

        //snack 1
        System.out.println("Snack: " + name);
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantities));
        System.out.println();

        //snack 2
        name = snk2.getName();
        vendingMachineName = ven1.getName();
        quantity = snk2.getQuantity();
        totalCostOfQuantities = quantity * snk2.getCost();
        System.out.println();

        System.out.println("Snack: " + name);
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantities));

        //snack 3
        name = snk3.getName();
        vendingMachineName = ven1.getName();
        quantity = snk3.getQuantity();
        totalCostOfQuantities = quantity * snk3.getCost();
        System.out.println();

        System.out.println("Snack: " + name);
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantities));
        System.out.println();

        //snack 4
        name = snk4.getName();
        vendingMachineName = ven2.getName();
        quantity = snk4.getQuantity();
        totalCostOfQuantities = quantity * snk4.getCost();
        System.out.println();

        System.out.println("Snack: " + name);
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantities));
        System.out.println();

        //snack 5
        name = snk5.getName();
        vendingMachineName = ven2.getName();
        quantity = snk5.getQuantity();
        totalCostOfQuantities = quantity * snk5.getCost();

        System.out.println("Snack: " + name);
        System.out.println("Vending Machine: " + vendingMachineName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + String.format("%.2f", totalCostOfQuantities));
        System.out.println();

    }
   
    
public static void main (String args[]){
    workWithData();
}












}