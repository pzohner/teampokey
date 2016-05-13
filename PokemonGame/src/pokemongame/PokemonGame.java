/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

import byui.cit260.pokemongame.model.Player;
import byui.cit260.pokemongame.model.Character;

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
        int[][] multidimentionalArray = new int[0][0];
        characterOne.setPosition(multidimentionalArray);
        characterOne.setNumberOfPokemon(4);
        characterOne.setNumberOfItems(2);
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
                
                
    }
    
}
