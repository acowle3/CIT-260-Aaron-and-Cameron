/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import java.util.Scanner;

/**
 *
 * @author Dale
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------"
                  + "\n| Help Menu                           |"
                  + "\n---------------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nE - Estimating the amount of resources"
                  + "\nQ - Quit"
                  + "\n---------------------------------------";
    }
    
    public void displayHelpMenuView() {
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        }while (!done);
    }
    
    private String getMenuOption() {
        
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            Scanner keyboard = new Scanner("\n" + this.menu);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),"\nInvalid value: value can not be blank");
                continue;
            }
            break;
        }
        return value;
    }
   
    private boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.viewGoal();
                break;
            case "M":
                this.viewMove();
                break;
            case "E":
                this.viewInventory();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewGoal() {
        ErrorView.display(this.getClass().getName(),"***viewGoal function called ***");
    }
    private void viewMove() {
        ErrorView.display(this.getClass().getName(),"***viewMove function called ***");
    }
    private void viewInventory() {
        ErrorView.display(this.getClass().getName(),"***viewInventory function called ***");
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
