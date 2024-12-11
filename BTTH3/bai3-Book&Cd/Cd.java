/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nam.sachvadia;

/**
 *
 * @author ASUS
 */
public class Cd extends Product{
    private int duration;

    public Cd(int duration, String id, String name, String description, String manufact, double price) {
        super(id, name, description, manufact, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\nDuration: %d minutes", duration);
    }
}
