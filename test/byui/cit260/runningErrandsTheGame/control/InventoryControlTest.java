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
public class InventoryControlTest {

    /**
     * Test of calcBond method, of class InventoryControl.
     */
    @Test
    public void testCalcBond() {
        ErrorView.display(this.getClass().getName(),"calcBond");
        ErrorView.display(this.getClass().getName(),"\tTest case #1");
        double invest = 1000;
        double days = 5;
        InventoryControl instance = new InventoryControl();
        double expResult = 250;
        double result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #2");
        invest = 2000;
        days = -1;
        expResult = -1;
        result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #3");
        invest = 300;
        days = 5;
        expResult = -1;
        result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #4");
        invest = 3000;
        days = 32;
        expResult = -1;
        result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #5");
        invest = 5000;
        days = -1;
        expResult = -1;
        result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #6");
        invest = 0;
        days = 31;
        expResult = -1;
        result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #7");
        invest = 5000;
        days = 31;
        expResult = 13950;
        result = instance.calcBond(invest, days);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calcStock method, of class InventoryControl.
     */
    @Test
    public void testCalcStock() {
        ErrorView.display(this.getClass().getName(),"calcStock");
        ErrorView.display(this.getClass().getName(),"\tTest case #1");
        double invest = 2000;
        double days = 3;
        InventoryControl instance = new InventoryControl();
        double expResult = 600;
        double result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #2");
        invest = 3000;
        days = -1;
        expResult = -1;
        result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #3");
        invest = 1400;
        days = 5;
        expResult = -1;
        result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #4");
        invest = 3000;
        days = 32;
        expResult = -1;
        result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #5");
        invest = 10000;
        days = 0;
        expResult = -1;
        result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #6");
        invest = 0;
        days = 31;
        expResult = -1;
        result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
        
        ErrorView.display(this.getClass().getName(),"\tTest case #7");
        invest = 10000;
        days = 31;
        expResult = 43400;
        result = instance.calcStock(invest, days);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
