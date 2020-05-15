package javaSnacks;

public class Snacks {
    // fields
    private int maxId = 0;
    private int id;
    String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public static void main(String[] args) {

    }

    public Snacks(String name, int quantity, double cost, int vendingMachineId) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int totalQuantity(int newQuantity) {
        return quantity = quantity + newQuantity;
    }

    public int buySnack(int snackQuantity) // double check
    {
        return quantity = quantity - snackQuantity;
    }

    public double totalCost(int quantity, double cost) {
        double totalCost = quantity * cost;
        return totalCost;
    }

}
