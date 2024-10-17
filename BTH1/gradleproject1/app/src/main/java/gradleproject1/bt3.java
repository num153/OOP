/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bt3 {
    public static void main(String[] args) {
        System.out.println("Nhap thang (1-12): ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch(month){
            case 2:
                System.out.printf("Thang %d co 28 ngay\n",month);
                break;
            case 4,6,9,11:
                System.out.printf("Thang %d co 30 ngay\n",month);
                break;
            case 1,3,5,7,8,12:
                System.out.printf("Thang %d co 31 ngay\n",month);
                break;
            default:
                System.out.printf("Thang %d khong hop le\n",month);
                break;
        }
    }
    
}
