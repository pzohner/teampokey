/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import byui.cit260.pokemongame.model.Player;
import java.util.Scanner;

/**
 *
 * @author porterzohner
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView() {
        // prompt message
        this.promptMessage = "/n Please enter your name: ";
        
        //display a banner
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
        "\n ***************************************************************"
      + "\nThis game is a text based role-playing game. In this game, you will "
      + "\nbe creating your very own Pokémon Trainer. You will be starting"
      + "\n in your hometown of Pallet Town and will be able to explore the "
      + "\nmap to try and become the best there ever was. You will be traveling" 
      + "\n around the map to catch Pokémon and fill your backpack with "
      + "\nantidotes and potions in order to become the champion of the Pokémon "
      + "\nLeague. You will be preparing yourself to battle the most recent"
      + "\n champion and best Pokémon Master, Lance, in order to win the"
      + "\n title of Pokémon Master.\n" 
      + "\nAfter growing up your whole childhood watching Pokémon trainers come in and out "
      + "\nof your town battling to become the best, and have fantasized"
      + "\n of doing the same. A professor in your town is generous enough "
      + "\nto give you a Pokéball and with that you are able to begin your"
      + "\n quest. The Pokémon Master Lance is always waiting for new "
      + "\nchallengers but if you aren't properly prepared he will send"
      + "\n you and your Pokémon packing to the Pokémon Center to revive "
      + "\nyour fainted Pokémon.\n" +
        "\n" + "Everything you need you can find around your town. There is a forest full of "
      + "\nPokémon for you to catch, as well as items other trainers have"
      + "\n dropped in their journey that you can pick up and find. Your "
      + "\ntask is to battle Lance and become the new Pokémon Master. The "
      + "\ngame is over when you have successfully defeated Lance.\n" +
      "\n" +
      "\nThe game begins in your hometown of Pallet Town with Professor Oak who gives you "
      + "\na map and a Pokéball and encourages you to start your journey "
      + "\nand fulfill your destiny. During the game you will need to catch"
      + "\n 4 Pokémon and find any helpful items you can in order to be prepared"
      + "\nto challenge Lance and become the new Pokémon Master.");
        
    }

    public void displayStartProgramView() {
       
        boolean done = false;
        do {
            
            String playersName = this.getPlayerName();
            if(playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
            
        } while (!done);
    }

    private String getPlayerName() {
        
        
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while(!valid) {
            System.out.println("/n" + this.promptMessage);
        
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

    private boolean doAction(String playersName) {
      
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
            +  "The name must be greater than one character in length");
            return false;
        }
    
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            
            System.out.println("\n Error creating the player");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        
        System.out.println("\n======================================"
                         + "\n Welcome to the game" + player.getName() 
                         + "\n We hope you have a lot of fun!"
                         + "\n======================================");
       
                //create mainmenu object
                MainMenuView mainMenuView = new MainMenuView(); 
                
                //display main menu view
                mainMenuView.displayMainMenuView();
    }
}

