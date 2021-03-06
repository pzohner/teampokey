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
public class Pokemon implements Serializable {
    
    
 
    private String name;
    private String attackType;
    private int strength;
    private int defense;
    private int health; 
    private Location[][] pokemonLocation;
    private Character[] character;
    
    public Pokemon() {
    }
    
    public Pokemon(String name, int strength, int defense, int health) {
        this.name = name;
        this.strength = strength;
        this.defense = defense;
        this.health = health;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String nam) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

   
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.strength;
        hash = 67 * hash + Objects.hashCode(this.attackType);
        hash = 67 * hash + this.defense;
        hash = 67 * hash + this.health;
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
        final Pokemon other = (Pokemon) obj;
        if (this.strength != other.strength) {
            return false;
        }
        if (this.attackType != other.attackType) {
            return false;
        }
        if (this.defense != other.defense) {
            return false;
        }
        if (this.health != other.health) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "type=" + name + ", strength=" + strength + ", attackType=" + attackType + ", defense=" + defense + ", health=" + health + '}';
    }

}
