/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.vdv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DoiTuyenQuocGia {
    private ArrayList<CauThu> arr;
    
    public DoiTuyenQuocGia(){
        arr = new ArrayList<>();
    }
    
    public DoiTuyenQuocGia(String path){
        arr = new ArrayList<>();
        try{
            File f = new File(path);
            Scanner sc = new Scanner(f);
            //so dong ignore phai dua ra ngoai while
            sc.nextLine();
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] in4 =line.split(",");
                if(in4.length == 4){
                    CauThu player = new CauThu(in4[0],in4[1],Integer.parseInt(in4[2]),in4[3]);
                    arr.add(player);
                }
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Khong mo dc" + e.getMessage());
        }
    }
    public void findByClb(String clbName){
        if(arr.stream().filter(pl -> pl.getClb().equalsIgnoreCase(clbName)).count()==0){
            System.out.println("Couldnt find anny!");
        }else{
            arr.stream().filter(pl -> pl.getClb().equalsIgnoreCase(clbName)).forEach(pl->System.out.println(pl));
        }
    }
    public DoiTuyenQuocGia findByPos(String posName){
        DoiTuyenQuocGia temp = new DoiTuyenQuocGia();
        arr.stream().filter(pl->pl.getPos().equalsIgnoreCase(posName)).forEach(pl -> temp.arr.add(pl));
        if (temp.arr.isEmpty()) {
        System.out.println("Could not find any!");
    }

    return temp;
    }
//    Cannot invoke "java.util.ArrayList.add(Object)" because "temp.arr" is null
    //Chua khoi tao arr trong constructor, la chua co arr = new ArrayList



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        arr.forEach((CauThu pl) -> {
            builder.append(pl);
        }); 
        return builder.toString();
    }
}
