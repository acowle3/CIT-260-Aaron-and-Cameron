/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands;

import byui.cit260.runningErrands.model.Challenges;
import byui.cit260.runningErrands.model.Game;
import byui.cit260.runningErrands.model.Inventory;
import byui.cit260.runningErrands.model.Map;
import byui.cit260.runningErrands.model.Purchases;

/**
 *
 * @author spryt_000
 */
public class RunningErrands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game time = new Game();
        
        time.setTotalTime(5.00);
        time.setDaysLeft(30);
        
        String timeInfo = time.toString();
        System.out.println(timeInfo);
        
        Challenges event = new Challenges();
        
        event.setDescription("Return book to Library");
        event.setObstacle("Book theif sets his eyes on your book");
        
        String eventInfo = event.toString();
        System.out.println(eventInfo);
        
        Inventory item = new Inventory();
        
        item.setInventoryType("Nails");
        item.setQuantityInStock(15);
        item.setRequiredAmount(24);
        
        String itemInfo = item.toString();
        System.out.println(itemInfo);
        
        Purchases stock = new Purchases();
        
        stock.setItems("Nails");
        stock.setLocation("Home Improvement Store");
        stock.setCost(3.99);
        
        String stockInfo = stock.toString();
        System.out.println(stockInfo);
        
        Map travel = new Map();
        
        travel.setLocation("Home Improvement Store");
        travel.setDistance(20.2);
        travel.setFuelEconomy(18.5);
        travel.setMoney(220.50);
        
        String travelInfo = travel.toString();
        System.out.println(travelInfo);
        
      
        
    }
    
}
