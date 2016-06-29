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
public class Heal extends Inventory {
    
    protected double heal;
    
    public double getHeal(){
        return heal;
    }
    public void setHeal(double heal) {
        this.heal = heal;
    }
}
