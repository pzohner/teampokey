/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.MapControl;
import byui.cit260.pokemongame.exception.MapControlException;
import java.util.Scanner;
import pokemongame.PokemonGame;
import byui.cit260.pokemongame.model.Character;
import byui.cit260.pokemongame.model.Item;
import byui.cit260.pokemongame.model.Location;
import byui.cit260.pokemongame.model.Pokemon;
import java.awt.Point;
import java.util.ArrayList;
/**
 *
 * @author savannahkei
 */
public class MapMenuView extends View {
    
     private String menu;
    
    public MapMenuView() {
        
        super ("\n"
                + "\n--------------------------------------------"
                + "\n| Map Menu                                |"
                + "\n--------------------------------------------"
                + "\nMN - Move North"
                + "\nMS - Move South"
                + "\nME - Move East"
                + "\nMW - Move West"
                + "\nE - Explore Square "
                + "\nQ - Quit"
                + "\n --------------------------------------------");
        
    }
    
    @Override
public boolean doAction(String menuOption) {
        
     menuOption = menuOption.toUpperCase();
        
        switch (menuOption) {
            case "MN":
                this.mapMoveNorth();
                break;
            case "MS":
                this.mapMoveSouth();
                break;
            case "ME":
                this.mapMoveEast();
                break;
            case "MW":
                this.mapMoveWest();
                break;
            case "E":
                this.explore();

            default:
                ErrorView.display ("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void mapMoveNorth()  {
      Character[] ash = PokemonGame.getCurrentGame().getCharacter();
        //Point currentPosition = ash[1].getPosition();
      
        try {
            MapControl.moveCharacterNorth(ash[1], "ME");
        
            
        } catch (MapControlException mce) {
            
            ErrorView.display("Cannot move to that location!");
        }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMap();

      
    }
    
    private void mapMoveSouth() {
      
        Character[] ash = PokemonGame.getCurrentGame().getCharacter();
        //Point currentPosition = ash[1].getPosition();
      
        try {
            MapControl.moveCharacterSouth(ash[1], "MS");
        
            
        } catch (MapControlException mce) {
            
            ErrorView.display("Cannot move to that location!");
        }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMap();
        
    }

    private void mapMoveEast() {
        
        Character[] ash = PokemonGame.getCurrentGame().getCharacter();
        //Point currentPosition = ash[1].getPosition();
      
        try {
            MapControl.moveCharacterEast(ash[1], "ME");
        
            
        } catch (MapControlException mce) {
            
            ErrorView.display("Cannot move to that location!");
        }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMap();
        
    }
    
//    private void explore() {
//        Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
//        
//        Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
//        
//        Point currentPoint = ash.getPosition();
//        
//        Location currentLocation = locations[currentPoint.y][currentPoint.x];
//        
//        
//        Item itemToAdd;
//        
//        itemToAdd = currentLocation.getItem();
//        
//        if (itemToAdd != null)
//        {
//           ArrayList<Object> listOfItems = Item.getTotalItemList(); 
//           
//           listOfItems.add(itemToAdd);
//           System.out.println("An item was found!");
//        }
//        else
//        {
//            System.out.println("No object found here!");
//        }
//        
//        
//    }
        
    
    private void explore() {
        
        Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
        
        Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
        
        Point currentPoint = ash.getPosition();
        
        Location currentLocation = locations[currentPoint.y][currentPoint.x];
        
        
        Item itemToAdd;
        Pokemon pokemonToCapture = currentLocation.getPokemon();
        
        itemToAdd = currentLocation.getItem();
      
        
        if (pokemonToCapture != null) {
            
            ArrayList<Pokemon> ashPokemon = new ArrayList<Pokemon>();
                   ashPokemon = ash.getCharacterPokemonArrayList();
                   
              // Pokemon[] ashPokemon = ash.getPokemon();
               
            ashPokemon.add(pokemonToCapture);
            
           // if (currentLocation.getPokemon())
                
            System.out.println("You captured a " + pokemonToCapture.getName()+ ".");
            
        }
        else
        {
            
            System.out.println(" You didnt find any pokemon! ");
        }
        
        if (itemToAdd != null)
        {
           ArrayList<Object> listOfItems = Item.getTotalItemList(); 
           
           listOfItems.add(itemToAdd);
           System.out.println("An item was found!");
        }
        else
        {
            System.out.println("No object found here!");
        }
        
        
    }
        
    private void mapMoveWest() {
        
        Character[] ash = PokemonGame.getCurrentGame().getCharacter();
        //Point currentPosition = ash[1].getPosition();
      
        try {
            MapControl.moveCharacterWest(ash[1], "MW");
        
            
        } catch (MapControlException mce) {
            
            ErrorView.display("Cannot move to that location!");
        }
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayMap();
        
    }

}
   
