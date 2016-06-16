/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

/**
 *
 * @author Dale
 */
public class InventoryControl {
    
        public double calcBond(double invest, double days) {
        
        if (invest < 500) {
		return -1;
        }
        if (days < 1 || days > 31) {
		return -1;
        }
        
        double stock = (invest * 0.1 * days) - (50 * days);
                
        return stock; 
        
    }
}
