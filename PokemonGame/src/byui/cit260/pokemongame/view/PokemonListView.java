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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
