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
        System.out.println("\n *** startExisting() function called");
    }

    private void saveGame() {
        System.out.println("\n *** saveGame() function called");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
}
