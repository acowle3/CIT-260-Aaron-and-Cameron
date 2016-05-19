/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

/**
 *
 * @author Dale
 */
public class MapControl {
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
}
