/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.model.Inventory;


/**
 *
 * @author Dale
 */
public class InventoryControl {
    
    public void sortByCost(Inventory[] items) {
        Inventory tempItem;
        for (int i = 0; i < items.length-1; i++) {
            for (int j = 0; j < items.length-1-i; j++) {
                if (items[j].getCost() > items[i].getCost()) {
                    tempItem = items[j];
                    items[j] = items[j+1];
                    items[j+1] = tempItem;
                }
            }
        }
    }

    double calcBond(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcBond(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcBond(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcBond(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcBond(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcStock(double invest, double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    
}
