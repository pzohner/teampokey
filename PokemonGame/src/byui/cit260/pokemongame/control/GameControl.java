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
import byui.cit260.pokemongame.model.Character;
import byui.cit260.pokemongame.model.Pokemon;
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
        
        Character[] character = GameControl.createCharacters();
        game.setCharacter(character);
               
        // create and set the map
        Map map = MapControl.createMap();
        game.setMap(map);
        
        // create and set the totalItemList
        ArrayList<Object> itemList = GameControl.createItemList();
        item.setTotalItemList(itemList); 
        
        //MapControl.moveCharactersToStartingLocation(map);
        
    }
    
    public static Pokemon[] createPokemon() {
        
        Pokemon[] pokemon  = new Pokemon[5]; // total of 6 pokemon
        
        Pokemon pikachu   = new Pokemon("Pikachu"  , 20, 5,  65); 
        Pokemon rattata   = new Pokemon("Rattata"  , 10, 1,  30); 
        Pokemon spearow   = new Pokemon("Spearow"  , 27, 4,  50); 
        Pokemon charizard = new Pokemon("Charizard", 30, 7,  85);
        Pokemon gayardos  = new Pokemon("Gayardos" , 32, 8,  90);
        Pokemon mewTwo    = new Pokemon("MewTwo"   , 35, 10, 100);
        
        
        pokemon[PokemonList.Pikachu.ordinal()]   = pikachu;
        pokemon[PokemonList.Rattata.ordinal()]   = rattata;
        pokemon[PokemonList.Spearow.ordinal()]   = spearow;
        pokemon[PokemonList.Charizard.ordinal()] = charizard;
        pokemon[PokemonList.Gayardos.ordinal()]  = gayardos;
        pokemon[PokemonList.MewTwo.ordinal()]    = mewTwo;
        
        return pokemon;
    }
    
    private enum PokemonList {
        
        Pikachu,
        Rattata,
        Spearow,
        Charizard,
        Gayardos,
        MewTwo
        
    }

    public static Character[] createCharacters() {
        
        Character[] character = new Character[2];
        Location[][] startingLocation = new Location[0][0];
        Location[][] bossLocation = new Location[4][4];
        ArrayList<Object> ashItemList = new ArrayList<>();
        Pokemon[] pokemonList = new Pokemon[5];
        
        // create ASh the player 
        Character ash = new Character();
        ash.setName("Ash");
        ash.setLocation(startingLocation);
        
        // set ash's itemList
        ash.setItemList(ashItemList);
        ash.setPokemon(pokemonList);
        character[CharacterList.Ash.ordinal()] = ash;
        
        // create LANCE the boss
        Character lance = new Character();
        lance.setName("Lance");
        lance.setLocation(startingLocation);
        lance.setItemList(ashItemList);
        lance.setPokemon(pokemonList);
        character[CharacterList.Lance.ordinal()] = lance;
        
        return character;
        
    }
    
    public enum CharacterList {
        
        Ash,
        Lance
    }

   
    private static ArrayList<Object> createItemList() {
        
        ArrayList<Object> itemList = new ArrayList<>(); 
        
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
    
    public enum ItemList {
        
        pokeball,
        masterBall,
        potion,
        superPotion
        
    }
}
