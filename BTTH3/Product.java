/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nam.sachvadia;

public class Product {
    private static int count=0;
    private String quantity;
    private String id;
    private String name;
    private String description;
    private String manufact;
    private double price;

    public Product() {
    }

    public Product(String id, String name, String description, String manufact, double price) {
        this.quantity = String.format("No.%04d",++count);
        this.id = id;
        this.name = name;
        this.description = description;
        this.manufact = manufact;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\n============\nProduct %s\nID: %s\nName: %s\nDesciption: %s\nManufacturer: %s\nPrice: %.2f̀̀̀̀̀̀̀", quantity,id,name,description,
                manufact,price);
    }
    
    
    
}
