/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrandsthegame;

import byui.cit260.runningErrandsTheGame.model.Game;
import byui.cit260.runningErrandsTheGame.model.Player;
import byui.cit260.runningErrandsTheGame.view.StartProgramView;
/**
 *
 * @author Aaron
 */
public class RunningErrandsTheGame {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    public static void setCurrentGame(Game currentGame) {
        RunningErrandsTheGame.currentGame = currentGame;
    }
    public static Player getPlayer() {
        return player;
    }
    public static void setPlayer (Player player) {
        RunningErrandsTheGame.player = player;
    }
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgamView();
        
        playerOne.setName("fred flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
