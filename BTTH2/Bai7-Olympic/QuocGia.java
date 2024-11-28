/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.bth;

/**
* ten nc, thu do, dan so, dien tich
* toString override
* tao lop thanh tich co attr
* int soVang, soBac, soDong, string tenNc
* String.format("Vang %d bac %d dong %d)
* tao lop Olympic
* arraylist<Quocgia>
* arraylist<thanhtich>
* constructor(String path file 1, file 2)
* khai bao 2 danh sach rong
* try catch
* file f = file(pathQG)
* scanner(f)
* sc.nextline()bo qua dong dau tien
* while(sc.hasNextLine()) Sring line = sc.nextLine()
* tach ra luu vao mang Sitrng[]a=sc.line.split(')
* QuocGia q=new QuocGia(a[0],a[1],Integer.parseInt(a[2,a[3)
* ngoai while arr.add(q)
* ===========thanh tich thi tuong tu
* bo qua 2 dong dau
* String line=nextLine
* String[]arrTenNuoc=line.split(,)
* for(int i=0->20)
* line = sc.nextline
* string[]in4=line.trim().split(,)
* ThanhTich tt = new ThanhTich(arrTenNuoc[i],integer.parseInt(in4[0,1,2
* ngoai for thi arrTT.add(tt)
* 
* toSring Stringbuider
* arr.forEach(qp->buider.append(qp)
* return 
* 
* 
* main OlympicTyo ot = new Olympic("path,path")
* sout(ot)
* 
* 
* ==========tim kiem
 */
public class QuocGia {
    private String tenNuoc;
    private String thuDo;
    private int danSo;
    private int dienTich;

    public QuocGia() {
    }

    public QuocGia(String tenNuoc, String thuDo, int danSo, int dienTich) {
        this.tenNuoc = tenNuoc;
        this.thuDo = thuDo;
        this.danSo = danSo;
        this.dienTich = dienTich;
    }
    

    @Override
    public String toString() {
        return String.format("\n=========\nTen nuoc: %s\nThu do: %s\nDan so: %d\nDien tich: %d",tenNuoc,thuDo,danSo,dienTich);
    }
    

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public String getThuDo() {
        return thuDo;
    }

    public void setThuDo(String thuDo) {
        this.thuDo = thuDo;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
    
}
