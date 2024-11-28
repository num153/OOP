/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.bth;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) throws ParseException {
         Olympic op1 = new Olympic("C:\\Users\\admin\\Downloads\\Top20TokyoInfo.txt","C:\\Users\\admin\\Downloads\\Top20Tokyo.txt");
         System.out.println(op1);
    }
}
