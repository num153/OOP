/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.bth;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(3,5);
        
        DsPhanSo ds = new DsPhanSo();
        ds.themPhanSo();
        ds.themPhanSo(p1);
        ds.show ();
        System.out.println("\n===========");
        PhanSo tong = ds.tong();
        tong.hienThi();
        ds.xoaPhanSo(p1);
        ds.show ();
    }
}
