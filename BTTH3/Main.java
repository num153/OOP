/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.sachvadia;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Product p = new Product("xx-090", "cu quen", "anh vay di", "cty jacjac", 5000);
        Book p2 = new Book(500,"xo-034", "cu uuuuen", "anh vay di", "cty mtp", 8000);
        Cd p3 = new Cd(60,"xx-340", "ctytyuen", "anh vay di", "cty 555", 1000);
        ProductsManager arr = new ProductsManager();
        arr.add(p);
        arr.add(p2);
        arr.add(p3);
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("6. Xem danh sách sản phẩm");
            System.out.println("7. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Type (Book/Disk): ");
                    String type = sc.nextLine();
                    System.out.print("id: ");
                    String id = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Description: ");
                    String description = sc.nextLine();
                    System.out.print("Manufacturer: ");
                    String manufacturer = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    if (type.equalsIgnoreCase("Book")) {
                        System.out.print("Page number: ");
                        int totalPages = sc.nextInt();
                        arr.add(new Book(totalPages,id, name, description, manufacturer, price));
                    } else if (type.equalsIgnoreCase("Cd")) {
                        System.out.print("Duration: ");
                        int duration = sc.nextInt();
                        arr.add(new Cd(duration,id, name, description, manufacturer, price));
                    } else {
                        System.out.println("Invalid!");
                    }
                    break;
                case 3:
                    System.out.print("Id for update product: ");
                    String updateId = sc.nextLine();
                    System.out.print("New name: ");
                    String newName = sc.nextLine();
                    System.out.print("New des: ");
                    String newDescription = sc.nextLine();
                    System.out.print("New price: ");
                    double newPrice = sc.nextDouble();
                    if (arr.updateProduct(updateId, newName, newDescription, newPrice)) {
                        System.out.println("Update!");
                    } else {
                        System.out.println("Id not found");
                    }
                    break;
                 case 4:
                    System.out.println("1. by id");
                    System.out.println("2. by price range");
                    System.out.print("search by: ");
                    int searchChoice = sc.nextInt();
                    sc.nextLine();
                    if (searchChoice == 1) {
                        System.out.print("keyword: ");
                        String keyword = sc.nextLine();
                        arr.search(keyword);
                    } else if (searchChoice == 2) {
                        System.out.print("min: ");
                        double minPrice = sc.nextDouble();
                        System.out.print("max: ");
                        double maxPrice = sc.nextDouble();
                        arr.searchProductByPriceRange(minPrice, maxPrice);
                    } else {
                        System.out.println("Invalid!");
                    }
                    break;
                case 5:
                    arr.sortPriceDes();
                    System.out.println("Sorted babe!");
                    break;
                case 6:
                    System.out.println(arr);
                    break;
                default:
                    System.out.println("Try again baby!!!");
                    break;              
            }
            
        }while(choice != 7);
    }
}
