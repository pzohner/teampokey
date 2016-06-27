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
 * @author savannahkei
 */
public class Pokeball extends Item implements Serializable {
  

private boolean isMaster; 

    public Pokeball() {
    }
    
    public Pokeball(String description, boolean isMaster) {
        
        this.description = description;
        this.isMaster = isMaster;
    }
    
    

    
    public boolean IsMaster() {
        return isMaster;
    }

    public void setIsMaster(boolean isMaster) {
        this.isMaster = isMaster;
        
    
    }

    @Override
    public String toString() {
        return "Pokeball{" + "isMaster=" + isMaster + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (this.isMaster ? 1 : 0);
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
        final Pokeball other = (Pokeball) obj;
        if (this.isMaster != other.isMaster) {
            return false;
        }
        return true;
    }



}
