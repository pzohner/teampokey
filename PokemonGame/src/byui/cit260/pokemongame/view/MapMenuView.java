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
public class MapMenuView extends View {
    
     private String menu;
    
    public MapMenuView() {
        
        super ("\n"
                + "\n--------------------------------------------"
                + "\n| Map Menu                                |"
                + "\n--------------------------------------------"
                + "\nMN - Move North"
                + "\nMS - Move South"
                + "\nME - Move East"
                + "\nMW - Move West"
                + "\nE - Explore Square "
                + "\nQ - Quit"
                + "\n --------------------------------------------");
        
    }
    
    @Override
public boolean doAction(String menuOption) {
        
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
