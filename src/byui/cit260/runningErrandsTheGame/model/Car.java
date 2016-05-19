/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.model;

/**
 *
 * @author Dale
 */
public class Car {
    
    private double distance;
    private double fuel;
    private double cost;
    
    public Car(){
        
    }
    public double getDistance(){
        return distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public double getFuel(){
        return fuel;
    }
    public void getFuel(double fuel){
        this.fuel = fuel;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}
