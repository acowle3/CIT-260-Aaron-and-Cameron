/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.view.BondsView;

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
        
        double stocks = (invest * 0.1 * days) - (50 * days);
                
        return stocks; 
        
    }
        
        public double calcStock(double invest, double days) {
        
        if (invest < 1500) {
		return -1;
        }
        if (days < 1 || days > 31) {
		return -1;
        }
        
        double stock = (invest * .15 * days) - (100 * days);
                
        return stock; 
    }    

    public double calBonds(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double calcInvest(double volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void saveInvestEarned(BondsView investEarned) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
