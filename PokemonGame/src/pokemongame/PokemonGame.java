/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import byui.cit260.pokemongame.model.Player;
import byui.cit260.pokemongame.model.Character;
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Location;
import byui.cit260.pokemongame.model.Map;
import byui.cit260.pokemongame.model.Scene;
import java.awt.Point;

/**
 *
 * @author porterzohner
 */
public class PokemonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       // Player class test
       Player playerOne = new Player();
        
       playerOne.setName("Ashh");
       playerOne.setTimeCompleted(7.00); 
       
       String playerInfo= playerOne.toString();
       System.out.println(playerInfo); 
        
       // Character class test
        Character characterOne = new Character();
        
        characterOne.setName("Ash fluggerbutter");
        Point characterPositionTest = new Point();
        characterPositionTest.x = 1;
        characterPositionTest.y = 2;
        
        characterOne.setPosition(characterPositionTest);
        characterOne.setNumberOfPokemon(4);
        characterOne.setNumberOfItems(2);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
                
        // This is the map test
        Map map = new Map();
        
        int[] columnTest = {5};
        map.setNumberOfColumns(columnTest);
        int[] rowTest = {5};
        map.setNumberOfRows(rowTest);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        // Location test
        Location location = new Location();
        
        location.setRow(1);
        location.setColumn(2);
        location.setVisited(false);
        
        String locationTest = location.toString();
        System.out.println(locationTest);
        
     // Game test
        
        Game game = new Game();
        
        game.setCharacterOnField("Bob the Deer");
        
        String gameTest = game.toString();
        System.out.println(gameTest);
        
     // Scene test
        
        Scene scene = new Scene();
        
        scene.setNameOfScene("TG");
        scene.setDescription("Tall grass scene description");
        
        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);    
    }
    
}
