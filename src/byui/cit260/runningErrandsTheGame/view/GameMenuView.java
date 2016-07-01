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
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
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
            case "F":
                this.viewFinances();
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
    }

    private void viewInventory() {
        StringBuilder line;
        
        Game game = RunningErrandsTheGame.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        
        System.out.println("\n      INVENTORY");
        line = new StringBuilder("                                      ");
        line.insert(0, "DESCRIPTION");
        line.insert(20, "REQUIRED");
        line.insert(30, "IN STOCK");
        System.out.println(line.toString());
        
        for(Inventory item : inventory) {
            line = new StringBuilder("                                      ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getRequiredAmount());
            line.insert(33, item.getQuantityInStock());
            
            System.out.println(line.toString());
        }
        
    }

    private void viewFinances() {
        BondsView bondsView = new BondsView();
        bondsView.displayBondsView();    
    }

    private void viewSaveGame() {
        System.out.println("*** viewSaveGame function called ***");
    }

    private void viewLoadGame() {
        System.out.println("*** viewLoadGame function called ***");
    }

    private void viewViewEmail() {
        System.out.println("*** viewViewEmail function called ***");
    }

    private void viewStatsMenu() {
        System.out.println("*** viewStatsMenu function called ***");
    }

    private void viewViewEmails() {
        System.out.println("*** viewViewEmails function called ***");
    }

    private void viewHelpMenu() {
        System.out.println("*** viewHelpMenu function called ***");
    }
}
