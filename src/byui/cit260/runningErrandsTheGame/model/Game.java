/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.model;

import java.io.Serializable;

/**
 *
 * @author spryt_000
 */
public class Game implements Serializable{
    
    private double totalTime;
    private int daysLeft;
    
    // model layers
    private Car car;
    private Characters characters;
    private Inventory inventory[];
    private Map map;
    private Player player;
    private Purchases purchases;
    
    public Game() {
    }
    
    
    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public Car getCar() {
        return car;
    }
    
    public void setCar(Car car) {
        this.car = car;
    }
    

    public Characters getCharacter() {
        return characters;
    }
    
    public void setCharacter(Characters characters) {
        this.characters = characters;
    }
    
    public Inventory[] getInventory() {
        return inventory;
    }
    
    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }
    
    public Map getMap() {
        return map;Lo
    }
    public void setMap(Map map) {
        this.map = map;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public Purchases getPurchases() {
        return purchases;
    }
    
    public void setPurchases(Purchases purchases) {
        this.purchases = purchases;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 37 * hash + this.daysLeft;
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", daysLeft=" + daysLeft + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (this.daysLeft != other.daysLeft) {
            return false;
        }
        return true;
    }
    
    
    
    
 
    
    
}