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
        System.out.println("calcAttack");
        CombatControl instance = new CombatControl();
        double expResult = 0.0;
        double result = instance.calcAttack();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
