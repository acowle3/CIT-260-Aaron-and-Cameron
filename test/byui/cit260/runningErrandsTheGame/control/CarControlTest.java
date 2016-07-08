/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.view.ErrorView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spryt_000
 */
public class CarControlTest {
    
    public CarControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of carControl method, of class CarControl.
     */
    @Test
    public void testCalcDistance() {
        ErrorView.display(this.getClass().getName(),"calcDistance");
        ErrorView.display(this.getClass().getName(),"\tTest case #1");
        
        double fuelUnits = 3.5;
        double fuelEconomy = 12;
        
        double expResult = 42;
        
        CarControl instance = new CarControl();
        
        double result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);    
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #2");
        
        fuelUnits = -1;
        fuelEconomy = 12;
        
        expResult = -1;
        
        result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);  
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #3");
        
        fuelUnits = 5;
        fuelEconomy = 15;
        
        expResult = -1;
        
        result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #4");
        
        fuelUnits = 6;
        fuelEconomy = 12;
        
        expResult = 0;
        
        result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #5");
        
        fuelUnits = 0;
        fuelEconomy = 12;
        
        expResult = 0;
        
        result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #6");
        
        fuelUnits = 5;
        fuelEconomy = 0;
        
        expResult = 0;
        
        result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #7");
        
        fuelUnits = 5;
        fuelEconomy = 12;
        
        expResult = 60;
        
        result = instance.calcDistance(fuelUnits, fuelEconomy);
        
        assertEquals(expResult, result, 0.0001);
    }
        
}
