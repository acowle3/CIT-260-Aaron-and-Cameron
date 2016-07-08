/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import byui.cit260.runningErrandsTheGame.model.Player;

/**
 * Edited by Aaron Cowley
 * @author spryt_000
 */
public class PlayerHealthView {
    
    private Player player;
    
    private int health;
    
    public Player getPlayer() {
        return player;
    }
    
    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void showHealth() {
        String output;
        output = player.getName() + " health: " + health;
        ErrorView.display(this.getClass().getName(),output);
    }
}
