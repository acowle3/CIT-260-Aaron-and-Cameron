/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.view.ErrorView;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author spryt_000
 */
public class StatsControlTest {
    
    public StatsControlTest() {
    }

    /**
     * Test of calcTotalHealth method, of class StatsControl.
     */
    @Test
    public void testCalcTotalHealth() {
        ErrorView.display(this.getClass().getName(),"calcTotalHealth");
        ErrorView.display(this.getClass().getName(),"\tTest case #1");
        double userAge = 25;
        double birthMonth = 7;
        StatsControl instance = new StatsControl();
        double expResult = 82;
        double result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #2");
        userAge = 12;
        birthMonth = -1;
        expResult = -1;
        result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #3");
        userAge = -1;
        birthMonth = 5;
        expResult = -1;
        result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);  
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #4");
        userAge = 18;
        birthMonth = 13;
        expResult = -1;
        result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #5");
        userAge = 12;
        birthMonth = 0;
        expResult = -1;
        result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #6");
        userAge = 0;
        birthMonth = 5;
        expResult = -1;
        result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #7");
        userAge = 99;
        birthMonth = 12;
        expResult = 309;
        result = instance.calcTotalHealth(userAge, birthMonth);
        assertEquals(expResult, result, 0.0);
    }
}
