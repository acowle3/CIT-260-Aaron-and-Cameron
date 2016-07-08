/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.runningErrandsTheGame.view;

import java.io.PrintWriter;
import runningerrandsthegame.RunningErrandsTheGame;

/**
 *
 * @author spryt_000
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = RunningErrandsTheGame.getOutFile();
    private static final PrintWriter logFile = RunningErrandsTheGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                    "---------------------------------------------------------"
                  + "\n- ERROR - " + errorMessage
                  + "\n---------------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
    
}
