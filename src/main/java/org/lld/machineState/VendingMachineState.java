package org.lld.machineState;

import org.lld.enums.Coin;
import org.lld.enums.Note;
import org.lld.product.Product;

public interface VendingMachineState {
     void selectProduct(Product product);
     void insertCoin(Coin coin);
     void insertNote(Note note);
     void dispenseProduct();
     void returnChange();

}
