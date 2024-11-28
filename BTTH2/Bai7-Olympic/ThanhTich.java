/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.bth;

/**
 *
 * @author admin
 */
public class ThanhTich {
    private String tenNuoc;
    private int vang;
    private int bac;
    private int dong;

    public ThanhTich() {
    }
    public ThanhTich(String tenNuoc, int vang, int bac, int dong) {
        this.tenNuoc = tenNuoc;
        this.vang = vang;
        this.bac = bac;
        this.dong = dong;
    }

    @Override
    public String toString() {
        return String.format("\nVang: %d - Bac: %d - Dong: %d",vang,bac,dong);
    }
    
    
}
