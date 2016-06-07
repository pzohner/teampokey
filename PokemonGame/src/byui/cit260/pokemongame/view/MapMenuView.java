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
public class MapMenuView {
    
     private String menu;
    
    public MapMenuView() {
        
        this.menu = "\n"
                + "\n--------------------------------------------"
                + "\n| Map Menu                                |"
                + "\n--------------------------------------------"
                + "\nMN - Move North"
                + "\nMS - Move South"
                + "\nME - Move East"
                + "\nMW - Move West"
                + "\nE - Explore Square "
                + "\nQ - Quit"
                + "\n --------------------------------------------";
        
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
            case "MN":
                this.mapMoveNorth();
                break;
            case "MS":
                this.mapMoveSouth();
                break;
            case "ME":
                this.mapMoveEast();
                break;
            case "MW":
                this.mapMoveWest();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void mapMoveNorth() {
      System.out.println("\nMN *** moveNorth() function called"); 
    }
    private void mapMoveSouth() {
       System.out.println("\nMS *** moveSouth() function called"); 
    }

    private void mapMoveEast() {
        System.out.println("\nME *** moveEast() function called"); 
    }

    private void mapMoveWest() {
        System.out.println("\nMW *** moveWest() function called"); 
    }
   }
