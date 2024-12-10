/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.sachvadia;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Product p = new Product("xx-090", "cu quen", "anh vay di", "cty mtp", 5000);
        Book p2 = new Book(500,"xx-034", "cu uuuuen", "anh vay di", "cty mtp", 5000);
        Cd p3 = new Cd(60,"xx-340", "ctytyuen", "anh vay di", "cty mtp", 5000);
        ProductsManager arr = new ProductsManager();
        arr.add(p);
        arr.add(p2);
        arr.add(p3);
        System.out.println(arr);
    }
}
