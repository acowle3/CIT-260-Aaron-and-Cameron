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
import byui.cit260.runningErrandsTheGame.enums.Items;

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
        inventory[Items.akFortySeven.ordinal()] = rifleAmmo;
        
        Inventory pistolAmmo = new Inventory();
        pistolAmmo.setDescription("9mm rounds");
        pistolAmmo.setQuantityInStock(0);
        pistolAmmo.setReqiredAmount(0);
        inventory[Items.nineMMPistol.ordinal()] = pistolAmmo;
        
        Inventory painKillers = new Inventory();
        painKillers.setDescription("Painkillers");
        painKillers.setQuantityInStock(3);
        painKillers.setRequiredAmount(0);
        inventory[Items.painkillers.ordinal()] = painKillers;
        
        Inventory baseballBat = new Inventory();
        baseballBat.setDescription("Baseball Bat");
        baseballBat.setQuantityInStock(0);
        baseballBat.setRequiredAmount(0);
        inventory[Items.baseballBat.ordinal()] = baseballBat;
        
        Inventory switchblade = new Inventory();
        switchblade.setDescription("switchblade");
        switchblade.setQuantityInStock(1);
        switchblade.setRequiredAmount(0);
        inventory[Items.switchblade.ordinal()] = switchblade;
        
        Inventory dollars = new Inventory();
        dollars.setDescription("Money");
        dollars.setQuantityInStock(100);
        dollars.setRequiredAmount(0);
        inventory[Items.dollars.ordinal()] = dollars;
        
        Inventory fastFood = new Inventory();
        fastFood.setDescription("Fast Food");
        fastFood.setQuantityInStock(100);
        fastFood.setRequiredAmount(0);
        inventory[Items.fastFood.ordinal()] = fastFood;
        
        Inventory milk = new Inventory();
        milk.setDescription("milk");
        milk.setQuantityInStock(0);
        milk.setRequiredAmount(1);
        inventory[Items.milk.ordinal()] = milk;
        
        Inventory payCheck = new Inventory();
        payCheck.setDescription("Paycheck");
        payCheck.setQuantityInStock(1);
        payCheck.setReqiredAmount(0);
        inventory[Items.paycheck.ordinal()] = payCheck;
        
        Inventory clothes = new Inventory();
        clothes.setDescription("New Clothes");
        clothes.setQuantityInStock(0);
        clothes.setRequiredAmount(1);
        inventory[Items.clothes.ordinal()] = clothes;
        
        Inventory libraryBook = new Inventory();
        libraryBook.setDescription("Overdue library book");
        libraryBook.setQuantityInStock(1);
        libraryBook.setRequiredAmount(0);
        inventory[Items.libraryBook.ordinal()] = libraryBook;
        
        Inventory spoils = new Inventory();
        spoils.setDescription("Kim Jong Il's personal belongings");
        spoils.setQuantityInStock(0);
        spoils.setRequiredAmount(1);
        inventory[Items.KimJongIlsCrap.ordinal()] = spoils;
        return inventory;
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
