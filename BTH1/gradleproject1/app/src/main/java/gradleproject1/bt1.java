
package gradleproject1;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.println("Xin chao " + name + " tuoi " + age);
        
    }
    
}
