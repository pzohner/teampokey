/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import byui.cit260.pokemongame.control.MapControl;
import byui.cit260.pokemongame.control.MapControl.SceneType;
import byui.cit260.pokemongame.exception.GameControlException;
import byui.cit260.pokemongame.exception.MapControlException;
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Location;
import byui.cit260.pokemongame.model.Map;
import byui.cit260.pokemongame.model.Pokemon;
import java.util.Scanner;
import pokemongame.PokemonGame;
import byui.cit260.pokemongame.model.Character;

/**
 *
 * @author porterzohner
 */
public class GameMenuView extends View {

    
    public GameMenuView()  {
        
        super("\n"
                + "\n--------------------------------------------"
                + "\n| Game Menu                                |"
                + "\n--------------------------------------------"
                + "\n V - View Map"
                + "\n L - Item list"
                + "\n P - Pokemon list"
                + "\n HM - Healing Menu"
                + "\n E - Explore Square"
                + "\n S - Save Game"
                + "\n H - Help Menu"
                + "\n SPL - Sort Pokemon List"
                + "\n AVG - Display Average Pokemon Health"
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
            case "HM":
                this.displayHealingMenu();
                break;
            case"H":
                this.displayHelpMenu();
                break;
            case"SPL":
                this.displaySortedPokemonList();
                break;
            case"AVG":
                this.displayAveragedPokemonHealth();
                break;   
            default:
                ErrorView.display("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void displayMap() {
        
        // get the current game variable
        Game game = new Game();
        game = PokemonGame.getCurrentGame();
      
        
        Map map = new Map();
        map = game.getMap();
        
        Location[][] locations = map.getMapLocations();
        
        
        this.console.println(" --- MAP --- ");
        
        this.console.println("      1                 2                   3                   4                   5");
        for (int row = 0; row < 5; row++)
        {
            this.console.println("\n" + row + "------------------------");
            for (int column = 0; column < 5; column++){
                
                if (locations[row][column].isVisited() == false) {
                    
                    this.console.print("|   " + "??"  +  " |  ");
                    
                } else {
                    
                    this.console.print("|   " + locations[row][column].getScene().getNameOfScene() + "  |  ");
                }                           
            }
            
        }
        
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
        this.console.println("\n*** displayExploreSquare");
    }

    private void saveGame() {
        this.console.println("\n*** saveGame");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displaySortedPokemonList() {
        
        
//        Pokemon[] pokemon = GameControl.createPokemon();
//          byui.cit260.pokemongame.model.Character[] characterWithList = game.getCharacter();
//          characterWithList[1].setPokemon(pokemon);
          
        Game game = PokemonGame.getCurrentGame();
      
        Character[] characterWithList = game.getCharacter();
        
       // Pokemon[] sortedList = characterWithList[1].getPokemon();
        Pokemon[] sortedList = GameControl.sortPokemonListAttackValues(characterWithList[1].getPokemon());
       
        if (sortedList.length > 6) {
            this.console.println("There are too many items in the array");
        }
        for (int i = 0; i < sortedList.length; i++) {
            
            this.console.println(sortedList[i].getName());
            
        }
         
    }
    
    private void displayAveragedPokemonHealth() {
        int average;
        Game game = PokemonGame.getCurrentGame();
        
        Character[] characterWithList = game.getCharacter();
        
        Pokemon[] list = characterWithList[1].getPokemon();
        
        average = GameControl.getAveragePokemonHealthValues(list);
        
        this.console.println("The average health of the Pokemon is: " + average);
        
    }

    private void displayHealingMenu() {
        
        HealingMenuView healingMenuView = new HealingMenuView();
        healingMenuView.display();
        
    }
    
}
