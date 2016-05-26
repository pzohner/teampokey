/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemongame.control;

import byui.cit260.pokemongame.model.Pokemon;
import byui.cit260.pokemongame.model.Potion;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author porterzohner
 */
public class BattleControlTest {
    
    public BattleControlTest() {
    }

    /**
     * Test of attack method, of class BattleControl.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        Pokemon pokemonAttacker = null;
        Pokemon pokemonDefender = null;
        BattleControl instance = new BattleControl();
        int expResult = 0;
        int result = instance.attack(pokemonAttacker, pokemonDefender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    }

    /**
     * Test of usePotion method, of class BattleControl.
     */
    @Test
    public void testUsePotion() {
        
        System.out.println("usePotion");
        
        
        // test case 1
        System.out.println("\tTest case 1");
        
        // creating objects for test
        Potion potion = new Potion();
        Pokemon pokemonHealed = new Pokemon();
        
        //setting values for healpower and health
        potion.setHealPower(20);
        pokemonHealed.setHealth(40);
        
        // calling the battle control function to test it
        BattleControl instance = new BattleControl();
        instance.usePotion(potion, pokemonHealed);
        int newHealth = pokemonHealed.getHealth();
               
         // setting the minimum and maximum values for the test case
        int minimum = 61;
        int maximum = 70;
        
        assertEquals(true, newHealth >= minimum && newHealth <= maximum);
        
        // test case 2 -- valid
        
        
        // test case 3 -- invalid
        System.out.println("\tTest case 3");
        potion = new Potion();
        potion.setHealPower(0);
        pokemonHealed.setHealth(40);

        int result = instance.usePotion(potion, pokemonHealed);
        int expectedResult = -1;
       
        assertEquals(expectedResult, result);
        
        
        // test case 4 -- invalid
        System.out.println("\tTest case 4");
        potion = new Potion();
        potion.setHealPower(51);
        pokemonHealed.setHealth(100);

        result = instance.usePotion(potion, pokemonHealed);
        expectedResult = -1;
       
        assertEquals(expectedResult, result);
        
        // test case 4 -- invalid
        System.out.println("\tTest case 5");
        potion = new Potion();
        
        potion.setHealPower(20);
        pokemonHealed.setHealth(101);

        result = instance.usePotion(potion, pokemonHealed);
        expectedResult = -1;
       
        assertEquals(expectedResult, result);
        
         // test case 6 -- invalid
        System.out.println("\tTest case 6");
        potion = new Potion();
        
        potion.setHealPower(50);
        pokemonHealed.setHealth(50);

        result = instance.usePotion(potion, pokemonHealed);
        expectedResult = 0;
       
        assertEquals(expectedResult, result);
        
    }
    
}
