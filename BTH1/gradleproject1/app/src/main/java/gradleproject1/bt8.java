
package gradleproject1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, secretNum;
        secretNum = (int)(Math.random()*100)+1; //0.0 -> 1.0 phai *100 (khoang tu 1-100)
        do {
            System.out.println("Nhap: ");
            n = sc.nextInt();
            if(n>secretNum){
                System.out.println("So ban doan lon hon");
            }else if(n<secretNum){
                System.out.println("So ban doan nho hon");
            }else{
                System.out.println("Ban da dung!");
            }
        }while(n!=secretNum);
        
    }
}
