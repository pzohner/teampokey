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
public class HelpMenuView extends View {
    
    private String menu;
    
        public HelpMenuView() {
        
        super( "\n"
                    + "\n--------------------------------------------"
                    + "\n| Help Menu                         |"
                    + "\n--------------------------------------------"
                    + "\nG - What is the goal of the game?"
                    + "\nM - How to move"
                    + "\nQ - Quit help menu"
                    + "\n--------------------------------------------");
        
        }
       
        @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.displayGoalView();
                break;
            case "M":
                this.displayHowToMoveView();
                break;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }    

    private void displayGoalView() {
        this.console.println("\n The function displayGoalView was called!");
    }

    private void displayHowToMoveView() {
        this.console.println("\n The function displayHowToMoveView was called!");
    }
    
}
