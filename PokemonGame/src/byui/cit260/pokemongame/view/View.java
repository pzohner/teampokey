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
public abstract class View implements ViewInterface {
 
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message) {
        
        this.displayMessage = message;
        
    }
    
    @Override
    public void display() {
       
     boolean done = false;
        do {
            
            String value = this.getInput();
            
            if(value.toUpperCase().equals("Q")) {
            
                return;
            
            }
            
            done = this.doAction(value);
            
            
        } while (!done);
    }
//    @Override
//    public boolean doAction(String value)
//    {
//       return false;
//    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            //MainMenuView mainMenuView = new MainMenuView();
            System.out.println(this.displayMessage);
        
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
}
