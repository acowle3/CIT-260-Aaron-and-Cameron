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
public abstract class View implements ViewInterface {
    
    protected String displayMessage; 
    
    public View() {        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void displayHelpMenuView() {
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        }while (!done);
    }
    
}
