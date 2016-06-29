/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.model.Game;
import byui.cit260.runningErrandsTheGame.model.Inventory;
import byui.cit260.runningErrandsTheGame.model.Map;
import byui.cit260.runningErrandsTheGame.model.Player;
import byui.cit260.runningErrandsTheGame.view.GameMenuView;
import runningerrandsthegame.RunningErrandsTheGame;

/**
 *
 * @author Dale
 */
public class GameControl {
    
    public static void createNewGame(Player player) {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
        Game game = new Game();
        
        game.setPlayer(player);
        
        Inventory[] inventoryList= GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveActorsToStartingLocation(map);
    }

    private static Inventory[] createInventoryList() {
        Inventory[] inventory =
                new Inventory[14];
        
        Inventory rifleAmmo = new Inventory();
        rifleAmmo.setDescription("Soviet 7.62x39mm rounds");
        rifleAmmo.setQuantityInStock(0);
        rifleAmmo.setRequiredAmount(0);
        inventory[0] = rifleAmmo;
        
        Inventory pistolAmmo = new Inventory();
        pistolAmmo.setDescription("9mm rounds");
        pistolAmmo.setQuantityInStock(0);
        pistolAmmo.setReqiredAmount(0);

        inventory[1] = pistolAmmo;
        
        Inventory painKillers = new Inventory();
        painKillers.setDescription("Painkillers");
        painKillers.setQuantityInStock(3);
        painKillers.setRequiredAmount(0);
        inventory[2] = painKillers;
        
        Inventory baseballBat = new Inventory();
        baseballBat.setDescription("Baseball Bat");
        baseballBat.setQuantityInStock(1);
        baseballBat.setRequiredAmount(0);
        inventory[3] = baseballBat;
        
        Inventory switchblade = new Inventory();
        switchblade.setDescription("switchblade");
        switchblade.setQuantityInStock(1);
        switchblade.setRequiredAmount(0);
        inventory[4] = switchblade;
        
        Inventory dollars = new Inventory();
        dollars.setDescription("Money");
        dollars.setQuantityInStock(100);
        dollars.setRequiredAmount(0);
        inventory[5] = dollars;
        
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
