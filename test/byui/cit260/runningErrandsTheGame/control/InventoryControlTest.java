/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spryt_000
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
        System.out.println("calcDistance");
        System.out.println("\tTest case #1");
        
        double fuelUnits = 3.5;
        double fuelEconomy = 12;
        
        double expResult = 42;
        
        CarControl instance = new CarControl();
        
        double result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);
        
        
        Test
        
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
