/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import byui.cit260.pokemongame.model.Player;
import byui.cit260.pokemongame.model.Character;////
import byui.cit260.pokemongame.model.Item;
//////
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Location;
import byui.cit260.pokemongame.model.Map;
import byui.cit260.pokemongame.model.Pokeball;
import byui.cit260.pokemongame.model.Pokemon;
import byui.cit260.pokemongame.model.Potion;
import byui.cit260.pokemongame.model.Scene;
import byui.cit260.pokemongame.view.StartProgramView;
import java.awt.Point; 


/**
 *
 * @author porterzohner
 */
public class PokemonGame {

    
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PokemonGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PokemonGame.player = player;
    }
    
    public int examplePassByValue(int value) {
        
        value = 0;
        return value;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       int testValue = 5;
       
       if (testValue == 5) {
           
           System.out.println("Hey, if testValue = 5");
       }
       else if (testValue == 6) {
           
           System.out.println("testValue = 6");
           
       }
       else if (testValue == 7) {
           
           System.out.println("testValue = 7");
       }
       else {
           
           System.out.println("the else statement ran");
       }
       
       
       
       
       
       
       
       
       StartProgramView testView = new StartProgramView();
       testView.displayStartProgramView();
       
       
      
       
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
                
        ///test of item class//
        
        Item itemOne = new Item();
        itemOne.setAmountOfItem(7); 

        String itemInfo = itemOne.toString();
        System.out.println(itemInfo); 
        
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
                
        
        Pokeball pokeball = new Pokeball();
        
        pokeball.setIsMaster(false);
        
        String isMaster= game.toString();
        System.out.println(isMaster);
        
        
        Pokemon pokemon = new Pokemon();
        ///asked to set boolen instead///
        pokemon.setType("false");
        pokemon.setStrength(7); 
        pokemon.setAttackType("false");
        pokemon.setDefense(7);
        pokemon.setHealth(7);
        
        String Pokemon = pokemon.toString();
        System.out.println(Pokemon);
        
        
       Potion potion = new Potion ();
       //asked to set boolean isntead///
       potion.setHealPower(20);
       
       String Potion = pokemon.toString();
       System.out.println(Potion);   
       
    }
    
}
