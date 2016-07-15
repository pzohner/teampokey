/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

import byui.cit260.pokemongame.control.GameControl;
import static byui.cit260.pokemongame.control.GameControl.ItemList.potion;
import byui.cit260.pokemongame.model.Game;
import byui.cit260.pokemongame.model.Item;
import byui.cit260.pokemongame.model.Pokeball;
import byui.cit260.pokemongame.model.Pokemon;
import byui.cit260.pokemongame.model.Potion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import pokemongame.PokemonGame;

/**
 *
 * @author savannahkei
 */
public class ItemListView extends View {
     
    private String menu;
    
    ItemListView() {
        
        
        super("\n"
                + "\n--------------------------------------------"
                + "\n| Item List                             |"
                + "\n--------------------------------------------"
                + "\n" 
                + "\nU - Use Items"
                + "\nV - View Pokemon"
                + "\nLR- Get List Reports"
                + "\nSI- Save Item to List File"
                + "\nQ - Quit"
                +" \n  -----------------------------------------");
        
    }
    
    @Override
public boolean doAction(String menuOption) {
        
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
                this.viewPokemon();
                break;
            case "SI":
                System.out.println("SI was called");
                this.saveItemListToFile();
                break; 
            default:
                ErrorView.display("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }

    private void itemNumberOfPokeballs() {
       this.console.println("\n#P *** itemNumberOfPokeballs() function called");
    }

    private void itemNumberOfPotions() {
       this.console.println("\n#PO *** itemNumberOfPotions() function called");
    }

    private void itemNumberOfSuperPotions() {
       this.console.println("\n#SP *** itemNumberOfSuperPotions() function called"); 
    }

    private void itemNumberOfAntidotes() {
        this.console.println("\n#A *** itemNumberOfAntidotes() function called");
    }

    private void useItem() {
       this.console.println("\nU *** useItem() function called");
               HealingMenuView healingMenu = new HealingMenuView(); 
               
               healingMenu.display(); 
               
    }

    private void viewPokemon() {
        
        PokemonListView pokemonList = new PokemonListView();
        
        pokemonList.display();
        
    }

    private void itemNumberOfMasterBalls() {
        this.console.println("\n *** itemNumberOfMasterBalls () function called");
    }

    private void viewCurrentItemList() {
        
        StringBuilder line;
        
        Game game = PokemonGame.getCurrentGame();
        ArrayList<Object> itemList = Item.getTotalItemList(); // in order for this to work, I had to 
                                                              // change the item model layer class
                                                              // getTotalItemList to static
        this.console.println("\n  List of Items");
        line = new StringBuilder("                                          ");
        line.insert(0, "Description");
        line.insert(20, "SuperPotion");
        line.insert(30, "MasterPokeball");
        this.console.println(line.toString());
        
        for (Object item: itemList) {
           line = new StringBuilder("                                      ");
            if (item.getClass() == Pokeball.class) {
               Pokeball pokeball = (Pokeball) item;
               this.console.println(pokeball.getDescription());
           }
           if (item.getClass() == Potion.class) {
               Potion potion = (Potion) item;
               this.console.println(potion.getDescription());
           }
           }
    
        this.console.println("How man items do you think you will receive in this game?");
        int selection = getInt();
        
        if (selection > 5) {
        this.console.println(" Jokes on you, you will only get 5 items total... sorry.");
        }
        else if (selection == 5) {
            this.console.println("Hey you guessed right! you will get 5 items");
        }
        else {
           this.console.println("Hey you guessed right! you will get 5 items");
            
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
            ErrorView.display("\n Please enter a valid number. Try again or press Q to quit.");
        }
        }
        
        
        return number;
    }

    private void saveItemListToFile() {
       this.console.println("\n Enter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();

    try {
            
            GameControl.saveItemList(PokemonGame.getCurrentGame(), filePath);
            
            ArrayList<Object> listOfItems = Item.getTotalItemList(); 
            printItemListReport (listOfItems,filePath);
            console.printf(" The file " + filePath + " was written to successfully");
            
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
 private void printItemListReport(ArrayList<Object> itemList, String outputLocation) {
        
        try (PrintWriter out = new PrintWriter(outputLocation)) {
           
            out.println("\n         Item List            ");
            out.printf("%n%-20s%20s", " Potion", "Heal Power"); 
            out.printf("%n%-20s%20s", "--------", "--------------"); 
            
            for (Object item: itemList) {
                 if (item.getClass() == Potion.class) {
                 Potion potion = (Potion) item;
                 out.printf("%n%-20s%7d",potion.getDescription(),potion.getHealPower()); 
               
            }
               // out.printf("%n%-20s",potion.getDescription()); 
                     
            }  
            
             
            
            
            
            
            
            
//            out.println("\n         Item List            ");
//            out.printf("%n%-20s%10s%10s%20s","Pokeballs", " Potion", " Super Potions", "Antidotes", "Master Balls");
//            out.printf("%n%-20s%10s%10s%20s", "--------", "--------", " ------------ ", "---------", "-----------");
//            
//            for (Object item: itemList) {
//                
//                out.printf("%n%-20s%7d%7d%13d", itemList.getClass().getDescription(); 
//                                             , itemList.getPotions()
//                                             , itemList.getSuperPotions()
//                                             , itemList.getAntidotes ()
//                                             , itemList.getMasterBalls());
//            }  
//            
            
        
        } catch (IOException ex) {
            
            System.out.println("I/) Error: " + ex.getMessage());
        }
 } 
} 