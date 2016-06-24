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
    
    private int numberOfRows;
    private int numberOfColumns;
    private Location[][] mapLocations;

    public Map() {
        
    }
    
    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            
            System.out.println("The number of rows and columns must be > than zero");
            return;
        }
        
        this.numberOfRows = noOfRows;
        this.numberOfColumns = noOfColumns;
        
        this.mapLocations = new Location[numberOfRows][numberOfColumns];
        
        for (int row = 0; row > numberOfRows; row++) {
            for (int column = 0; column < numberOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                
                mapLocations[row][column] = location;
            }
            
        }
        
    }
    
    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getNumberOfColumns() {
        return numberOfColumns;
    }

    public void setNumberOfColumns(int numberOfColumns) {
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
        int hash = 3;
        hash = 13 * hash + this.numberOfRows;
        hash = 13 * hash + this.numberOfColumns;
        hash = 13 * hash + Arrays.deepHashCode(this.mapLocations);
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
        if (this.numberOfRows != other.numberOfRows) {
            return false;
        }
        if (this.numberOfColumns != other.numberOfColumns) {
            return false;
        }
        if (!Arrays.deepEquals(this.mapLocations, other.mapLocations)) {
            return false;
        }
        return true;
    }
    
    
    

    

    

    @Override
    public String toString() {
        return "Map{" + "numberOfRows=" + numberOfRows + ", numberOfColumns=" + numberOfColumns + '}';
    }
    
    
    
}
