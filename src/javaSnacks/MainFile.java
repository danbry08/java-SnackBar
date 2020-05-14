package javaSnacks;

public class MainFile {

    private static void workWithData(){

        Customer cust1 = new Customer("Jane", 45.25);
        //Customer cust2 = new Customer("Bob", 33.14);

        // VendingMachine ven1 = new VendingMachine("Food");
         VendingMachine ven2 = new VendingMachine("Drink");
        // VendingMachine ven3 = new VendingMachine("Office");

        //Snacks snk1=  new Snacks("Chips", 36, 1.75, "Food");
        //Snacks snk2 = new Snacks("Chocolate Bar", 36, 1.00, "Food");
        //Snacks snk3 = new Snacks("Pretzel", 30, 2.00, "Food");
        Snacks snk4 = new Snacks("Soda", 24, 2.50, "Drink");
        //Snacks snk5 = new Snacks("Water", 20, 2.75, "Drink");

        //customer 1- Jane buys 3 of snack 4(soda)
        //print Jane's cash on hand
        // get the total cost using totalCost method (from Snacks)
        double totalCost = snk4.totalCost(3, snk4.getCost());
        // pass in total cost to the purchaseSnacks method (from customer)
        double cashOnHand = cust1.purchaseSnacks(totalCost);
        System.out.println(cust1 + " now has $" + cashOnHand);

        //print quantity of snack 4(soda)

    


    }
   
    













}