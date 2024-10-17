/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;
import java.util.Scanner;
public class bt5 {

    final static int MAX = 100;
    static Scanner sc = new Scanner(System.in);
    static void nhapMang(int[]a, int n){
        for(int i=0;i<n;i++){
            System.out.printf("arr[%d]:",i+1);
            a[i] = sc.nextInt();
        }
    }
    static void xuatMang(int[]a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static int sumPrime(int[] a,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(bt4.isPrime(a[i])){
//                sum+=sum;
                  sum+=a[i];            }
        }
        return sum;
    }
    static void indexReturn(int[]a, int n, int x){
        for(int i = 0;i<n;i++){
            if(a[i] == x){
                System.out.printf("\nVi tri cua %d tai a[%d]",x,i);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] a=  new int[MAX];
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        nhapMang(a, n);
        xuatMang(a,n);
        System.out.printf("Tong cac so nguyen to: %d", sumPrime(a,n));
        indexReturn(a, n, 4);
}
}