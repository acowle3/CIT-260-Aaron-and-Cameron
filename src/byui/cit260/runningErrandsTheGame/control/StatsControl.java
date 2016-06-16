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
public class StatsControl {
    
        public double calcTotalHealth(double userAge, double birthMonth) {
        
        if (userAge < 1) {
		return -1;
        }
        if (birthMonth < 1 || birthMonth > 12) {
		return -1;
        }
        
        double totalHealth = (userAge * 3) + birthMonth;
                
        return totalHealth; 
        
    }
}
