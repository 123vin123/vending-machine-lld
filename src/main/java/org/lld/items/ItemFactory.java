package org.lld.items;

public class ItemFactory {

    public static Item createItem(String type, String code, double price,int quantity){
           if(type.equalsIgnoreCase("snack")){
               return new SnackItem(code,price,quantity);
           }
           else if(type.equalsIgnoreCase("drink")){
               return new DrinkItem(code,price,quantity);
           }
           else{
               throw new IllegalArgumentException("Sorry this item is not present!");
           }
    }

}
