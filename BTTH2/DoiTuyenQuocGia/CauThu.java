/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nam.vdv;

/**
 *
 * @author ASUS
 */
public class CauThu {
    private String name;
    private String pos;
    private int number;
    private String clb;

    public CauThu(String name, String pos, int number, String clb) {
        this.name = name;
        this.pos = pos;
        this.number = number;
        this.clb = clb;
    }

    @Override
    public String toString() {
        return String.format("\n===========\nTen: %s\nVi tri: %s\nSo ao: %s\nClb: %s", getName(), getPos(), getNumber(), getClb());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pos
     */
    public String getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(String pos) {
        this.pos = pos;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the clb
     */
    public String getClb() {
        return clb;
    }

    /**
     * @param clb the clb to set
     */
    public void setClb(String clb) {
        this.clb = clb;
    }
     
             
    
}
