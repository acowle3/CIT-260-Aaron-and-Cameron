/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import java.util.Scanner;

/**
 *
 * @author spryt_000
 */
public abstract class View extends ViewInterface {
    
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
            
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        }while (!done);
    }
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            
            System.out.println("\n" + this.displayMessage);
        
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {            
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }
    }
    @Override 
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
    }
} 
