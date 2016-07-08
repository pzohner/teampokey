/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.view;

/**
 *
 * @author savannahkei
 */
public class HealingMenuView  extends View {
    
    private String menu; 
    
    HealingMenuView() {
        
        super("\n"
                +"\n--------------------------------------------"
                +"\n| Healing Menu View                        |"
                +"\n--------------------------------------------"
                +"\nP-  Potions"
                +"\nSP- Super Potions"
                +"\nB-  Back"
                +"\n--------------------------------------------"); 
    }
    
    @Override
public boolean doAction(String value) {
        
     value = value.toUpperCase();
        
        switch (value) {
            case "P":
                this.usePotion();
                break;
            case "SP":
                this.useSuperPotion();
                break;
            case "B":
                this.useBack();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
            
        }
        return false;
    }
public void usePotion(){
        System.out.println("use the potion");

}

public void useSuperPotion()
{       
 
    System.out.println("How many Super Potions do you think you're going to get?");
    double SuperPotion = getDoubleNumber();
    
    if (SuperPotion < 5) 
     System.out.print("You're not allowed a super potion unless you're a real witch"); 

}

public Double getDoubleNumber() {
    
    Double number = null;
        
        while(number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();

        if (value.equals("Q")) 
            break;
        try {
        number = Double.parseDouble(value);
        }
        catch(NumberFormatException nf) {
            System.out.print("\n You're not allowed a super potion unless you're a real witch");
        }
        }
        
        return number;
    }

public void useBack() {       
    System.out.println("use the Back, method being called"); 
        }
};


 