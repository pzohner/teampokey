/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import java.io.PrintWriter;
import pokemongame.PokemonGame;

/**
 *
 * @author porterzohner
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = PokemonGame.getOutFile();
    private static final PrintWriter logFile = PokemonGame.getLogFile();
    
    public static void display(String className, String errorMessage) {
    
    errorFile.println (
    " -----––––––––---------------------------------------------------"
    + "\n ERROR - " + errorMessage
    + "\n-------------------------------------------------------------");
    
    logFile.println(className + " - " + errorMessage);
}

    static void Display(String _Invalid_selection__Try_again) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void display(String _Invalid_selection__Try_again) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
