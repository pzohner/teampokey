/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.control;

import byui.cit260.pokemongame.model.Map;
import byui.cit260.pokemongame.model.Scene;

/**
 *
 * @author savannahkei
 */
public class MapControl {

    public static Map createMap() {
        // creating the map
        Map map = new Map(4, 4);
        
        //create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
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

    static void moveCharactersToStartingLocation(Map map) {
        System.out.println("The function moveCharactersToStartingLocation was called");
    }
    
    public enum SceneType {
        home,
        tallGrass, 
        forest,
        mountain,
        boss
    }
    
    
    
    
}
