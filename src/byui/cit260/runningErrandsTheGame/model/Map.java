/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.model;

import byui.cit260.runningErrandsTheGame.enums.SceneType;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author spryt_000
 */
public class Map implements Serializable {
    
    private String location;
    private double distance;
    private double fuelEconomy;
    private double money;
    
    private int noOfRows;
    private int noOfColumns;
    private Location[][] locations;
    
    public Map() {
        
    }
    
    public Map(int noOfRows, int noOfColumns) {
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        this.locations = new Location[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }
    
    public static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Your wife has done it yet again.  She has nagged you into doing it again.  You "
              + "don't know why she doesn't do at least some of them, but oh well.  What you do "
              + "know is that you have to go and do them, yet again.  One day to do the whole "
              + "thing, all of them.  What you don't know is, this will turn out to be the worst "
              + "day of your life.");
        startingScene.setMapSymbol("TR");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.trailer.ordinal()] = startingScene;
                
        
        Scene libraryScene = new Scene();
        libraryScene.setDescription(
                "You have an overdue library book.  Maybe now would be a good time to return it.  "
              + "Just make sure you don't disturb those protestors out in the front.  You amy also "
              + "want to look out for that guy reading that chemistry textbook.");
        libraryScene.setMapSymbol("LI");
        libraryScene.setBlocked(false);
        libraryScene.setTravelTime(240);
        scenes[SceneType.library.ordinal()] = libraryScene;
        
        Scene libraryArsonScene = new Scene();
        libraryArsonScene.setDescription(
                "Well, those protestors turned out to be more beligerent than we originally "
              + "thought.  They just threw a molotov cocktail through the window.  Better get "
              + "out of there.");
        libraryArsonScene.setMapSymbol("AR");
        libraryArsonScene.setBlocked(false);
        libraryArsonScene.setTravelTime(233);
        scenes[SceneType.libraryArson.ordinal()] = libraryArsonScene;
        
        Scene groceryStore = new Scene();
        groceryStore.setDescription(
                "Now would be a good time to buy a gallon of milk.  It's surprisingly busy today, "
              + "so you'd better be careful.");
        groceryStore.setMapSymbol("GR");
        groceryStore.setBlocked(false);
        groceryStore.setTravelTime(342);
        scenes[SceneType.groceryStore.ordinal()] = groceryStore;
        
        Scene terroristAttack = new Scene();
        terroristAttack.setDescription(
                "Whoop de Dooh.  Looks like some crazied maniac has pulled out a scary looking "
              + "assault rifle and is gunning everybody down in sight.  Are you going to run, or "
              + "are you feeling enough bravado to take him down yourself?");
        terroristAttack.setMapSymbol("TE");
        terroristAttack.setBlocked(false);
        terroristAttack.setTravelTime(321);
        scenes[SceneType.groceryStoreTerroristAttack.ordinal()] = terroristAttack;
        
        Scene bank = new Scene();
        bank.setDescription (
                "Time to cash your check in.  Considering what you have gone through so far, you "
              + "can already predict what's going to happen in a few minutes.");
        bank.setMapSymbol("BA")
        bank.setBlocked(false);
        bank.setTravelTime(344);
        scenes[SceneType.bank.ordinal()] = bank;
        
        Scene robbery = new Scene();
        robbery.setDescription(
                "Well, what do you know, Murphy's law has struck again.  You are caught in the "
              + "crossfire of a bank robbery.");
        robbery.setMapSymbol("RO");
        robbery.setBlocked(false);
        robbery.setTravelTime(321);
        scenes[SceneType.bankRobbery.ordinal()] = robbery;
        
        Scene clothingStore = new Scene();
        clothingStore.setDescription(
               "You never thought that you'd be grateful for this, but have gotten to the most boring "
              + "errand ever: shopping for some new clothes.  Who is that creepy looking horned guy"
                "Over there?");
        clothingStore.setMapSymbol("CL");
        clothingStore.setBlocked(false);
        clothingStore.setTravelTime(234);
        scenes[SceneType.clothingStore.ordinal()] = clothingStore;
        
        Scene giantSpiderAttack = new Scene();
        giantSpiderAttack.setDescription(
                "After you got done buying clothes, you have struck up a conversation with the "
              + "demonic looking figure you saw earlier.  He claims to be Beelzabub, or Lord of the "
              + "Flies.  He claims that Hell has frozen over, so he's out buying sweaters.  He "
              + "taunts you, telling you that you have to purchase the expensive jewelry that your "
              + "wife nagged you about that one time.  Also, he asks you to keep an eye out for a "
              + "certain Asian guy in a fascist-looking military uniform, telling you that a "
              + "necromancer had accidently let him out of Hell.  He also says something about a "
              + "nuke, but you have a hard time believing him.  So what are you going to do now? "
              + "Go home, or take the chance that the father of all lies may be telling the truth "
              + "this time?  Also, there's a bunch of nasty looking creatures wandering around "
              + "outside in the darkness.  Thank Heaven for the 2nd Amendment...");
        giantSpiderAttack.setMapSymbol("SP")
        
        
        return scenes;
    }
    
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.location);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.distance) ^ (Double.doubleToLongBits(this.distance) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.fuelEconomy) ^ (Double.doubleToLongBits(this.fuelEconomy) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        return hash;
    }
    
    @Override
    public String toString() {
        return "Map{" + "location=" + location + ", distance=" + distance + ", fuelEconomy=" + fuelEconomy + ", money=" + money + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.distance) != Double.doubleToLongBits(other.distance)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fuelEconomy) != Double.doubleToLongBits(other.fuelEconomy)) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}