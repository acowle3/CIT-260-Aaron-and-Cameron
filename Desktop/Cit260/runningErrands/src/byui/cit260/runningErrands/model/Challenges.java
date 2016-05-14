/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrands.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author spryt_000
 */
public class Challenges implements Serializable{
    
    private String description;
    private String obstacle;

    public Challenges() {
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObstacle() {
        return obstacle;
    }

    public void setObstacle(String obstacle) {
        this.obstacle = obstacle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + Objects.hashCode(this.obstacle);
        return hash;
    }

    @Override
    public String toString() {
        return "Challenges{" + "description=" + description + ", obstacle=" + obstacle + '}';
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
        final Challenges other = (Challenges) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.obstacle, other.obstacle)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
