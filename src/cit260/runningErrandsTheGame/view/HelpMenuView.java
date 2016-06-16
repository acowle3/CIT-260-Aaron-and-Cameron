/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningErrandsTheGame.view;

/**
 *
 * @author Dale
 */
public class HelpMenuView {
    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n G - What is the goal of the game?"
                  + "\n M - How to move"
                  + "\n E - Estimating the amount of resources"
                  + "\n Q - Quit";
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
        System.out.println("\n getMenuOption() function called ***");
        return "G";
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void viewGoal() {
        System.out.println("***viewGoal function called ***");
    }
    private void viewMove() {
        System.out.println("***viewMove function called ***");
    }
    private void viewInventory() {
        System.out.println("***viewInventory function called ***");
    }
}
