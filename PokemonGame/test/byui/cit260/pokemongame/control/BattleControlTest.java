///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.pokemongame.control;
//
//import byui.cit260.pokemongame.model.Pokemon;
//import byui.cit260.pokemongame.model.Potion;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author porterzohner
// */
//public class BattleControlTest {
//
//    public BattleControlTest() {
//    }
//
//    /**
//     * Test of attack method, of class BattleControl.
//     */
//    @Test
//    public void testAttack() {
//        System.out.println("attack");
//        Pokemon pokemonAttacker = new Pokemon();
//        Pokemon pokemonDefender = new Pokemon();
//        BattleControl instance = new BattleControl();
//
//        pokemonAttacker.setStrength(10);
//        pokemonDefender.setHealth(40);
//        pokemonDefender.setDefense(10);
//
//        int expectedResult = 0;
//        //int result = instance.attack(pokemonAttacker, pokemonDefender);
//        //assertEquals(expectedResult, result);
//
//        int min = 30;
//        int max = 39;
//        int expectedHealth = 34;
//        int health = pokemonDefender.getHealth();
//        assertEquals(true, health >= min && health <= max);
//
//        //valid
//        System.out.println("attackTest2");
//        pokemonAttacker = new Pokemon();
//        pokemonDefender = new Pokemon();
//        instance = new BattleControl();
//
//        pokemonAttacker.setStrength(35);
//        pokemonDefender.setHealth(0);
//        pokemonDefender.setDefense(1);
//
//        expectedResult = 0;
//        //result = instance.attack(pokemonAttacker, pokemonDefender);
//       // assertEquals(expectedResult, result);
//
//        min = -44;
//        max = -35;
//        expectedHealth = 34;
//        health = pokemonDefender.getHealth();
//        assertEquals(true, health >= min && health <= max);
//
//        //invalid
//        System.out.println("attackTest3");
//        pokemonAttacker = new Pokemon();
//        pokemonDefender = new Pokemon();
//        instance = new BattleControl();
//
//        pokemonAttacker.setStrength(0);
//        pokemonDefender.setHealth(40);
//        pokemonDefender.setDefense(10);
//
//        expectedResult = -1;
//        //result = instance.attack(pokemonAttacker, pokemonDefender);
//        //assertEquals(expectedResult, result);
//
//        ///invalid2
//        System.out.println("attackTest4");
//        pokemonAttacker = new Pokemon();
//        pokemonDefender = new Pokemon();
//        instance = new BattleControl();
//
//        pokemonAttacker.setStrength(36);
//        pokemonDefender.setHealth(40);
//        pokemonDefender.setDefense(10);
//
//        expectedResult = -1;
//        //result = instance.attack(pokemonAttacker, pokemonDefender);
//        //assertEquals(expectedResult, result);
//
//        //invalid3
//        System.out.println("attackTest5");
//        pokemonAttacker = new Pokemon();
//        pokemonDefender = new Pokemon();
//        instance = new BattleControl();
//
//        pokemonAttacker.setStrength(20);
//        pokemonDefender.setHealth(40);
//        pokemonDefender.setDefense(-1);
//
//        expectedResult = -1;
//        //result = instance.attack(pokemonAttacker, pokemonDefender);
//        //assertEquals(expectedResult, result);
//        //invalid4
//        System.out.println("attackTest6");
//        pokemonAttacker = new Pokemon();
//        pokemonDefender = new Pokemon();
//        instance = new BattleControl();
//
//        pokemonAttacker.setStrength(20);
//        pokemonDefender.setHealth(40);
//        pokemonDefender.setDefense(11);
//
//        expectedResult = -1;
//        //result = instance.attack(pokemonAttacker, pokemonDefender);
//        //assertEquals(expectedResult, result);
//
//        //invalid5
//        System.out.println("attackTest7");
//        pokemonAttacker = new Pokemon();
//        pokemonDefender = new Pokemon();
//        instance = new BattleControl();
//
//        pokemonAttacker.setStrength(20);
//        pokemonDefender.setHealth(101);
//        pokemonDefender.setDefense(10);
//
//        expectedResult = -1;
//        //result = instance.attack(pokemonAttacker, pokemonDefender);
//        assertEquals(expectedResult, result);
//    }
//
//    /**
//     * Test of usePotion method, of class BattleControl.
//     */
//    @Test
//    public void testUsePotion() {
//
//        System.out.println("usePotion");
//
//        // test case 1
//        System.out.println("\tTest case 1");
//
//        // creating objects for test
//        Potion potion = new Potion();
//        Pokemon pokemonHealed = new Pokemon();
//
//        //setting values for healpower and health
//        potion.setHealPower(20);
//        pokemonHealed.setHealth(40);
//
//        // calling the battle control function to test it
//        BattleControl instance = new BattleControl();
//        //instance.usePotion(potion, pokemonHealed);
//        int newHealth = pokemonHealed.getHealth();
//
//        // setting the minimum and maximum values for the test case
//        int minimum = 61;
//        int maximum = 70;
//
//        assertEquals(true, newHealth >= minimum && newHealth <= maximum);
//
//        // test case 2 -- valid
//        // test case 3 -- invalid
//        System.out.println("\tTest case 3");
//        potion = new Potion();
//        potion.setHealPower(0);
//        pokemonHealed.setHealth(40);
//
//        //int result = instance.usePotion(potion, pokemonHealed);
//        int expectedResult = -1;
//
//        //assertEquals(expectedResult, result);
//
//        // test case 4 -- invalid
//        System.out.println("\tTest case 4");
//        potion = new Potion();
//        potion.setHealPower(51);
//        pokemonHealed.setHealth(100);
//
//        //result = instance.usePotion(potion, pokemonHealed);
//        expectedResult = -1;
//
//        //assertEquals(expectedResult, result);
//
//        // test case 4 -- invalid
//        System.out.println("\tTest case 5");
//        potion = new Potion();
//
//        potion.setHealPower(20);
//        pokemonHealed.setHealth(101);
//
//        //result = instance.usePotion(potion, pokemonHealed);
//        expectedResult = -1;
//
//        //assertEquals(expectedResult, result);
//
//        // test case 6 -- invalid
//        System.out.println("\tTest case 6");
//        potion = new Potion();
//
//        potion.setHealPower(50);
//        pokemonHealed.setHealth(50);
//
//        //result = instance.usePotion(potion, pokemonHealed);
//        expectedResult = 0;
//
//        //assertEquals(expectedResult, result);
//
//    }
//
//    /**
//     * Test of captureSuccess method, of class BattleControl.
//     */
//    @Test
//    public void testCaptureSuccess() {
//        System.out.println("captureSuccesstest1");
//        Pokemon captured = new Pokemon();
//        captured.setHealth(70);
//        
//        BattleControl instance = new BattleControl();
//        int expResult = 1;
//        //int result = instance.captureSuccess(captured);
//        //assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//      
//        System.out.println("captureSuccesstest2");
//        captured = new Pokemon();
//        captured.setHealth(103);
//        
//        instance = new BattleControl();
//        expResult = -1;
//        //result = instance.captureSuccess(captured);
//        //assertEquals(expResult, result);
//        // less than 25 expected 0
//        
//        System.out.println("captureSuccesstest3");
//        captured = new Pokemon();
//        captured.setHealth(23);
//        
//        instance = new BattleControl();
//        expResult = 0;
//        //result = instance.captureSuccess(captured);
//        //assertEquals(expResult, result);
//    }
//
//    
//    
//}
