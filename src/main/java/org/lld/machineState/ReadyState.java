package org.lld.machineState;

import org.lld.enums.Coin;
import org.lld.enums.Note;
import org.lld.product.Product;
import org.lld.vendingMachine.VendingMachine;

public class ReadyState implements VendingMachineState {
    private final VendingMachine vendingMachine;
    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
         System.out.println("Product already selected. Please make Payment");
    }

    @Override
    public void insertCoin(Coin coin) {
           vendingMachine.addCoin(coin);
           System.out.println("Coin inserted: " + coin);
           checkPaymentStatus();
    }

    @Override
    public void insertNote(Note note) {
         vendingMachine.addNote(note);
         System.out.println("Note inserted: " + note);
         checkPaymentStatus();
    }

    @Override
    public void dispenseProduct() {
       System.out.println("Please make payment first.");
    }


    @Override
    public void returnChange() {
        System.out.println("Please make payment first.");

    }

    public void checkPaymentStatus() {
        if(vendingMachine.getTotalPayment() >= vendingMachine.getSelectedProduct().getPrice()){
            vendingMachine.notifyObservers("Payment completed. Moving to the dispense State");
            vendingMachine.setState(vendingMachine.getDispenseState());
        }
    }
}
