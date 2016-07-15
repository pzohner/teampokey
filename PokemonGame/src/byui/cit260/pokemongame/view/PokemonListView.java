/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Pokemon;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import pokemongame.PokemonGame;
import byui.cit260.pokemongame.model.Character;

/**
 *
 * @author porterzohner
 */
public class PokemonListView extends View {
    
    private String menu;
    
    PokemonListView() {
        
        super("\n"
                + "\n--------------------------------------------"
                + "\n| Pokemon List                             |"
                + "\n--------------------------------------------"
                + "\nP  - Pikachu   -  40"
                + "\nR  - Rattata   -  80"
                + "\nS  - Spearow   -  20"
                + "\nC  - Charizard - 100"
                + "\nG  - Gayardos  - 100"
                + "\nM  - MewTwo    - 100"
                + "\nSP - Save pokemon list to file"
                + "\nQ  - Quit"
                + "\n--------------------------------------------");
    }
    
   
    @Override
    public boolean doAction(String input) {
        input = input.toUpperCase();
        
        switch (input) {
            case "P":
                this.console.println("\n*** Youve selected Pikachu");
               this.pikachuSelect();
               this.displayBattleMenu();
                break;
            case "R":
                this.console.println("\n*** Youve selected Rattata");
               this.displayBattleMenu();
                break;
            case "S":
                this.console.println("\n*** You've selected Spearow");
                this.displayBattleMenu();
                break;
            case "C":
                this.console.println("\n*** You've selected Charizard");
                this.displayBattleMenu();
                break;
            case "G":
               this.console.println("\n*** You've selected Gayardos");
                this.displayBattleMenu();
                break;
            case "M":
                this.console.println("\n*** You've selected Mewtwo");
                this.displayBattleMenu();
                break;
            case "SP":
                this.savePokemonListToFile();
            default:
               ErrorView.display("\n*** Invalid selection *** Try again");
                this.displayBattleMenu();
                break;
            
        }
        return false;
    }

    private void displayBattleMenu() {
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void pikachuSelect() {
        
        //Game game = PokemonGame.getCurrentGame();
        
        
        
    }

    private void savePokemonListToFile() {
          this.console.println("\n\n Enter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try {
            
            GameControl.savePokemonList(PokemonGame.getCurrentGame(), filePath);
            
            
            Character[] character = PokemonGame.getCurrentGame().getCharacter();
            printPokemonListReport(character[1].getPokemon(), filePath);
            console.printf(" The file " + filePath + " was written to successfully");
            
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void printPokemonListReport(Pokemon[] pokemon, String outputLocation) {
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            
            out.println("\n\n           Pokemon List            ");
            out.printf("%n%-20s%10s%10s%20s", "Name", "Strength", " Defense", " Current Health");
            out.printf("%n%-20s%10s%10s%20s", "----", "--------", " ------- ", "---------------");
            
            for (Pokemon pokemonList: pokemon) {
                
                out.printf("%n%-20s%7d%7d%13d", pokemonList.getName()
                                              , pokemonList.getStrength()
                                              , pokemonList.getDefense()
                                              , pokemonList.getHealth());
            }  
            
            
        
        } catch (IOException ex) {
            
            System.out.println("I/) Error: " + ex.getMessage());
        }
    }
}

    
    
    

