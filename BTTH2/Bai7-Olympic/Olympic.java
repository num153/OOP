/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.bth;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
tao lop Olympic
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
* arrQG.forEach(qp->buider.append(qp)
* return buider.toString(
* 
* 
* main OlympicTyo ot = new Olympic("path,path")
* sout(ot)
* 
* 
* ==========method tim kiem(String tenQG) void
* QuocGia kq = arrQG.stream.filter(
* 
* =====in ra qg co so huy chuong vang >=v
* void timkiemtheoV(int V)
* if(....cout()==0 thi k co qg nao co so vang lon hon 20
* arrTT.strema.filter( t.getSOVang >= v).forEach(t->{
* arrQG.stram.filter(q->q.getTen().equalignorecase(t.getTen).forEach(q->(
* sout(q)
* sout(t)
* =========in QG ra file(string ten, string path)
* PrintWriter w = new PrintWriter(path);
* luu y chua dong file thi no se k luu
 */
public class Olympic {
    private ArrayList<QuocGia> arrQG;
    private ArrayList<ThanhTich> arrTT;
    public Olympic(String pathQG, String pathTT){
        arrQG=new ArrayList<>();
        arrTT=new ArrayList<>();
        try{
        File f = new File(pathQG);
        Scanner sc = new Scanner(f);
        sc.nextLine(); //bo qua dong chu thich dau tien
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] a = line.split(","); //Anh,London,55,130
            QuocGia q = new QuocGia(a[0],a[1],Integer.parseInt(a[2]),Integer.parseInt(a[3]));
            arrQG.add(q);
        }
    }catch(IOException ex){
            System.out.println(ex.getMessage());
    }
        try{
            File f = new File(pathTT);
            Scanner sc = new Scanner(f);
            sc.nextLine();
            sc.nextLine();
            String line = sc.nextLine(); //lay dong dau tien la cac quoc gia
            String[] arrTenNuoc = line.split(",");
            for(int i=0;i<20;i++){
                line = sc.nextLine();
                String[] huyChuong = line.trim().split(",");
                ThanhTich tt = new ThanhTich(arrTenNuoc[i],Integer.parseInt(huyChuong[0]),Integer.parseInt(huyChuong[1]),Integer.parseInt(huyChuong[2]));
                arrTT.add(tt);
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
    @Override
        public String toString(){
            StringBuilder buider = new StringBuilder();
            arrTT.forEach(qp->buider.append(qp));       
            return buider.toString();
    }
}

