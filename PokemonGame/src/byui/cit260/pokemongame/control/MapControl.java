/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.control;

import byui.cit260.pokemongame.exception.MapControlException;
import byui.cit260.pokemongame.model.Location;
import byui.cit260.pokemongame.model.Map;
import byui.cit260.pokemongame.model.Pokemon;
import byui.cit260.pokemongame.model.Scene;
import byui.cit260.pokemongame.model.Character;
import byui.cit260.pokemongame.model.Item;
import byui.cit260.pokemongame.model.Pokeball;
import byui.cit260.pokemongame.model.Potion;
import java.awt.Point;
import java.util.ArrayList;
import pokemongame.PokemonGame;

/**
 *
 * @author savannahkei
 */
public class MapControl {

    public static Map createMap()
                  throws MapControlException {
       
        // creating the map
        Map map = new Map(5, 5);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        Item[] items = new Item[5];
        
        items[0] = new Pokeball("Pokeball", false);
        items[1] = new Potion("SuperPotion", 60);
        items[2] = new Pokeball("Masterball", true);
        items[3] = new Potion("Potion", 20);
        items[4] = new Pokeball("Pokeball", false);
        
        //ArrayList<Pokemon> pokemon = GameControl.createCharacterPokemon();
        
        Pokemon[] pokemon = GameControl.createPokemon();
        
        MapControl.assignScenesToLocations(map, scenes);
        MapControl.assignPokemonToLocations(map, pokemon);
        MapControl.assignItemToLocations(map, items);
        
        return map;
    }

    private static Scene[] createScenes() {
    
        Scene[] scenes = new Scene[SceneType.values().length];
        
        // Home Scene
        Scene homeScene = new Scene();
        homeScene.setDescription("Welcome to your home!");
        homeScene.setNameOfScene("Home");
        scenes[SceneType.home.ordinal()] = homeScene;
    
        // Tall Grass scene
        Scene tallGrassScene = new Scene();
        tallGrassScene.setDescription( "Be wary of Pokemon!");
        tallGrassScene.setNameOfScene("Tall Grass");
        scenes[SceneType.tallGrass.ordinal()] = tallGrassScene;
        
        
        // Forest Scene
        Scene forestScene = new Scene();
        forestScene.setDescription( "Cover in the bushes");
        forestScene.setNameOfScene("Forest");
        scenes[SceneType.forest.ordinal()] = forestScene;
        
        //mountain Scene
        Scene mountainScene = new Scene();
        mountainScene.setDescription("High on a mountain top");
        mountainScene.setNameOfScene("Mountain");
        scenes[SceneType.mountain.ordinal()] = mountainScene;
        
        
        // Boss scene
        Scene bossScene = new Scene();
        bossScene.setDescription("You have encountered Lance! Prepare yourself!");
        bossScene.setNameOfScene("Boss");
        scenes[SceneType.boss.ordinal()] = bossScene;
        
        
        return scenes;
    }

    
    public enum SceneType {
        home,
        tallGrass, 
        forest,
        mountain,
        boss
    }
    
    public static void moveCharactersToStartingLocation(Map map) {
        
        Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
        Character boss = PokemonGame.getCurrentGame().getCharacter()[0];
        
        Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
        
        ash.setPosition(new Point(0,0));
        boss.setPosition(new Point(4,4));
        
        Location ashLocation = locations[0][0];
        Location bossLocation = locations[4][4];
        
        ashLocation.getCharacters().add(ash);
        bossLocation.getCharacters().add(boss);
        
        ashLocation.setVisited(true);
        
    }
    
    public static void moveCharacterToLocation(Point coordinates) 
            throws MapControlException {
        
        Map map = PokemonGame.getCurrentGame().getMap();
        
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNumberOfRows() ||
            newColumn < 0 || newColumn >= map.getNumberOfColumns()) {
            
           
                                            
        }
        
    }
    
    public static void moveCharacterSouth(Character character, String direction) throws MapControlException {
       
          Map map = PokemonGame.getCurrentGame().getMap();
//        get coordinates(position) of character
          Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
          
//        get 2d locations of array
          Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
//        get list of characters in old location
          //Location oldLocation = new Location();
          Point currentPosition = ash.getPosition();
          
          Location oldLocation = locations[currentPosition.y][currentPosition.x];
          
          oldLocation.getCharacters().remove(ash);
          
          Point newPosition = new Point();    
          newPosition.y = currentPosition.y + 1;
          newPosition.x = currentPosition.x;
          
       if (newPosition.y < 0 || newPosition.y >= map.getNumberOfRows() ||
            newPosition.x < 0 || newPosition.x >= map.getNumberOfColumns()) {
            
           throw new MapControlException("Cannot move actor to location " + newPosition.x + ", "
                                            + newPosition.y + " because that location is outside"
                                            + " the bounds of the map.");
                                            
        
             
        }
         // moveCharacterToLocation(newPosition);
                            
         
          Location newLocation = locations[newPosition.y][newPosition.x];
          ash.setPosition(newPosition);
          newLocation.getCharacters().add(ash);
          newLocation.setVisited(true);
          
          //get old location and remove him from the list
          
//        calculate coordinates of new location
//        
//        get new location and add him to the list
//        
//                
//                
   }
    
    public static void moveCharacterEast(Character character, String direction) throws MapControlException {
       
          Map map = PokemonGame.getCurrentGame().getMap();
//        get coordinates(position) of character
          Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
          
//        get 2d locations of array
          Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
//        get list of characters in old location
          //Location oldLocation = new Location();
          Point currentPosition = ash.getPosition();
          
          Location oldLocation = locations[currentPosition.y][currentPosition.x];
          
          oldLocation.getCharacters().remove(ash);
          
          Point newPosition = new Point();    
          newPosition.x = currentPosition.x + 1;
          newPosition.y = currentPosition.y;
          
       if (newPosition.y < 0 || newPosition.y >= map.getNumberOfRows() ||
            newPosition.x < 0 || newPosition.x >= map.getNumberOfColumns()) {
            
           throw new MapControlException("Cannot move actor to location " + newPosition.x + ", "
                                            + newPosition.y + " because that location is outside"
                                            + " the bounds of the map.");
                                            
        
             
        }
         // moveCharacterToLocation(newPosition);
                            
         
          Location newLocation = locations[newPosition.y][newPosition.x];
          ash.setPosition(newPosition);
          newLocation.getCharacters().add(ash);
          newLocation.setVisited(true);
          
          //get old location and remove him from the list
          
//        calculate coordinates of new location
//        
//        get new location and add him to the list
//        
//                
//                
   }
    
    public static void moveCharacterWest(Character character, String direction) throws MapControlException {
       
          Map map = PokemonGame.getCurrentGame().getMap();
//        get coordinates(position) of character
          Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
          
//        get 2d locations of array
          Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
//        get list of characters in old location
          //Location oldLocation = new Location();
          Point currentPosition = ash.getPosition();
          
          Location oldLocation = locations[currentPosition.y][currentPosition.x];
          
          oldLocation.getCharacters().remove(ash);
          
          Point newPosition = new Point();    
          newPosition.x = currentPosition.x - 1;
          newPosition.y = currentPosition.y;
          
       if (newPosition.y < 0 || newPosition.y >= map.getNumberOfRows() ||
            newPosition.x < 0 || newPosition.x >= map.getNumberOfColumns()) {
            
           throw new MapControlException("Cannot move actor to location " + newPosition.x + ", "
                                            + newPosition.y + " because that location is outside"
                                            + " the bounds of the map.");
                                            
        
             
        }
         // moveCharacterToLocation(newPosition);
                            
         
          Location newLocation = locations[newPosition.y][newPosition.x];
          ash.setPosition(newPosition);
          newLocation.getCharacters().add(ash);
          newLocation.setVisited(true);
          
          //get old location and remove him from the list
          
//        calculate coordinates of new location
//        
//        get new location and add him to the list
//        
//                
//                
   }
    
    public static void moveCharacterNorth(Character character, String direction) throws MapControlException {
       
          Map map = PokemonGame.getCurrentGame().getMap();
//        get coordinates(position) of character
          Character ash = PokemonGame.getCurrentGame().getCharacter()[1];
          
//        get 2d locations of array
          Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
//        get list of characters in old location
          //Location oldLocation = new Location();
          Point currentPosition = ash.getPosition();
          
          Location oldLocation = locations[currentPosition.y][currentPosition.x];
          
          oldLocation.getCharacters().remove(ash);
          
          Point newPosition = new Point();    
          newPosition.y = currentPosition.y - 1;
          newPosition.x = currentPosition.x;
          
       if (newPosition.y < 0 || newPosition.y >= map.getNumberOfRows() ||
            newPosition.x < 0 || newPosition.x >= map.getNumberOfColumns()) {
            
           throw new MapControlException("Cannot move actor to location " + newPosition.x + ", "
                                            + newPosition.y + " because that location is outside"
                                            + " the bounds of the map.");
                                            
        
             
        }
         // moveCharacterToLocation(newPosition);
                            
         
          Location newLocation = locations[newPosition.y][newPosition.x];
          ash.setPosition(newPosition);
          newLocation.getCharacters().add(ash);
          newLocation.setVisited(true);
          
          //get old location and remove him from the list
          
//        calculate coordinates of new location
//        
//        get new location and add him to the list
//        
//                
//                
   }
    
    //find out where tehy are at (coordiantes)
    //Get location
    //get items in location
    // add items to characters item list.
    
    // ArrayList<Object> listOfItems = Item.getTotalItemList();
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) 
                        throws MapControlException {
       
        Location[][] locations = map.getMapLocations();
        
        if (locations == null) {
            
            throw new MapControlException("Location does not exist");
        }
       
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
    
    
    // changed the incoming pokemon to an array as oppose to an arrayList
    
    private static void assignPokemonToLocations(Map map, Pokemon[] pokemon) {
        
        Location[][] locations = map.getMapLocations();
            
//        locations[0][0].                          
        locations[0][1].setPokemon(pokemon[5]);
//        locations[0][2].
//        locations[0][3].
//        locations[0][4].
//        locations[1][0].
//        locations[1][1].
        locations[1][2].setPokemon(pokemon[4]);
//        locations[1][3].
//        locations[1][4].
//        locations[2][0].
        locations[2][1].setPokemon(pokemon[2]);
//        locations[2][2].
//        locations[2][3].
//        locations[2][4].
//        locations[3][0].
//        locations[3][1].
        locations[3][2].setPokemon(pokemon[1]);
//        locations[3][3].
//        locations[3][4].
//        locations[4][0].
//        locations[4][1].
//        locations[4][2].
//        locations[4][3].
        locations[4][4].setPokemon(pokemon[0]);  
    }
    
    /*
    
      getCoordinates of character
      get current location of char
      calculate coordinates of new location
      get new location
      remove character from old location
      add character to new location.
      set character's coordiante point ot new x,y

    */


private static void assignItemToLocations(Map map, Item item[]) {
        
        Location[][] locations = map.getMapLocations();

locations[0][1].setItem(item[4]);

locations[1][2].setItem(item[3]);

locations[2][1].setItem(item[2]);

locations[3][2].setItem(item[1]);

locations[4][4].setItem(item[0]);

} 

} 
