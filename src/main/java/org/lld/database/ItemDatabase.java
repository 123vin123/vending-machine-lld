package org.lld.database;

import org.lld.items.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemDatabase {

    private Map<String , Item>items = new HashMap<>();
    public void addItem(Item item) {
          items.put(item.getCode(), item);
    }
    // to fetch the item from the database
    public Item getItem(String itemCode){
        return items.get(itemCode);
    }
}
