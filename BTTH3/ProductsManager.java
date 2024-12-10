/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.sachvadia;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ProductsManager {
    private ArrayList<Product> prodList;

    public ProductsManager() {
        prodList = new ArrayList<>();
    }
    
    //them
    public void add(Product p){
        prodList.add(p);
        System.out.println("Added !");
    }
    
     @Override
    public String toString(){
        StringBuilder buider = new StringBuilder();
        prodList.forEach(p -> {
            buider.append(p);
        });
        return buider.toString();
    }
}
