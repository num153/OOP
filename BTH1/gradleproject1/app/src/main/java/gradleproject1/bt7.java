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
public class bt7 {
    static Scanner sc = new Scanner(System.in);
    static int upperCaseCount(String s){
        int c = 0;
        for(int i=0;i<s.length()-1;i++){
            if(Character.isUpperCase(s.charAt(i))){
                c++;
            }
        }
        return c;
    }
    
    public static void main(String[] args) {
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("Nhap ten lot: ");
        String tenlot = sc.nextLine();
        System.out.println("Nhap ho: ");
        String ho = sc.nextLine();
        String fullname = ho + tenlot + ten;
        System.out.printf("xin chao, " + fullname);
        System.out.println("So ki tu in hoa:" + upperCaseCount(fullname));
        
    }
}
