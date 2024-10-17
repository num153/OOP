/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        int r = sc.nextInt();
        double dienTich = Math.pow( (double) r, 2)*Math.PI;
        double chuVi = 2*r*Math.PI;
        System.out.printf("Dien tich: %08.3f \n",dienTich); //lay 8 ki tu bao gom ca dau cham, neu it hon 8 thi se thay bang so 0
        System.out.printf("Chu vi: %08.3f \n",chuVi);
    }
    
}
