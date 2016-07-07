/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.control;

import byui.cit260.runningErrandsTheGame.enums.Actor;
import byui.cit260.runningErrandsTheGame.model.Map;
import java.awt.Point;
import runningerrandsthegame.RunningErrandsTheGame;

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
    
    public static int moveActorToLocation(Actor actor, Point coordinates) {
        Map map = RunningErrandsTheGame.getcurrentgame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location ")
                                        + coordinates.x + ", " + coordinate.y
                                        + " because that location is outside "
                                        + " the bounds of the map.");
}
