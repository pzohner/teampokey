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
public class HelpMenuView {
    
    private String menu;
    
        public HelpMenuView() {
        
        this.menu = "\n"
                    + "\n--------------------------------------------"
                    + "\n| Help Menu                         |"
                    + "\n--------------------------------------------"
                    + "\nG - What is the goal of the game?"
                    + "\nM - How to move"
                    + "\nQ - Quit help menu"
                    + "\n--------------------------------------------";
        
        }  
        void displayHelpMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            
            if(menuOption.toUpperCase().equals("Q")) {
            
                return;
            
            }
            
            done = this.doAction(menuOption);
            
            
        } while (!done);
        
    }
        
        private String getMenuOption() {
        
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
        
    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G":
                this.displayGoalView();
                break;
            case "M":
                this.displayHowToMoveView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }    

    private void displayGoalView() {
        System.out.println("\n The function displayGoalView was called!");
    }

    private void displayHowToMoveView() {
        System.out.println("\n The function displayHowToMoveView was called!");
    }
    
}
