/*

📝 Correct State Transition Flow
1️⃣ IdleState → ReadyState (User selects a product)
2️⃣ ReadyState → DispenseState (After successful payment)
3️⃣ DispenseState → ReturnChangeState (Product is dispensed)
4️⃣ ReturnChangeState → IdleState (Reset the machine for the next user)

 */

package org.lld.vendingMachine;
import org.lld.displayObserver.Display;
import org.lld.displayObserver.Observer;
import org.lld.enums.Coin;
import org.lld.enums.Note;
import org.lld.inventoryManagement.Inventory;
import org.lld.machineState.*;
import org.lld.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private static VendingMachine instance;
    private final Inventory inventory;
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState dispenseState;
    private final VendingMachineState returnChangeState;
    private VendingMachineState currentState;
    private Product selectedProduct;

    private double totalPayment;
     private final List<Observer> observers;
    public VendingMachine(){
        inventory = new Inventory();
        observers = new ArrayList<>();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
        selectedProduct = null;
        totalPayment = 0.0;
    }
    // singleton pattern following
    public static synchronized VendingMachine getInstance(){
        if(instance == null){
            instance = new VendingMachine();
        }
        return instance;
    }

    // add observer
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    // notify observers
    public void notifyObservers(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }

    public void selectProduct(Product product){
        currentState.selectProduct(product);
    }
    public void insertCoin(Coin coin){
        currentState.insertCoin(coin);
    }
    public void insertNote(Note note){
        currentState.insertNote(note);
    }
    public void dispenseProduct(){
        currentState.dispenseProduct();
    }
    public void returnChange(){
        currentState.returnChange();
    }

    public void setState(VendingMachineState state){
        currentState = state;
    }
    public  VendingMachineState getIdleState(){
        return idleState;
    }
    public VendingMachineState getReadyState(){
        return readyState;
    }
    public VendingMachineState getDispenseState() {
        return dispenseState;
    }
    public VendingMachineState getReturnChangeState() {
        return returnChangeState;
    }
   public void resetSelectedProduct(){
        selectedProduct = null;
    }
   public void setSelectedProduct(Product product){
        selectedProduct = product;
    }
    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public double getTotalPayment() {
        return totalPayment;
    }
    public void addCoin(Coin coin){
        totalPayment += coin.getValue();
    }
    public void addNote(Note note){
        totalPayment += note.getValue();
    }
    public void resetPayment() {
        totalPayment = 0.0;
    }
    public Inventory getInventory() {
        return inventory;
    }

}