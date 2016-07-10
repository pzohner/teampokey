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
public class StartProgramView extends View{
    
    private String promptMessage;
    
    public StartProgramView() {
        // prompt message
        this.promptMessage = "\n Please enter your name: ";
        
        //display a banner
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
        "\n ***************************************************************"
      + "\n This game is a text based role-playing game. In this game, you will "
      + "\n be creating your very own Pokémon Trainer. You will be starting "
      + "\n in your hometown of Pallet Town and will be able to explore the "
      + "\n map to try and become the best there ever was. You will be traveling" 
      + "\n around the map to catch Pokémon and fill your backpack with "
      + "\n antidotes and potions in order to become the champion of the Pokémon "
      + "\n League. You will be preparing yourself to battle the most recent "
      + "\n champion and best Pokémon Master, Lance, in order to win the "
      + "\n title of Pokémon Master.\n " 
      + "\n After growing up your whole childhood watching Pokémon trainers come in and out "
      + "\n of your town battling to become the best, and have fantasized "
      + "\n of doing the same. A professor in your town is generous enough "
      + "\n to give you a Pokéball and with that you are able to begin your "
      + "\n quest. The Pokémon Master Lance is always waiting for new "
      + "\n challengers but if you aren't properly prepared he will send "
      + "\n  you and your Pokémon packing to the Pokémon Center to revive "
      + "\n your fainted Pokémon.\n " 
      + "\n Everything you need you can find around your town. There is a forest full of "
      + "\n Pokémon for you to catch, as well as items other trainers have "
      + "\n dropped in their journey that you can pick up and find. Your "
      + "\n task is to battle Lance and become the new Pokémon Master. The "
      + "\n game is over when you have successfully defeated Lance.\n " 
      + "\n The game begins in your hometown of Pallet Town with Professor Oak who gives you "
      + "\n a map and a Pokéball and encourages you to start your journey "
      + "\n and fulfill your destiny. During the game you will need to catch "
      + "\n 4 Pokémon and find any helpful items you can in order to be prepared "
      + "\n to challenge Lance and become the new Pokémon Master.");
        
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
            System.out.println("\n" + this.promptMessage);
        
        value = keyboard.nextLine();
        value = value.trim();
        
        if(value.length() < 1) {
            ErrorView.display ("\n Invalid value: value cannot be blank");
            continue;         
        }
       break;
    }
     return value;   
}

    @Override
    public boolean doAction(String playersName) {
      
        
        if (playersName.length() < 2) {
            //ErrorView.display 
            ErrorView.display("\nInvalid players name: "
            +  "The name must be greater than one character in length");
            return false;
        }
    
        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            
            //ErrorView.display 
            ErrorView.display("\n Error creating the player");
            return false;
        }
        
        // display next view
        this.displayNextView(player);
        
        return true;
    }

    private void displayNextView(Player player) {
        
        System.out.println("\n======================================"
                         + "\n Welcome to the game " + player.getName() 
                         + "\n We hope you have a lot of fun!"
                         + "\n======================================");
       
        getAge();
        
                //create mainmenu object
                MainMenuView mainMenuView = new MainMenuView(); 
                
                //display main menu view
                mainMenuView.display();
                
            
    }
///do we do it with the ba answers that we dont want or that wont work
    private void getAge() {

        System.out.println("How old are you? ");
        int selection = getInt();
        
        if (selection > 30) {
            System.out.println("Maybe you should find something better to do with your time...");
        }
        else if (selection < 13) {
            System.out.println("Enjoy the game youngster!");
        }
        else {
            System.out.println("Thank you for your age");
            
        }
        }
    
    public int getInt(){
        
        int number = 0;
        
        while(number == 0) {
            String value = this.getInput();
            value = value.trim().toUpperCase();

        if (value.equals("Q")) 
            break;
        try {
        number = Integer.parseInt(value);
        }
        catch(NumberFormatException nf) {
            // ErrorView.display 
            ErrorView.display("\n Please enter a valid number. Try again or press Q to quit.");
        }
        }
        
        
        return number;
    }

}

       
    
    


