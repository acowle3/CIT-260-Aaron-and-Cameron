/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.model.Player;
import runningerrandsthegame.RunningErrandsTheGame;

/**
 *
 * @author Dale
 */
public class GameControl {

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
    
    public void startNewGame() {
        
    }
    
    public void initializeMap() {
        
    }
    
    public static Player createPlayer(String name){
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        RunningErrandsTheGame.setPlayer(player);
        
        return player;
    }
    
}