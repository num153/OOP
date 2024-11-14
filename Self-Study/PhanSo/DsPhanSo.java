/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package nam.bth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    
    public void themPhanSo(PhanSo p){
        this.ds.add(p);
    }
    public void themPhanSo(){
        PhanSo p = new PhanSo();
        p.nhapPhanSo();
        this.ds.add(p);
    }
    public void themPhanSo(PhanSo ...a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void show(){
        this.ds.forEach(x ->x.hienThi());
        
    }
    public void xoaPhanSo(PhanSo p){
        this.ds.removeIf(x->x.soSanh(p)==0);
    }
    public void xoaPhanSo(int tu,int mau){
        PhanSo p = new PhanSo(tu,mau);
        this.xoaPhanSo(p);
    }
    public PhanSo tong(){
        return this.ds.stream().reduce(new PhanSo(), (t,x)->t.cong(x).rutGon());
    }

    public List<PhanSo> getDs() {
        return ds;
    }
//    public PhanSo timMax(){
//        
//    }
}
