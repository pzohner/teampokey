/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author porterzohner
 */
public class Character implements Serializable {
    
    private String name;
    private Point position;
    private int numberOfPokemon;
    private int numberOfItems;
    private Pokemon[] pokemon;
    private ArrayList<Object> itemList;
    private Location[][] location;
    private Pokemon selectedPokemonAttacker;
    private Pokemon selectedPokemonDefender;
    
    public Character() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
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

    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }

    public ArrayList<Object> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Object> itemList) {
        this.itemList = itemList;
    }
    

    public Location[][] getLocation() {
        return location;
    }

    public void setLocation(Location[][] location) {
        this.location = location;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.position);
        hash = 79 * hash + this.numberOfPokemon;
        hash = 79 * hash + this.numberOfItems;
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
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", position=" + position + ", numberOfPokemon=" + numberOfPokemon + ", numberOfItems=" + numberOfItems + '}';
    }        
}


