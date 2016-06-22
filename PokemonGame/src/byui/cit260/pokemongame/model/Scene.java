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
public class Scene implements Serializable {
    
    private String nameOfScene;
    private String description;
    private Location[][] location; // each scene has many locations // CHECK!
    
    public Scene() {
    }
    
    public String getNameOfScene() {
        return nameOfScene;
    }

    public void setNameOfScene(String nameOfScene) {
        this.nameOfScene = nameOfScene;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nameOfScene);
        hash = 97 * hash + Objects.hashCode(this.description);
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.nameOfScene, other.nameOfScene)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "nameOfScene=" + nameOfScene + ", description=" + description + '}';
    }

    
    
    
    
}
