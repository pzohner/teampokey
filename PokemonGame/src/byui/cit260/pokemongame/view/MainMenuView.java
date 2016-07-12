/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import byui.cit260.pokemongame.exception.GameControlException;
import byui.cit260.pokemongame.exception.MapControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokemongame.PokemonGame;

/**
 *
 * @author porterzohner
 */
public class MainMenuView extends View {
    
    
    public MainMenuView() {
        
        super(  "\n"
                + "\n--------------------------------------------"
                + "\n| Main Menu                                |"
                + "\n--------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and Start Saved Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n--------------------------------------------");
        
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "N":
        {
//            try {
                this.startNewGame();
//            } catch (GameControlException ex) {
//                Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                ErrorView.display ("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void startNewGame()  { 
        try { 
           GameControl.createNewGame(PokemonGame.getPlayer());
       } catch (GameControlException me) {
           System.out.println(me.getMessage()); 
       }
        catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }
           
        GameMenuView gameMenu = new GameMenuView();
        
        gameMenu.display();
        
    }

    private void startExistingGame() {
        
        this.console.println("\n\n Enter the file path for the file where the game is saved");
        
        String filePath = this.getInput();
        
        try {
            
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        
    }

    private void saveGame() {
        this.console.println("\n\n Enter the file path for the file wher ethe game is to be saved.");
        String filePath = this.getInput();
        
        try {
            
            GameControl.saveGame(PokemonGame.getCurrentGame(), filePath);
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
