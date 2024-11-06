public class Main {
    public static void main(String[] args) {
        product p = new product(555, "Shapoo", 5, 7);
        product t = new product(66, "Phone", 4, 4);
        product y = new product(11, "Knife", 8, 300);
        p.displayInfo();
        p.updateQuantity(100);
        p.displayInfo();
        double x = p.calcPrice();
        System.out.println("\nPrice: " + x);
        InventoryManager arr = new InventoryManager();

        arr.addProduct(p);
        arr.addProduct(t);
        arr.addProduct(y);

        arr.displayAll();

        // Tìm kiếm sản phẩm theo ID
        product foundProduct = arr.findById(66);
        if (foundProduct != null) {
            System.out.println("Product ID 66 found: ");
            foundProduct.displayInfo();
        } else {
            System.out.println("Product ID 66 not found.");


    }
    } }
