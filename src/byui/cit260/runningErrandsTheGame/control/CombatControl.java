/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;
import byui.cit260.runningErrandsTheGame.exceptions.CombatControlExceptions;
import byui.cit260.runningErrandsTheGame.model.Inventory;
import byui.cit260.runningErrandsTheGame.model.Weapon;
/**
 *
 * @author Dale
 */
public class CombatControl {
    
    Weapon weapon;
    
    public double calcAttack() throws CombatControlExceptions {
        
        if (weapon.getDamage() < 0)
            throw new CombatControlExceptions("Did you seriously try to use a healing item to attack someone?");
        if (weapon.getDamage() == 0 )
            throw new CombatControlExceptions("This isn't a weapon, you idiot.");
        else
        {
            
            return ( weapon.getDamage() - (Math.random() * 0.5) * weapon.getDamage() );
            
        }
    }
    
    public Inventory getWeapon() {
        return weapon;
    }
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    public void retreat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcAttack(double testDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void listWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
