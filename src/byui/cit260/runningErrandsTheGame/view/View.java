/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import runningerrandsthegame.RunningErrandsTheGame;

/**
 *
 * @author spryt_000
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage; 
    
    protected final BufferedReader keyboard = RunningErrandsTheGame.getInFile();
    protected final PrintWriter console = RunningErrandsTheGame.getOutFile();
    
    public View() {      
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
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
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            
            this.console.println("\n" + this.displayMessage);
        
            try {
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();
            
            if (value.length() < 1) {            
                ErrorView.display(this.getClass().getName(),
                                  "\n*** You must enter a value *** ");
                continue;
            }
            
            break;
        }        
        return value;
    }
} 
