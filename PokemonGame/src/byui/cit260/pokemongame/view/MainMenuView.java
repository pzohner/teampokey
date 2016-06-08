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
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n| Main Menu                                |"
                + "\n--------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and Start Saved Game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "\n--------------------------------------------";
        
    }

    void displayMainMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            
            if(menuOption.toUpperCase().equals("Q")) {
                return;
            }
            
            done = this.doAction(menuOption);
            
            
        } while (!done);
        
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            //MainMenuView mainMenuView = new MainMenuView();
            System.out.println(this.menu);
        
        value = keyboard.nextLine();
        value = value.trim();
        
        if(value.length() < 1) {
            System.out.println("\n Invalid value: value cannot be blank");
            continue;
            
        }
        break;
    }
     return value;  
    }

    private boolean doAction(String choice) {
        
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
        
        gameMenu.displayGameMenu();
        
    }

    private void startExistingGame() {
        System.out.println("\n *** startExisting() function called");
    }

    private void saveGame() {
        System.out.println("\n *** saveGame() function called");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }
    
}
