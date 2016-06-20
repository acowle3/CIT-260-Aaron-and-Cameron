/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import byui.cit260.runningErrandsTheGame.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author spryt_000
 */
public class BondsView  {
   
    private String message;
    public BondsView() {
        this.message = ("\n"
            + "\n---------------------------------------------------------------"
            + "\n| Invest your money in bonds"
            + "\n---------------------------------------------------------------");
    }

    public boolean doAction(double invest, double days) {
       
        InventoryControl inventoryControl = new InventoryControl();

        double amount = inventoryControl.calcBond(invest, days);
        if (amount < 1500) {
           System.out.println("\n$1500.00 minimum amount accepted." +
                                   "\nPlease try again.");
        }
        else {
            double investAmount = inventoryControl.calcStocks(invest);
            if (investAmount < 1500) {
                System.out.println("\n$1500.00 minimum amount accepted." +
                                   "\nPlease try again.");
            }
            else {
                System.out.println("\nBonds accepted!");
                BondsView investEarned = new BondsView();
                investEarned.setInvest(invest);
                investEarned.setDays(days);

                inventoryControl.saveInvestEarned(investEarned);
                return true;     
            }
        }
        return false;  
    }

     public String getInput() {

        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;

        // while a valid name has not been retrieved
        while (!valid) {

            // get the value entered from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) { // blank value entered
                System.out.println("\n*** Invalid selection *** Try again");
                continue;
            }
            
            break;
        }

        return selection; // return the name        
    }
     
      public void displayBondsView() {
        String value;
        boolean done = false;
        
        do { 
            System.out.println(this.message); // display the prompt message
            
            double invest = 0.0;
            double days = 0.0;
            
            System.out.println("\nHow much do you want to invest in bonds");
            invest = Double.parseDouble(getInput());                                                                     

            System.out.println("\nHow many days until you want to collect");
            days = Double.parseDouble(getInput());    
           
            done = this.doAction(invest, days); // do action based on selection        
        } while (!done);
    }

    private void setInvest(double invest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setDays(double days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
