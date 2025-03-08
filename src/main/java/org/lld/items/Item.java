package org.lld.items;

public class Item {

    // for everyItem we have 3 things code, price, quantity

    private final String code;
    private final double price;
    private int quantity;
    // constructor
    public Item(String code, double price, int quantity){
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }



    public String getCode() {
        return code;
    }

    public void decrementQuantity() {
        quantity--;
    }

}
