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
public class GameMenuView extends View {

    private String menu;
    
    public GameMenuView() {
        
        super ("\n"
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
                + "\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
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
        mapMenu.display();
    }

    private void displayItemList() {
       ItemListView listView = new ItemListView();
       listView.display();
        
    }

    private void displayPokemonList() {
        PokemonListView pokemonListView = new PokemonListView();
        pokemonListView.display();
    }

    private void displayExploreSquare() {
        System.out.println("\n*** displayExploreSquare");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}
