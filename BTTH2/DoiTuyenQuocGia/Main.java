/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.vdv;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        DoiTuyenQuocGia team = new DoiTuyenQuocGia("C:\\Users\\ASUS\\Downloads\\VanDongVien.txt");
        System.out.println(team);
        System.out.println("--------------Search clb----------");
        team.findByClb("clb viettel");
        System.out.println("--------------Search position & clb----------");
        team.findByPos("tien ve").findByClb("clb viettel");
        DoiTuyenQuocGia a = team.findByPos("tien ve");
        System.out.println(a);
    }
}
