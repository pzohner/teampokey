/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.model.Game;
import java.util.Scanner;
import pokemongame.PokemonGame;

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
                + "\nP - Pikachu   -  40"
                + "\nR - Rattata   -  80"
                + "\nS - Spearow   -  20"
                + "\nC - Charizard - 100"
                + "\nG - Gayardos  - 100"
                + "\nM - MewTwo    - 100"
                + "\nQ - Quit"
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
            default:
               this.console.println("\n*** Invalid selection *** Try again");
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
    
}
