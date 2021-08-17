/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis2151final;

import java.util.ArrayList;

/**
 *
 * @author omara
 */
public class Player {

    public int ones;
    public int twos;
    public int threes;
    public int fours;
    public int fives;
    public int sixes;
    public int threeOfAKind;
    public int fourOfAKind;
    public int fullHouse;
    public int smallStraight;
    public int largeStraight;
    public int yahtzee;
    public int chance;
    public int totalScore;
    
    public boolean ONES, TWOS, THREES, FOURS, FIVES, SIXES, SUM, BONUS,
            THREE_OF_A_KIND, FOUR_OF_A_KIND, FULL_HOUSE, SMALL_STRAIGHT, LARGE_STRAIGHT,
            CHANCE, YAHTZEE, TOTAL_SCORE = false;
//
//    public ArrayList<String> score = new ArrayList<String>();
//    public ArrayList<Integer> scoreInt = new ArrayList<Integer>();
//    public ArrayList<Integer> scoreInt1 = new ArrayList<Integer>();

    public Player() {
        ones = 0;
        twos = 0;
        threes = 0;
        fours = 0;
        fives = 0;
        sixes = 0;
        threeOfAKind = 0;
        fourOfAKind = 0;
        fullHouse = 0;
        smallStraight = 0;
        largeStraight = 0;
        yahtzee = 0;
        chance = 0;
        totalScore = 0;
//
//        scoreInt.add(ones);
//        scoreInt.add(twos);
//        scoreInt.add(threes);
//        scoreInt.add(fours);
//        scoreInt.add(fives);
//        scoreInt.add(sixes);
//        scoreInt.add(threeOfAKind);
//        scoreInt.add(fourOfAKind);
//        scoreInt.add(fullHouse);
//        scoreInt.add(smallStraight);
//        scoreInt.add(largeStraight);
//        scoreInt.add(yahtzee);
//        scoreInt.add(chance);
//        scoreInt.add(totalScore);
//
//        scoreInt1.add(ones);
//        scoreInt1.add(twos);
//        scoreInt1.add(threes);
//        scoreInt1.add(fours);
//        scoreInt1.add(fives);
//        scoreInt1.add(sixes);
//        scoreInt1.add(threeOfAKind);
//        scoreInt1.add(fourOfAKind);
//        scoreInt1.add(fullHouse);
//        scoreInt1.add(smallStraight);
//        scoreInt1.add(largeStraight);
//        scoreInt1.add(yahtzee);
//        scoreInt1.add(chance);
//        scoreInt1.add(totalScore);

    }

    public Player(String trash) {
//        ONES = " ONES";
//        TWOS = " TWOS";
//        THREES = " THREES";
//        FOURS = " FOURS";
//        FIVES = " FIVES";
//        SIXES = " SIXES";
//        THREE_OF_A_KIND = " THREE_OF_A_KIND";
//        FOUR_OF_A_KIND = " FOUR_OF_A_KIND";
//        FULL_HOUSE = " FULL_HOUSE";
//        SMALL_STRAIGHT = " SMALL_STRAIGHT";
//        LARGE_STRAIGHT = " LARGE_STRAIGHT";
//        YAHTZEE = " YAHTZEE";
//        CHANCE = " CHANCE";
//        TOTAL_SCORE = " TOTAL_SCORE";
//        score.add(ONES);
//        score.add(TWOS);
//        score.add(THREES);
//        score.add(FOURS);
//        score.add(FIVES);
//        score.add(SIXES);
//        score.add(THREE_OF_A_KIND);
//        score.add(FOUR_OF_A_KIND);
//        score.add(FULL_HOUSE);
//        score.add(SMALL_STRAIGHT);
//        score.add(LARGE_STRAIGHT);
//        score.add(YAHTZEE);
//        score.add(CHANCE);
//        score.add(TOTAL_SCORE);
    }

    public boolean isONES() {
        return ONES;
    }

    public void setONES(boolean ONES) {
        this.ONES = ONES;
    }

    public boolean isTWOS() {
        return TWOS;
    }

    public void setTWOS(boolean TWOS) {
        this.TWOS = TWOS;
    }

    public boolean isTHREES() {
        return THREES;
    }

    public void setTHREES(boolean THREES) {
        this.THREES = THREES;
    }

    public boolean isFOURS() {
        return FOURS;
    }

    public void setFOURS(boolean FOURS) {
        this.FOURS = FOURS;
    }

    public boolean isFIVES() {
        return FIVES;
    }

    public void setFIVES(boolean FIVES) {
        this.FIVES = FIVES;
    }

    public boolean isSIXES() {
        return SIXES;
    }

    public void setSIXES(boolean SIXES) {
        this.SIXES = SIXES;
    }

    public boolean isTHREE_OF_A_KIND() {
        return THREE_OF_A_KIND;
    }

    public void setTHREE_OF_A_KIND(boolean THREE_OF_A_KIND) {
        this.THREE_OF_A_KIND = THREE_OF_A_KIND;
    }

    public boolean isFOUR_OF_A_KIND() {
        return FOUR_OF_A_KIND;
    }

    public void setFOUR_OF_A_KIND(boolean FOUR_OF_A_KIND) {
        this.FOUR_OF_A_KIND = FOUR_OF_A_KIND;
    }

    public boolean isFULL_HOUSE() {
        return FULL_HOUSE;
    }

    public void setFULL_HOUSE(boolean FULL_HOUSE) {
        this.FULL_HOUSE = FULL_HOUSE;
    }

    public boolean isSMALL_STRAIGHT() {
        return SMALL_STRAIGHT;
    }

    public void setSMALL_STRAIGHT(boolean SMALL_STRAIGHT) {
        this.SMALL_STRAIGHT = SMALL_STRAIGHT;
    }

    public boolean isLARGE_STRAIGHT() {
        return LARGE_STRAIGHT;
    }

    public void setLARGE_STRAIGHT(boolean LARGE_STRAIGHT) {
        this.LARGE_STRAIGHT = LARGE_STRAIGHT;
    }

    public boolean isCHANCE() {
        return CHANCE;
    }

    public void setCHANCE(boolean CHANCE) {
        this.CHANCE = CHANCE;
    }

    public boolean isYAHTZEE() {
        return YAHTZEE;
    }

    public void setYAHTZEE(boolean YAHTZEE) {
        this.YAHTZEE = YAHTZEE;
    }

    public boolean isTOTAL_SCORE() {
        return TOTAL_SCORE;
    }

    public void setTOTAL_SCORE(boolean TOTAL_SCORE) {
        this.TOTAL_SCORE = TOTAL_SCORE;
    }

   
    public int getOnes() {
        return ones;
    }

    public void setOnes(int ones) {
        this.ones = ones;
    }

    public int getTwos() {
        return twos;
    }

    public void setTwos(int twos) {
        this.twos = twos;
    }

    public int getThrees() {
        return threes;
    }

    public void setThrees(int threes) {
        this.threes = threes;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        this.fives = fives;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public int getThreeOfAKind() {
        return threeOfAKind;
    }

    public void setThreeOfAKind(int threeOfAKind) {
        this.threeOfAKind = threeOfAKind;
    }

    public int getFourOfAKind() {
        return fourOfAKind;
    }

    public void setFourOfAKind(int fourOfAKind) {
        this.fourOfAKind = fourOfAKind;
    }

    public int getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getSmallStraight() {
        return smallStraight;
    }

    public void setSmallStraight(int smallStraight) {
        this.smallStraight = smallStraight;
    }

    public int getLargeStraight() {
        return largeStraight;
    }

    public void setLargeStraight(int largeStraight) {
        this.largeStraight = largeStraight;
    }

    public int getYahtzee() {
        return yahtzee;
    }

    public void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }
}
