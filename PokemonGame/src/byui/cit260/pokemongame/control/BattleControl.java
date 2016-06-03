/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.control;

import byui.cit260.pokemongame.model.Pokemon;
import byui.cit260.pokemongame.model.Potion;
import java.util.Random;

/**
 *
 * @author savannahkei
 */
public class BattleControl {

    public int attack(Pokemon pokemonAttacker, Pokemon pokemonDefender) {

        if (pokemonAttacker.getStrength() < 10 || pokemonAttacker.getStrength() > 35) {
            return -1;
        }
        if (pokemonDefender.getDefense() < 1 || pokemonDefender.getDefense() > 10) {
            return -1;
        }
        if (pokemonDefender.getHealth() > 100) {
            return -1;
        }
        
        Random rand = new Random();
        int randomValue = rand.nextInt(10) + 1;

        int damageDealt = pokemonAttacker.getStrength() + randomValue - pokemonDefender.getDefense();
        int finalHealth = pokemonDefender.getHealth() - damageDealt;
        pokemonDefender.setHealth(finalHealth);

        return 0;
    }

    public int usePotion(Potion potion, Pokemon pokemonHealed) {

        if (potion.getHealPower() < 1 || potion.getHealPower() > 50) {

            return -1;
        }

        if (pokemonHealed.getHealth() > 100) {

            return -1;
        }

        Random rand = new Random();
        int randomValue = rand.nextInt(10) + 1;

        pokemonHealed.setHealth(pokemonHealed.getHealth() + potion.getHealPower() + randomValue);

        if (pokemonHealed.getHealth() > 100) {

            pokemonHealed.setHealth(100);

            return 0;
        }

        return 0;

    }

    public int captureSuccess (Pokemon captured){
            
            if (captured.getHealth()<0 || captured.getHealth() >100) {
            
                return -1; 
            } 
      
     Random rand = new Random();
     int randomValue = rand.nextInt(25) + 1;       
        
        if (captured.getHealth() + randomValue <50) {
            return 0;
        }
        
        else {
            return 1;
        }
        }
    
    }
 
