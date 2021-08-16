/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.util.Random;

/**
 *
 * @author omara
 */
public class NonPlayerCharacter {

    int health;
    int intel;
    int strength;
    int dex;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }
}

//    private void NonPlayerCharacters() {
//        Random monsterRand = new Random();
//        int limit = 6;
//        int monsterStats = monsterRand.nextInt(limit);
//        monsterStats += 1;
//        int npcHealth = monsterStats;
//        
//        health = npcHealth;
//        String npcHpString = String.valueOf(health);
//        dex = (health * 2);
//        intel = (health * 2);
//        strength = (health * 2);
//        
//        //return npcHealth;
//    }
//}
