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
        

         ArrayList<Object> itemList = GameControl.createItemList();
         item.setTotalItemList(itemList); 
        
   //     MapControl.moveCharactersToStartingLocation(map);
        
    }

    public static Character[] createCharacter() {
        
        
        
                return null;
    }

   

    private static ArrayList<Object> createItemList() {
        
        ArrayList<Object> itemList = new ArrayList<>();
        int count = 0;
        
        
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
    
    private void count()
    {
        ArrayList<Object> list = createItemList();
        int count = 0;
        
        for(Object obj : list)
            count++;
        
        System.out.println("The total items in the object list is: " + count);
    }
    
    private enum ItemList {
        
        pokeball,
        masterBall,
        potion,
        superPotion
        
        
        // pokemon enum list?
        
    }
}
