/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

/**
 *
 * @author spryt_000
 */
public class BondsView {
    
    private String message;
    public BondsView() {
        this.message = ("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Invest your money in bonds"
            + "\n---------------------------------------------------------------");
    }
    
    public boolean doAction(double height, double diameter) {
        
        //prompt for the dimensions for the barrel

        InventoryControl inventoryControl = new InventoryControl();

        double bonds = inventoryControl.calcBonds(invest, days);
        if (invest < 500) {
           System.out.println("\nThe minimum amount to invest is 500. Please enter a new value."); 
        }
        
            }
            else {
                System.out.println("\nBonds investment accepted!" +
                                   "\nYour total amount earned is " + bonds);
                Days accumlatedDays = new Days();
                accumlatedDays.addtotal(invest);
                designedBarrel.setVolume(bonds);                

                inventoryControl.saveAccumlatedDays(accumlatedDays);
                return true;     
            }
        }
        return false;  
    }
}
