/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.enums;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Dale
 */
public enum Actor implements Serializable {
    
    BankRobber("Exactly what it says on the tin."),
    BadCop("Police brutality FTW"),
    DrugDealer("Makes money off of other people's chemical dependencies.  Extremely dangerous if his livelyhood is threatened"),
    Wife("Your feminazi significant other who whines at you to run errands for her"),
    Protestor("They don't know what they want, but they know how to get it.  They are a real riot, if you know what I mean"),
    LoneWolf("A misanthropic radical who is waiting for the right moment to go postal.  May or may not be associated with ISIS, al Qaeda, or the Taliban"),
    HappySlapper("An idiotic teenager who assaults people for fun"),
    RandomBystander("Just an average joe"),
    GiantSpider("HOLY CRAP A MUTANT SPIDER ESCAPED THE LAB AND ITS GOING TO EAT US ALL BETTER RUN AAAAAHHHHHH...!"),
    Zombie("Not affiliated with Joe Zombie or Rob Zombie"),
    Beelzebub("Hell froze over, so he's buying new sweaters.  Better go buy your wife the expensive jewelery she's always nagging you for."),
    KimJongIl("Zombified dictator of North Korea and all-around crazy psychopath.  Brought back to life after a bit of necromancy gone horribly wrong, and is trying to nuke your city.  Is the final boss of this game");
    
    private final String description;

    
    Actor(String description) {
        this.description = description;
    //    coordinates = new Point(1, 1);
    }


    public String getDescription() {
        return description;
    }
}
