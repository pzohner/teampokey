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
    private ArrayList<Object> totalItemList;
    protected String description;
    
    public Item() {

        }

    public int getAmountOfItem() {
        return amountOfItem;
    }

    public void setAmountOfItem(int amountOfItem) {
        this.amountOfItem = amountOfItem;
    }

    public ArrayList<Object> getTotalItemList() {
        return totalItemList;
    }

    public void setTotalItemList(ArrayList<Object> totalItemList) {
        this.totalItemList = totalItemList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
