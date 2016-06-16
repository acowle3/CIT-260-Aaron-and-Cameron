/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.runningErrandsTheGame.model;

/**
 *
 * @author Dale
 */
public class ChangeLocation {
    
    private int locationList;
    private int currentLocation;
    
    public ChangeLocation(){
        
    }
    public int getLocationList(){
        return locationList;
    }
    public void LocationList(int locationList){
        this.locationList = locationList;
    }
    public int getCurrentLocation(){
        return currentLocation;
    }
    public void getCurrentLocation(int currentLocation){
        this.currentLocation = currentLocation;
    }
}
