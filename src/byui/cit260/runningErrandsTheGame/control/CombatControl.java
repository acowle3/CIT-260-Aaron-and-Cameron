/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;
import byui.cit260.runningErrandsTheGame.model.Inventory;
/**
 *
 * @author Dale
 */
public class CombatControl {
    
    private Inventory weapon;
    
    public double calcAttack() {
        
        if (weapon.getDamage() < 0)
            return -1;
        if (weapon.getDamage() == 0 )
            return -2;
        else
        {
            
            return ( weapon.getDamage() - (Math.random() * 0.5) * weapon.getDamage() );
            
        }
    }
    
}
