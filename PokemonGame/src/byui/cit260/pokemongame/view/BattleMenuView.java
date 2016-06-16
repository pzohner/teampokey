/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.BattleControl;

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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void attack() {
        System.out.println("the Attack function was called");
    }

    private void throwPokeball() {
        System.out.println("the throwPokeball function was called");
    }

    private void useItem() {
        System.out.println("the useItem function was called");
    }

    private void runaway() {
        System.out.println("the runaway function was called");
    }
    
    
}
