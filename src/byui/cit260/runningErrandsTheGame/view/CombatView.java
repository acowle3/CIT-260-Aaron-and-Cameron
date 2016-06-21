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
        menu = "\nA: to attack"
                + "\nI: to use inventory item"
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
            case "A":
                combatControl.calcAttack();
                break;
            case "I":
                combatControl.useInventory();
                break;
            case "R":
                combatControl.retreat();
                break;
            case "Q":
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    
}
