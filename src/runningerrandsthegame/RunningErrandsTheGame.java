/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrandsthegame;

import byui.cit260.runningErrandsTheGame.model.Game;
import byui.cit260.runningErrandsTheGame.model.Player;
import byui.cit260.runningErrandsTheGame.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 *
 * @author Aaron
 */
public class RunningErrandsTheGame {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader infile = null;
    
    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    public static void setCurrentGame(Game currentGame) {
        RunningErrandsTheGame.currentGame = currentGame;
    }
    public static Player getPlayer() {
        return player;
    }
    public static void setPlayer (Player player) {
        RunningErrandsTheGame.player = player;
    }
    
    public static void main(String[] args) {
        Player playerOne = new Player();
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgamView();
        
        playerOne.setName("fred flintstone");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        this.console.println(playerInfo);
        
        try {
            RunningErrandsTheGame.infile =
                    new BufferedReader(new InputStreamReader(System.in));
            RunningErrandsTheGame.outFile = new PrintWriter(this.console, true);
            
            String filePath = "log.txt";
            RunningErrandsTheGame.logFile = new PrintWriter("C:\\Users\\Documents\\tmp\\logfile.txt");
            
            startProgramView = new StartProgramView();
            startProgramView.display();
            
        } catch (Throwable e) {
                this.console.println("Exception: " + e.toString() +
                                   "\nCause: " + e.getCause() +
                                   "\nMessage: " + e.getMessage()); 
        }       
        
        finally {
            try {
                 if (RunningErrandsTheGame.infile != null)
                     RunningErrandsTheGame.infile.close();
                
                 if (RunningErrandsTheGame.outFile != null)
                     RunningErrandsTheGame.outFile.close();
                 
                 if (RunningErrandsTheGame.logFile != null)
                     RunningErrandsTheGame.logFile.close();
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),"Error closing files");
                return;
            }
                
        }
    }
        

    public static Object getcurrentgame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }
    public static void setOutFile(PrintWriter outFile) {
        RunningErrandsTheGame.outFile = outFile;
    }
    public static BufferedReader getInFile() {
        return infile;
    }
    public static void setInFile(BufferedReader inFile) {
        RunningErrandsTheGame.infile = inFile;
    }
    public static PrintWriter getLogFile() {
        return logFile;
    }
    public static void setLogFile(PrintWriter logFile) {
        RunningErrandsTheGame.logFile = logFile;
    }
 }

