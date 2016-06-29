/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.model.Map;

/**
 *
 * @author Dale
 */
public class MapControl {

    static Map createMap() {
        Map map = null;
        
        System.out.println("\n createMap() called");
        return map;
    }
    
    private int location;
    private double distance;
    private double money;
    
    public int getLocations()
    {
        return location;
    }
    public void setLocations(int location)
    {
        this.location = location;
    }
    public double getDistance()
    {
        return distance;
    }
    public void getDistance(float distance)
    {
        this.distance = distance;
    }
    public double getMoney()
    {
        return money;
    }
    
    public static void moveActorsToStartingLocation(Map map)
    {
        
    }
}
