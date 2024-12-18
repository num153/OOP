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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufact() {
        return manufact;
    }

    public void setManufact(String manufact) {
        this.manufact = manufact;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("\n============\nProduct %s\nID: %s\nName: %s\nDesciption: %s\nManufacturer: %s\nPrice: %.2f̀̀̀̀̀̀̀", quantity,id,name,description,
                manufact,price);
    }
    
    
    
}
