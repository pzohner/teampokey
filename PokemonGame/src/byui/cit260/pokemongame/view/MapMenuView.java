/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import byui.cit260.pokemongame.control.MapControl;
import byui.cit260.pokemongame.exception.MapControlException;
import java.util.Scanner;
import pokemongame.PokemonGame;
import byui.cit260.pokemongame.model.Character;
import java.awt.Point;
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
                this.console.println("the exploreSquare function was called");
                GameControl.exploreSquare();
                break;
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
   
