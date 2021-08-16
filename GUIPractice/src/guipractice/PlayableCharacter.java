/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 *
 * @author omara
 */
public class PlayableCharacter{
    int health;
    int intel;
    int strength;
    int dex;
    int goldValue;

    public int getGoldValue() {
        return goldValue;
    }

    public void setGoldValue(int goldValue) {
        this.goldValue = goldValue;
    }
    
    
    public int PlayableCharacters() {
        Random randomInt = new Random();
        int diceSides = 6;
        int diceRoll = randomInt.nextInt(diceSides);
        diceRoll += 1;
//        String diceRollString = String.valueOf(diceRoll);

        Random randomInt2 = new Random();
        int diceSides2 = 6;
        int diceRoll2 = randomInt2.nextInt(diceSides2);
        diceRoll2 += 1;
//        String diceRollString2 = String.valueOf(diceRoll2);

        Random randomInt3 = new Random();
        int diceSides3 = 6;
        int diceRoll3 = randomInt3.nextInt(diceSides3);
        diceRoll3 += 1;
//        String diceRollString3 = String.valueOf(diceRoll3);
//        dialogueBox.setContentText("The first dice rolled a " + diceRollString
//                + ", the second dice rolled a " + diceRollString2
//                + ", and the third dice rolled a " + diceRollString3 + ".");
//        String hpValueString = String.valueOf(player.health);
//        hpAmount.setText("HP: " + hpValueString);

        int diceTotal = (diceRoll + diceRoll2 + diceRoll3);
//        player.strength = diceTotal;
//        player.dex = diceTotal;
//        player.intel = diceTotal;
        return diceTotal;
    }
//    public int diceResults() {
//        int totalDice = PlayableCharacter();
//        return totalDice;
//    }
//    public int health() {
//        return 20;
//    }
//    

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

//    public int getGoldAmount() {
//        return goldAmount;
//    }
//
//    public void setGoldAmount(int goldAmount) {
//        this.goldAmount = goldAmount;
//    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        //intel = PlayableCharacters();
        this.intel = intel;
        
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        //strength = PlayableCharacters();
        this.strength = strength;
        
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        //dex = PlayableCharacters();
        this.dex = dex;
        
    }
    
    
}
