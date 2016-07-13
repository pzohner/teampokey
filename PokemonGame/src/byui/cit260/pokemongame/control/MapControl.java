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
import java.awt.Point;
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
        
        MapControl.assignScenesToLocations(map, scenes);
        
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
        Location[][] locations = PokemonGame.getCurrentGame().getMap().getMapLocations();
        
        ash.setPosition(new Point(0,0));
        
        Location location = locations[0][0];
        
        location.getCharacters().add(ash);
        
        location.setVisited(true);
        
    }
    
    public static void moveCharacterToLocation(Character character, Point coordinates) 
            throws MapControlException {
        
        Map map = PokemonGame.getCurrentGame().getMap();
        
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNumberOfRows() ||
            newColumn < 0 || newColumn >= map.getNumberOfColumns()) {
            
            throw new MapControlException("Cannot move actor to location " + coordinates.x + ", "
                                            + coordinates.y + " because that location is outside"
                                            + " the bounds of the map.");
                                            
        }
        
    }
    
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
}
