package org.lld.inventoryManagement;

import org.lld.product.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {

      private final Map<Product,Integer> products;
      public Inventory(){
          products = new ConcurrentHashMap<>();
      }
      public void addProducts(Product product , int quantity){
          products.put(product, quantity);
      }
      public void removeProduct(Product product){
          products.remove(product);
      }
      public void updateQuantity(Product product, int quantity){
          products.put(product, quantity);
      }
      public int getQuantity(Product product){
          return products.getOrDefault(product, 0);
      }
      public boolean isAvailable(Product product){
          return products.containsKey(product) && products.get(product) > 0;
      }

}
