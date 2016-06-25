/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.control;

import byui.cit260.pokemongame.control.MapControl.SceneType;
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Item;
import byui.cit260.pokemongame.model.Location;
import byui.cit260.pokemongame.model.Map;
import byui.cit260.pokemongame.model.Player;
import byui.cit260.pokemongame.model.Pokeball;
import byui.cit260.pokemongame.model.Potion;
import byui.cit260.pokemongame.model.Scene;
import java.util.ArrayList;
import pokemongame.PokemonGame;

/**
 *
 * @author savannahkei
 */
public class GameControl {

    public static Player createPlayer(String name) {
            
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        PokemonGame.setPlayer(player);
        
        return player;
   
    }

    public static void createNewGame(Player player) {
     
        Game game = new Game();
        //Character character = new Character();
        Item item = new Item();
        
        PokemonGame.setCurrentGame(game);
        
        game.setPlayer(player);
        
       //Character[] character = GameControl.createCharacter();
       //game.setCharacter(character);
               
       //HOW DO WE IMPLEMENT THE ITEM OBJECTS WHEN ITEM CLASS RELATES TO CHARACTER CLASS
       
      Map map = MapControl.createMap();
        game.setMap(map);
        

    //     ArrayList<Object> itemList = GameControl.createItemList();
   //      item.setTotalItemList(itemList); 
        
   //     MapControl.moveCharactersToStartingLocation(map);
        
    }

    public static Character[] createCharacter() {
        
        
        
                return null;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
       
        Location[][] locations = map.getMapLocations();
        
        locations[0][0].setScene(scenes[SceneType.home.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.tallGrass.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.boss.ordinal()]);
        
    }           

    private static ArrayList<Object> createItemList() {
        
        ArrayList<Object> itemList = new ArrayList<>();
        
        
        //Pokeball pokeball = new Pokeball();
        //pokeball.setDescription("PokeBall");
        //pokeball.setIsMaster(false);
        //Pokeball pokeball = new Pokeball("Pokeball", false);
        //itemList.add(pokeball);
        
        
        // pokeball in position 1
        itemList.add(new Pokeball("Pokeball", false));
        
        // master ball in position 2
        itemList.add(new Pokeball("MasterBall", true));
       
        // potion in position 3
        itemList.add(new Potion("Potion", 20));
        
        // superPotion in position 4
        itemList.add(new Potion("superPotion", 60));
        
        return itemList;
        
    }
    
    private enum ItemList {
        
        pokeball,
        masterBall,
        potion,
        superPotion
        
        
        // pokemon enum list?
        
    }
}
