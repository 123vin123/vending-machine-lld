package org.lld.machineState;

import org.lld.enums.Coin;
import org.lld.enums.Note;
import org.lld.product.Product;
import org.lld.vendingMachine.VendingMachine;

public class IdleState implements VendingMachineState {
  private final VendingMachine vendingMachine;

  public IdleState(VendingMachine  vendingMachine){
      this.vendingMachine = vendingMachine;
  }
    @Override
    public void selectProduct(Product product) {
         if(vendingMachine.getInventory().isAvailable(product)){
                vendingMachine.setSelectedProduct(product);
                vendingMachine.notifyObservers("Product selected successfully.");
                vendingMachine.setState(vendingMachine.getReadyState());
                System.out.println("Product Selected: " + product.getName());
         }
         else{
             System.out.println("Product Not available currently " + product.getName());
         }
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please select product first");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please select product first");

    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select product first and make payment");

    }

    @Override
    public void returnChange() {
        System.out.println("No change to return");

    }
}