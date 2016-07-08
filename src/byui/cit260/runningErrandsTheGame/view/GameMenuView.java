/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import byui.cit260.runningErrandsTheGame.model.Game;
import byui.cit260.runningErrandsTheGame.model.Inventory;
import java.util.Scanner;
import runningerrandsthegame.RunningErrandsTheGame;

/**
 *
 * @author Dale
 */
public class GameMenuView {
    private String menu;
    
    public GameMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------"
                  + "\n| Game Menu                           |"
                  + "\n---------------------------------------"
                  + "\nM - Map"
                  + "\nI - Inventory"
                  + "\nF - Finances"
                  + "\nS - Save Game"
                  + "\nL - Load Game"
                  + "\nK - Stats Menu"
                  + "\nH - Help Menu"
                  + "\nQ - Quit Game"
                  + "\n---------------------------------------";
    }
    
    public void displayGameMenuView() {
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
            case "M":
                this.viewMap();
                break;
            case "I":
                this.viewInventory();
                break;

            case "S":
                this.viewSaveGame();
                break;
            case "L":
                this.viewLoadGame();
                break;
            case "K":
                this.viewStatsMenu();
                break;    
            case "H":
                this.viewHelpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewMap() {
        ErrorView.display(this.getClass().getName(),"*** viewMap function called ***");
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = RunningErrandsTheGame.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        ErrorView.display(this.getClass().getName(),"\n      INVENTORY");
        line = new StringBuilder("                                      ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        ErrorView.display(this.getClass().getName(),line.toString());
        
        for(Inventory item : inventory) {
            line = new StringBuilder("                                      ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            
            System.out.println(line.toString());
        }
        
    }


    private void viewSaveGame() {
        ErrorView.display(this.getClass().getName(),"*** viewSaveGame function called ***");
    }

    private void viewLoadGame() {
        ErrorView.display(this.getClass().getName(),"*** viewLoadGame function called ***");
    }

    private void viewViewEmail() {
        ErrorView.display(this.getClass().getName(),"*** viewViewEmail function called ***");
    }

    private void viewStatsMenu() {
        ErrorView.display(this.getClass().getName(),"*** viewStatsMenu function called ***");
    }

    private void viewViewEmails() {
        ErrorView.display(this.getClass().getName(),"*** viewViewEmails function called ***");
    }

    private void viewHelpMenu() {
        ErrorView.display(this.getClass().getName(),"*** viewHelpMenu function called ***");
    }

    void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
