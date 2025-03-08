package org.lld.machineState;

import org.lld.enums.Coin;
import org.lld.enums.Note;
import org.lld.product.Product;
import org.lld.vendingMachine.VendingMachine;

public class DispenseState implements VendingMachineState {

    private final VendingMachine vendingMachine;
    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
       System.out.println("Product already selected.Please collect the product");
    }

    @Override
    public void insertCoin(Coin coin) {
      System.out.println("Payment already done.Collect the product");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Payment already done.Collect the product");

    }

    @Override
    public void dispenseProduct() {
//           vendingMachine.setState(vendingMachine.getReadyState());
           Product product = vendingMachine.getSelectedProduct();
           vendingMachine.getInventory().updateQuantity(product,vendingMachine.getInventory().getQuantity(product) - 1);
           System.out.println("Product Dispensed: " + product.getName());
           vendingMachine.setState(vendingMachine.getReturnChangeState());
    }

    @Override
    public void returnChange() {
          System.out.println("Please collect the dispensed product first.");
    }
}


/*
 📝 Correct State Transition Flow
1️⃣ IdleState → ReadyState (User selects a product)
2️⃣ ReadyState → DispenseState (After successful payment)
3️⃣ DispenseState → ReturnChangeState (Product is dispensed)
4️⃣ ReturnChangeState → IdleState (Reset the machine for the next user)

 */