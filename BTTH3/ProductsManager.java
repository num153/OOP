/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.sachvadia;

import java.util.ArrayList;
import java.util.Arrays;

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
    //them p1,p2,p3,...
    public void add(Product...p){
        this.getList().addAll(Arrays.asList(p));
    }
    //true false neu nhu muon check xoa dc hay chua
    public boolean remove(String prodName){
        Product kq = prodList.stream().filter(p -> p.getName().equalsIgnoreCase(prodName)).findFirst().orElse(null);
        return this.prodList.remove(kq);
    }
    public void search(String keyword){
        for(Product p : prodList){
            if(p.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                p.getId().toLowerCase().contains(keyword.toLowerCase())  ||
                p.getManufact().toLowerCase().contains(keyword.toLowerCase()) ){
                System.out.println(p);
            }
        }
    }
    public Product search2(String keyword){
        return this.prodList.stream().filter(p -> p.getName().equals(keyword) ||
                p.getId().equals(keyword)).findFirst().orElse(null);
    }
    public void searchProductByPriceRange(double minPrice, double maxPrice) {
        for (Product product : prodList) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }
    //su dung dau - or p2.getPrice(), p1.getPrice()
    public void sortPriceDes(){
        prodList.sort((Product p1, Product p2) -> -Double.compare(p1.getPrice(), p2.getPrice()));
    }
    
    public boolean updateProduct(String productId, String name, String description, double price) {
        for (Product product : prodList) {
            if (product.getId().equalsIgnoreCase(productId)) {
                product.setName(name);
                product.setDescription(description);
                product.setPrice(price);
                return true;
            }
        }
        return false;
    }
     @Override
    public String toString(){
        StringBuilder buider = new StringBuilder();
        prodList.forEach(p -> {
            buider.append(p);
        });
        return buider.toString();
    }
    public ArrayList<Product> getList() {
        return prodList;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Product> arr) {
        this.prodList = arr;;
    }
}
