/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.model;

import java.io.Serializable;
import java.util.Objects;


/**
 * 
 *
 * @author savannahkei
 */
public class Potion implements Serializable {

    private int healPower ; 

    public Potion() {
    }
    
 

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.healPower);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Potion other = (Potion) obj;
        if (!Objects.equals(this.healPower, other.healPower)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Potion{" + "healPower=" + healPower + '}';
    }

  
    
    

            
    
}
