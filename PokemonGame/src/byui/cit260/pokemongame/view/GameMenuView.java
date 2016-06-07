/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import java.util.Scanner;

/**
 *
 * @author porterzohner
 */
public class GameMenuView {

    private String menu;
    
    public GameMenuView() {
        
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n| Game Menu                                |"
                + "\n--------------------------------------------"
                + "\n V - View Map"
                + "\n L - Item list"
                + "\n P - Pokemon list"
                + "\n E - Explore Square"
                + "\n S - Save Game"
                + "\n H - Help Menu"
                + "\n Q - Quit"
                + "\n--------------------------------------------";
    }
    
    void displayGameMenu() {
    
        boolean done = false;
        
        do {
            
            String menuOption = getMenuOption();
            
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
            case "V":
                this.displayMap();
                break;
            case "L":
                this.displayItemList();
                break;
            case "P":
                this.displayPokemonList();
                break;
            case"E":
                this.displayExploreSquare();
                break;
            case"S":
                this.saveGame();
                break;
            case"H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void displayMap() {
        
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.displayMapMenuView();
    }

    private void displayItemList() {
       
        
    }

    private void displayPokemonList() {
        System.out.println("\n*** displayPokemonList called");
    }

    private void displayExploreSquare() {
        System.out.println("\n*** displayExploreSquare");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame");
    }

    private void displayHelpMenu() {
        System.out.println("\n*** displayHelpMenu");
    }
    
}
