/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

/**
 *
 * @author spryt_000
 */
public class CarControl {
    
    public double calcDistance(double fuelUnits, double fuelEconomy) {
        
        if (fuelUnits < 0 || fuelUnits > 5) {
		return -1;
        }
        if (fuelEconomy > 12) {
		return -1;
        }
        
        double cost = fuelEconomy * fuelUnits;
                
        return cost; 
        
    }
}
