/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import byui.cit260.runningErrandsTheGame.control.CombatControl;
import java.util.Scanner;
/**
 *Edited by Aaron Cowley
 * @author spryt_000
 */
public class CombatView {
    private String menu;
    private CombatControl combatControl;
    
    public CombatView() {
        menu = "\nI: to use inventory item on enemy"
                + "\nR: to retreat"
                + "\nE: to quit game";
        
    }
    
    public void displayCombatMenuView() {
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

            case "I":
                listWeapons();
                getWeaponOption();
                break;
            case "R":
                combatControl.retreat();
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void listWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getWeaponOption() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
