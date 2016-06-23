/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author porterzohner
 */
public class Map implements Serializable {
    
    private int[] numberOfRows;
    private int[] numberOfColumns;
    private Location[][] mapLocations;

    public Map() {
    }
    
    
    public int[] getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int[] numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int[] getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int[] numberOfColumns) {
        this.numberOfColumns = numberOfColumns;
    }

    public Location[][] getMapLocations() {
        return mapLocations;
    }

    public void setMapLocations(Location[][] mapLocations) {
        this.mapLocations = mapLocations;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Arrays.hashCode(this.numberOfRows);
        hash = 29 * hash + Arrays.hashCode(this.numberOfColumns);
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
        final Map other = (Map) obj;
        if (!Arrays.equals(this.numberOfRows, other.numberOfRows)) {
            return false;
        }
        if (!Arrays.equals(this.numberOfColumns, other.numberOfColumns)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns + '}';
    }
    
    
    
}
