package javaSnacks;

public class VendingMachine {
    //fields
    private int maxId = 0;
    private int id;
    String name;

    public VendingMachine(String name){
        maxId++;
        id = maxId;
        this.name = name;

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

}