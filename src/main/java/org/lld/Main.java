package org.lld;

import org.lld.displayObserver.Display;
import org.lld.displayObserver.Observer;
import org.lld.enums.Coin;
import org.lld.enums.Note;
import org.lld.product.Product;
import org.lld.vendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {

        VendingMachine vendingMachine = VendingMachine.getInstance();
        Observer display = new Display();
        vendingMachine.addObserver(display);
        Product coke = new Product("Coke",1.5);
        Product pepsi = new Product("Pepsi", 1.5);
        Product water = new Product("Water", 1.0);
        vendingMachine.getInventory().addProducts(coke,5);
        vendingMachine.getInventory().addProducts(pepsi,1);
        vendingMachine.getInventory().addProducts(water,1);

        vendingMachine.selectProduct(coke);
        vendingMachine.insertNote(Note.TEN);
//        vendingMachine.insertCoin(Coin.QUARTER);
        vendingMachine.dispenseProduct();
        vendingMachine.returnChange();
    }
}
