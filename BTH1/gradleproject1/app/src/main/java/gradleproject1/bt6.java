/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;
import java.util.Scanner;

public class bt6 {
    static Scanner sc = new Scanner(System.in);
    static void nhapDaThuc(int[] a, int n){
        for(int i=0;i<n+1;i++){
            System.out.printf("He so thu %d:",i+1);
            a[i] = sc.nextInt();
        }
    }
    static void tinhDaThuc(int[] a, int n, int x){
        int sum = 0;
        for(int i=0;i<n+1;i++){
            sum+=a[i]*Math.pow(x, i);
        }
        System.out.println("KQ: " + sum);
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int[] arr = new int[100];
        nhapDaThuc(arr, n);
        System.out.println("Nhap x: ");
        int x = sc.nextInt();
        tinhDaThuc(arr, n, x);
    }
    
}
