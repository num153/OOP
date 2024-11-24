/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heheh;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(3,5);
        DsPhanSo ds = new DsPhanSo();

        ds.them(new PhanSo(1, 2));
        ds.them(new PhanSo(3, 4));
        ds.them(new PhanSo(5,5)); 
        ds.them(new PhanSo(2, 5)); 

        System.out.println("Danh sach ban dau:"+ds);

        PhanSo tong = ds.tong();
        System.out.println(tong);

        ds.sapXep();
        System.out.println("Ds sau khi sap xep:"+ds);
    }
}
