/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import byui.cit260.runningErrandsTheGame.control.GameControl;
import java.util.Scanner;
import runningerrandsthegame.RunningErrandsTheGame;

/**
 *
 * @author Dale
 */
public class MainMenuView {
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------------"
                  + "\n| Main Menu                           |"
                  + "\n---------------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit"
                  + "\n---------------------------------------";
    }
    
    public void displayMainMenuView() {
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

    private boolean doAction(String menuOption) {
        menuOption = menuOption.toUpperCase();
        
        switch (menuOption) {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            case "Q":
                this.quitGame();
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid slection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create new game
        GameControl.createNewGame(RunningErrandsTheGame.getPlayer());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
        
        }
        
    private void startExistingGame() {
        ErrorView.display(this.getClass().getName(),"\n*** startExistingGame function called ***");    }

    private void saveGame() {
        ErrorView.display(this.getClass().getName(), 
                          "\n\nEnter the file path for file where the game "
                           + "is to be saved.");
        String filePath = this.getInput();
        
        try { 
            GameControl.saveGame(RunningErrandsTheGame.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage()):
        }
    }    
        
    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();    }

    private void quitGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void startSavedGame() {
        ErrorView.display(this.getClass().getName(),"\n\nEnter the file path for file where the game "
                                                  + "is to be saved.");

        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }    
}



     