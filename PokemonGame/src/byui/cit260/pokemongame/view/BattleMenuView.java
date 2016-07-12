/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.BattleControl;
import byui.cit260.pokemongame.exception.BattleControlException;
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Character;
import byui.cit260.pokemongame.model.Pokemon;
import pokemongame.PokemonGame;

/**
 *
 * @author porterzohner
 */
public class BattleMenuView extends View {

    BattleMenuView()  {
    super("\n"
                + "\n--------------------------------------------"
                + "\n| Battle Menu                              |"
                + "\n--------------------------------------------"
                + "\nA - Attack"
                + "\nT - Throw Pokeball"
                + "\nU - Use item"
                + "\nR - Run away!"
                +" \n  -----------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "A":
                this.attack();
                break;
            case "T":
                this.throwPokeball();
                break;
            case "U":
                this.useItem();
                break;
            case "R":
                this.runaway();
                break;
            default:
                ErrorView.Display ("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void attack() {
        
        Game game = PokemonGame.getCurrentGame();
        Character[] character = game.getCharacter();
        Pokemon[] pokemonList = character[1].getPokemon();
             
        
        try {
            
            BattleControl.attack(pokemonList[5], pokemonList[0]);
                    
        } catch (BattleControlException bce) {
            
            this.console.println(bce.getMessage());
            
        }
        
        for (Pokemon pokemon: pokemonList) {
            this.console.println(pokemon.getName() + "-----" + pokemon.getHealth());
        }
        
    }

    private void throwPokeball() {
        this.console.println("the throwPokeball function was called");
    }

    private void useItem() {
        this.console.println("the useItem function was called");
    }

    private void runaway() {
        this.console.println("the runaway function was called");
    }
    
    
}
