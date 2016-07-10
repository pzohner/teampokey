/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import pokemongame.PokemonGame;

/**
 *
 * @author porterzohner
 */
public abstract class View implements ViewInterface {
 
    protected String displayMessage;
    
    protected final BufferedReader keyboard = PokemonGame.getInFile();
    protected final PrintWriter console = PokemonGame.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        
        this.displayMessage = message;
        
    }
    
    @Override
    public void display() {
       
     boolean done = false;
        do {
            
            this.console.println(this.displayMessage);
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
        
        
        String value = "";
        boolean valid = false;
        
        try {
            
        while(!valid) {
            //MainMenuView mainMenuView = new MainMenuView();
            System.out.println(this.displayMessage);
        
        value = keyboard.readLine();
        value = value.trim();
        
        if(value.length() < 1) {
            System.out.println("\n Invalid value: value cannot be blank");
            continue;
           
        }    
        
        break;
        }
        }
        catch (Exception e) {
              System.out.println("Error reading input: " + e.getMessage());
                }
    
     return value;  
     

    }
}