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
 * @author porterzohner
 */
public class Game implements Serializable {
    
    private String characterOnField;

    
    public Game() {
    }
    
    
    public String getCharacterOnField() {
        return characterOnField;
    }

    public void setCharacterOnField(String characterOnField) {
        this.characterOnField = characterOnField;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.characterOnField);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.characterOnField, other.characterOnField)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "characterOnField=" + characterOnField + '}';
    }

    
    
    
    
}
