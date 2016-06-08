/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import java.util.Scanner;

/**
 *
 * @author porterzohner
 */
public class PokemonListView {
    
    private String menu;
    
    PokemonListView() {
        
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n| Pokemon List                             |"
                + "\n--------------------------------------------"
                + "\nP - Pikachu   -  40"
                + "\nR - Rattata   -  80"
                + "\nS - Spearow   -  20"
                + "\nC - Charizard - 100"
                + "\nG - Gayardos  - 100"
                + "\nM - MewTwo    - 100"
                + "\n--------------------------------------------";
    }
    
    public void displayPokemonList() {
        
        boolean done = false;
        do {
            String input = this.getInput();
            
            if(input.toUpperCase().equals("Q")) {
            
                return;
            
            }
            
            done = this.doAction(input);
            
            
        } while (!done);
        
    }

    private String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            //MainMenuView mainMenuView = new MainMenuView();
            System.out.println(this.menu);
        
        value = keyboard.nextLine();
        value = value.trim();
        
        if(value.length() < 1) {
            System.out.println("\n Invalid value: value cannot be blank");
            continue;
            
        }
        break;
    }
     return value;  
    }

    private boolean doAction(String input) {
        input = input.toUpperCase();
        
        switch (input) {
            case "P":
                System.out.println("\n*** You've selected Pikachu");
                break;
            case "R":
                System.out.println("\n*** Youve selected Rattata");
                break;
            case "S":
                System.out.println("\n*** You've selected Spearow");
                break;
            case "C":
                System.out.println("\n*** You've selected Charizard");
                break;
            case "G":
                System.out.println("\n*** You've selected Gayardos");
                break;
            case "M":
                System.out.println("\n*** You've selected Mewtwo");
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }
    
}
