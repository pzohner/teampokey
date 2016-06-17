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
                +"\nA-  Antidote"
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
            case "A":
                this.useAntidote();
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
{       System.out.println("use the super potion, method being called");
}

public void useAntidote()
{       System.out.println("use the Antidote, method beingcalled");
}

public void useBack()
{       System.out.println("use the Back, method being called"); 
}
};


 