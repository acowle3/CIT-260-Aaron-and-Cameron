/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.model;


import java.io.Serializable;
/**
 *
 * @author Dale
 */
public class Characters implements Serializable{
    
    private String name;
    private String occupation;
    private String status;
    
    public Characters(){   
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOccupation() {
        return occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
