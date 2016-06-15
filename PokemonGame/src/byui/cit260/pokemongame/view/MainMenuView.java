/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import java.util.Scanner;
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
                this.startNewGame();
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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void startNewGame() {
        
        GameControl.createNewGame(PokemonGame.getPlayer());
        
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
