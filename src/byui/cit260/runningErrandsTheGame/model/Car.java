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
    
    private float distance;
    private float fuel;
    private float cost;
    
    public Car(){
        
    }
    public float getDistance(){
        return distance;
    }
    public void setDistance(float distance){
        this.distance = distance;
    }
    public float getFuel(){
        return fuel;
    }
    public void getFuel(float fuel){
        this.fuel = fuel;
    }
    public float getCost(){
        return cost;
    }
    public void setCost(float cost){
        this.cost = cost;
    }
}
