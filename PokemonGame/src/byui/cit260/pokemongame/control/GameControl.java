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
import byui.cit260.pokemongame.model.Pokemon;
import byui.cit260.pokemongame.model.Character;


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
        
        
               
        // create the pokemon
          Pokemon[] pokemon = GameControl.createPokemon();
          Character[] characterWithList = game.getCharacter();
          characterWithList[1].setPokemon(pokemon);
          //Character[] characterWithList = game.getCharacter();
        
        
        // create and set the map
        Map map = MapControl.createMap();
        game.setMap(map);
        
        // create and set the totalItemList
        ArrayList<Object> itemList = GameControl.createItemList();
        item.setTotalItemList(itemList); 
        
        //MapControl.moveCharactersToStartingLocation(map);
        
    }
    
    public static Pokemon[] createPokemon() {
        
        Pokemon[] pokemon  = new Pokemon[6]; // total of 6 pokemon
   
        Pokemon pikachu   = new Pokemon("Pikachu"  , 20, 5,  65); 
        Pokemon rattata   = new Pokemon("Rattata"  , 10, 1,  30); 
        Pokemon spearow   = new Pokemon("Spearow"  , 27, 4,  50); 
        Pokemon charizard = new Pokemon("Charizard", 30, 7,  85);
        Pokemon gayardos  = new Pokemon("Gayardos" , 32, 8,  90);
        Pokemon mewTwo    = new Pokemon("MewTwo"   , 35, 10, 100);
        
        pokemon[5] = pikachu;
        pokemon[4] = rattata;
        pokemon[3] = spearow;
        pokemon[2] = charizard;
        pokemon[1] = gayardos;
        pokemon[0] = mewTwo;
        
//        pokemon[PokemonList.Pikachu.ordinal()]   = pikachu;
//        pokemon[PokemonList.Rattata.ordinal()]   = rattata;
//        pokemon[PokemonList.Spearow.ordinal()]   = spearow;
//        pokemon[PokemonList.Charizard.ordinal()] = charizard;
//        pokemon[PokemonList.Gayardos.ordinal()]  = gayardos;
//        pokemon[PokemonList.MewTwo.ordinal()]    = mewTwo;
        
        for (int i = 0; i < pokemon.length; i++) {
            
            System.out.println(pokemon[i].getName());
            
        }
        
        
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
        ArrayList<Object> ashItemList = createItemList(); //Changed this to actually populate list.
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
    
    public static int getAveragePokemonHealthValues(Pokemon[] arrayToSort)
    {
        int length = arrayToSort.length;
        int average = 0;
        
        for (int m = 0; m < length - 1; m++)
            average += arrayToSort[m].getHealth();
        
        average /= length;
        return average;
    }
    
    
    public static Pokemon[] sortPokemonListAttackValues(Pokemon[] arrayToSort) {
        
        
        int n = arrayToSort.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arrayToSort[i].getStrength() > arrayToSort[k].getStrength()) {
                                       
                    swapNumbers(i, k, arrayToSort);
                }
            }
            //printNumbers(arrayToSort);
            
            
        }
        return arrayToSort;
    }


     private static void swapNumbers(int i, int j, Pokemon[] array) {
  
         
        Pokemon temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
        
//        for (int i = 0; i < arrayToSort.length - 1; i++)
//        {
//            int index = i;
//            for (int j = i + 1; j < arrayToSort.length; j++)
//                if (arrayToSort[j].getStrength() < arrayToSort[index].getStrength())
//                    index = j;
//      
//            int smallerNumber = arrayToSort[index]; 
//            arrayToSort[index] = arrayToSort[i];
//            arrayToSort[i] = smallerNumber;
//        }
//        
//        return arrayToSort;
    
        
        
    

