/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.sachvadia;

/**
 *
 * @author ASUS
 */
public class Book extends Product{
    private int pageNum;

    public Book(int pageNum, String id, String name, String description, String manufact, double price) {
        super(id, name, description, manufact, price);
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nPage Number: %d", pageNum);
    }
    
    
    
}
