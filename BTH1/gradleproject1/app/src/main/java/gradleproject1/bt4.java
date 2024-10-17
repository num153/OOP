/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradleproject1;

import java.util.Scanner;


public class bt4 {
            
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i = 2;i<=Math.sqrt((double)n);i++){
                if(n%i==0){
                    return false;
                }
        }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Check Prime Number (nhap vao): ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.printf("%d la so nguyen to",num);
        }else{
            System.out.printf("%d khong la so nguyen to",num);
}
    
}
}
        
 
