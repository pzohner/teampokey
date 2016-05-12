/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author porterzohner
 */
public class Character implements Serializable {
    
    private String name;
    private int[][] position;
    private int numberOfPokemon;
    private int numberOfItems;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[][] getPosition() {
        return position;
    }

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public int getNumberOfPokemon() {
        return numberOfPokemon;
    }

    public void setNumberOfPokemon(int numberOfPokemon) {
        this.numberOfPokemon = numberOfPokemon;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Arrays.deepHashCode(this.position);
        hash = 67 * hash + this.numberOfPokemon;
        hash = 67 * hash + this.numberOfItems;
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
        final Character other = (Character) obj;
        if (this.numberOfPokemon != other.numberOfPokemon) {
            return false;
        }
        if (this.numberOfItems != other.numberOfItems) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Arrays.deepEquals(this.position, other.position)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", position=" + position + ", numberOfPokemon=" + numberOfPokemon + ", numberOfItems=" + numberOfItems + '}';
    }

        
    
    
    
}