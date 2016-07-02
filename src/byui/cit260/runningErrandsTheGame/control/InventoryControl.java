/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.model.Inventory;
import byui.cit260.runningErrandsTheGame.view.BondsView;

/**
 *
 * @author Dale
 */
public class InventoryControl {
    
    public void sortByCost(Inventory[] items) {
        int n = items.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (items.getCost()[i] > items.getCost()[k]) {
                    int temp;
                    temp = items.getCost()[i];
                    items.getCost[i] = items.getCost()[k];
                    items.getCost()[k] = temp;
                }
            }
            for (int i = 0; i < items.length; i++) {
                System.out.print(items.getDescription()[i] + " - " + items.getCost()[i] + "\n");
            }
            System.out.println("\n");
        }
    }
    
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
