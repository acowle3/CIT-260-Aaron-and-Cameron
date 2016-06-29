/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.model;

/**
 *
 * @author Dale
 */
public class Weapon extends Inventory {
    private int spread;
    private double damage;
    
    public double getDamage() {
        return damage;
    }
    
    public void setDamage(double damage) {
        this.damage = damage;
    }
    
    public void setSpread(int spread) {
        this.spread = spread;
    }
    
    public int getSpread() {
        return spread;
    }
    
}
