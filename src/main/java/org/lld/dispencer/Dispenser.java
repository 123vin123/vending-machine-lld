package org.lld.dispencer;

import org.lld.items.Item;

public class Dispenser {

    // it is just like a box
    public void dispenseItem(Item item){
        System.out.println("Dispensing the item:" + item.getCode());
    }

}
