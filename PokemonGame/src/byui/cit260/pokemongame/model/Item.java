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
    protected static String description;
    
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

    public void setTotalItemList(ArrayList<Object> totalItemList) {
        this.totalItemList = totalItemList;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) { // changed this to Item.description to see if it works
        Item.description = description;
    }
    
}
