/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import byui.cit260.runningErrandsTheGame.control.GameControl;
import byui.cit260.runningErrandsTheGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Dale
 */
public class StartProgramView {

    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
    }
    public void displayStartProgamView(){
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(playersName);
            
        } while (!done);
    }

    private String getPlayersName() {
        
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            Scanner keyboard = new Scanner("\n" + this.promptMessage);
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

    private boolean doAction(String playersName) {
        if (playersName.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
            
        }
    
    //call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
    
        if(player == null) {
        ErrorView.display(this.getClass().getName(),"\nError creating the player.");
        return false;
        }
    
    //display next view
        this.displayNextView(player);
        return true;
    }
    
    private void displayNextView(Player player) {
        ErrorView.display(this.getClass().getName(),"\n============================================"
                          + "\n Welcome to the game " + player.getName()
                          + "\n Prepare to DIE!"
                          + "\n==========================================="
                          );
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

    private void displayBanner() {
        ErrorView.display(this.getClass().getName(),"Game is currently under construction");
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}