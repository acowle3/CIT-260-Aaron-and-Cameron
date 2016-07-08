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
 * @author Dale
 */
public class CombatControlTest {
    
    public CombatControlTest() {
    }

    /**
     * Test of calcAttack method, of class CombatControl.
     */
    @Test
    public void testCalcAttack() {
        ErrorView.display(this.getClass().getName(),"calcAttack");
        CombatControl instance = new CombatControl();
        double testDouble = 32;
        double expResult = 32;
        double result = instance.calcAttack(testDouble);
        assertEquals(expResult, result, 32);
        
    }
    
}
