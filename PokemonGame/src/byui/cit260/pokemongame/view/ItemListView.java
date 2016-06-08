/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import java.util.Scanner;

/**
 *
 * @author savannahkei
 */
public class ItemListView {
     
    private String menu;
    
    ItemListView() {
        
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n| Item List                             |"
                + "\n--------------------------------------------"
                + "\n#P - Number Of Pokeballs   -  40"
                + "\n#PO - Number Of Potions   -  80"
                + "\n#SP - Number Super Potions -  20"
                + "\n#A - Number of Antidotes - 100"
                + "\n#M - Number of Master Balls  - 100"
                + "\nU - Use Items    - 100"
                + "\nV - View Pokemon"
                + "\nQ - Quit"
                +" \n  -----------------------------------------";
    }
    
 void displayMapMenuView() {
        
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

private boolean doAction(String menuOption) {
        
     menuOption = menuOption.toUpperCase();
        
        switch (menuOption) {
            case "#P":
                this.itemNumberOfPokeballs();
                break;
            case "#OP":
                this.itemNumberOfPotions();
                break;
            case "#SP":
                this.itemNumberOfSuperPotions();
                break;
            case "#A":
                this.itemNumberOfAntidotes();
                break;
            case "#MB":
                this.itemNumberOfMasterBalls ();
                break; 
            case "U":
                this.useItem();
                break;
            case "V":
                this.viewPokemon() ;
                break; 
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void itemNumberOfPokeballs() {
       System.out.println("\n#P *** itemNumberOfPokeballs() function called");
    }

    private void itemNumberOfPotions() {
       System.out.println("\n#PO *** itemNumberOfPotions() function called");
       
    }

    private void itemNumberOfSuperPotions() {
       System.out.println("\n#SP *** itemNumberOfSuperPotions() function called"); 
    }

    private void itemNumberOfAntidotes() {
        System.out.println("\n#A *** itemNumberOfAntidotes() function called");
    }

    private void useItem() {
       System.out.println("\nU *** useItem() function called");
    }

    private void viewPokemon() {
        System.out.println("\n *** viewPokemon () function called");
    }

    private void itemNumberOfMasterBalls() {
        System.out.println("\n *** itemNumberOfMasterBalls () function called");
    
    }

    
    }

   

 
