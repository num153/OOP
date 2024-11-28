/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.bth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLDS {
    private ArrayList<HocSinh> arr;
    public QLDS(String path){
        arr = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try{
            File f=new File(path);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                String[] a=line.split(", "); //Nguyen Van Binh, 12/03/2004, TP. Ho Chi Minh, 8.5, 8.0, 8.5
                arr.add(new HocSinh(a[0],df.parse(a[1]),a[2],Double.parseDouble(a[3]),Double.parseDouble(a[4]),Double.parseDouble(a[5])));
                
            }
            sc.close();
        }catch(FileNotFoundException | ParseException ex){
            System.out.println("Khong the mo file " + ex.getMessage());
        }
    }
    
    
    
    public void them(HocSinh hs, String path){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        arr.add(hs);
        try{
            FileWriter f = new FileWriter(path,true);
            PrintWriter wr = new PrintWriter(f);
            wr.printf("\n%s, %s, %s, %.1f, %.1f, %.1f",
                    hs.getHoTen(),
                    df.format(hs.getNgaySinh()),
                    hs.getQueQuan(),
                    hs.getToan(),
                    hs.getVan(),
                    hs.getAnh());
            wr.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString(){
        StringBuilder buider = new StringBuilder();
        arr.forEach(hs -> {
            buider.append(hs);
        });
        return buider.toString();
    }
}
