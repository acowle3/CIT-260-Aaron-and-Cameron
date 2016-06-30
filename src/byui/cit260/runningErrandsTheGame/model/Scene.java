/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.model;

import byui.cit260.runningErrandsTheGame.enums.SceneType;
import java.io.Serializable;
/**
 *
 * @author Dale
 */
public class Scene implements Serializable {

    private String description;
    private SceneType sceneType;
    private String mapSymbol;
    private double travelTime;
    private boolean blocked;
   
    public Scene() {
    }

    public Scene(SceneType sceneType, String description, String mapSymbol, double travelTime, boolean blocked) {
        this.sceneType = sceneType;
        this.description = description;
        this.mapSymbol = mapSymbol;
        this.travelTime = travelTime;
        this.blocked = blocked;
    }

    public SceneType getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneType sceneType) {
        this.sceneType = sceneType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    
}
