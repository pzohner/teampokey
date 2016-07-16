/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.model;

import java.io.Serializable; 
import java.util.ArrayList;
/**
 *
 * @author savannahkei
 */
public class Item  implements Serializable {
    private int amountOfItem;
    private static ArrayList<Object> totalItemList;
    protected String description;
    
    public Item() {
            
        }

    public int getAmountOfItem() {
        return amountOfItem;
    }

    public void setAmountOfItem(int amountOfItem) {
        this.amountOfItem = amountOfItem;
    }

    public static ArrayList<Object> getTotalItemList() {
        return totalItemList;
    }

    public static void setTotalItemList(ArrayList<Object> totalItemList) {
        Item.totalItemList = totalItemList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { // changed this to Item.description to see if it works
        this.description = description;
    }
    
}
