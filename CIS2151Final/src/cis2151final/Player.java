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

    public int ones, ones1;
    public int twos, twos1;
    public int threes, threes1;
    public int fours, fours1;
    public int fives, fives1;
    public int sixes, sixes1;
    public int threeOfAKind, threeOfAKind1;
    public int fourOfAKind, fourOfAKind1;
    public int fullHouse, fullHouse1;
    public int smallStraight, smallStraight1;
    public int largeStraight, largeStraight1;
    public int yahtzee, yahtzee1;
    public int chance, chance1;
    public int totalScore, totalScore1;
    
    public String ONES, TWOS, THREES, FOURS, FIVES, SIXES, SUM, BONUS,
            THREE_OF_A_KIND, FOUR_OF_A_KIND, FULL_HOUSE, SMALL_STRAIGHT, LARGE_STRAIGHT,
            CHANCE, YAHTZEE, TOTAL_SCORE;

    public ArrayList<String> score = new ArrayList<String>();
    public ArrayList<Integer> scoreInt = new ArrayList<Integer>();
    public ArrayList<Integer> scoreInt1 = new ArrayList<Integer>();

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

        ones1 = 0;
        twos1 = 0;
        threes1 = 0;
        fours1 = 0;
        fives1 = 0;
        sixes1 = 0;
        threeOfAKind1 = 0;
        fourOfAKind1 = 0;
        fullHouse1 = 0;
        smallStraight1 = 0;
        largeStraight1 = 0;
        yahtzee1 = 0;
        chance1 = 0;
        totalScore1 = 0;

        scoreInt.add(ones);
        scoreInt.add(twos);
        scoreInt.add(threes);
        scoreInt.add(fours);
        scoreInt.add(fives);
        scoreInt.add(sixes);
        scoreInt.add(threeOfAKind);
        scoreInt.add(fourOfAKind);
        scoreInt.add(fullHouse);
        scoreInt.add(smallStraight);
        scoreInt.add(largeStraight);
        scoreInt.add(yahtzee);
        scoreInt.add(chance);
        scoreInt.add(totalScore);

        scoreInt1.add(ones);
        scoreInt1.add(twos);
        scoreInt1.add(threes);
        scoreInt1.add(fours);
        scoreInt1.add(fives);
        scoreInt1.add(sixes);
        scoreInt1.add(threeOfAKind);
        scoreInt1.add(fourOfAKind);
        scoreInt1.add(fullHouse);
        scoreInt1.add(smallStraight);
        scoreInt1.add(largeStraight);
        scoreInt1.add(yahtzee);
        scoreInt1.add(chance);
        scoreInt1.add(totalScore);

    }

    public Player(String trash) {
        ONES = " ONES";
        TWOS = " TWOS";
        THREES = " THREES";
        FOURS = " FOURS";
        FIVES = " FIVES";
        SIXES = " SIXES";
        THREE_OF_A_KIND = " THREE_OF_A_KIND";
        FOUR_OF_A_KIND = " FOUR_OF_A_KIND";
        FULL_HOUSE = " FULL_HOUSE";
        SMALL_STRAIGHT = " SMALL_STRAIGHT";
        LARGE_STRAIGHT = " LARGE_STRAIGHT";
        YAHTZEE = " YAHTZEE";
        CHANCE = " CHANCE";
        TOTAL_SCORE = " TOTAL_SCORE";
        score.add(ONES);
        score.add(TWOS);
        score.add(THREES);
        score.add(FOURS);
        score.add(FIVES);
        score.add(SIXES);
        score.add(THREE_OF_A_KIND);
        score.add(FOUR_OF_A_KIND);
        score.add(FULL_HOUSE);
        score.add(SMALL_STRAIGHT);
        score.add(LARGE_STRAIGHT);
        score.add(YAHTZEE);
        score.add(CHANCE);
        score.add(TOTAL_SCORE);
    }

    public String getONES() {
        return ONES;
    }

    public void setONES(String ONES) {
        this.ONES = ONES;
    }

    public String getTWOS() {
        return TWOS;
    }

    public void setTWOS(String TWOS) {
        this.TWOS = TWOS;
    }

    public String getTHREES() {
        return THREES;
    }

    public void setTHREES(String THREES) {
        this.THREES = THREES;
    }

    public String getFOURS() {
        return FOURS;
    }

    public void setFOURS(String FOURS) {
        this.FOURS = FOURS;
    }

    public String getFIVES() {
        return FIVES;
    }

    public void setFIVES(String FIVES) {
        this.FIVES = FIVES;
    }

    public String getSIXES() {
        return SIXES;
    }

    public void setSIXES(String SIXES) {
        this.SIXES = SIXES;
    }

    public String getSUM() {
        return SUM;
    }

    public void setSUM(String SUM) {
        this.SUM = SUM;
    }

    public String getBONUS() {
        return BONUS;
    }

    public void setBONUS(String BONUS) {
        this.BONUS = BONUS;
    }

    public String getTHREE_OF_A_KIND() {
        return THREE_OF_A_KIND;
    }

    public void setTHREE_OF_A_KIND(String THREE_OF_A_KIND) {
        this.THREE_OF_A_KIND = THREE_OF_A_KIND;
    }

    public String getFOUR_OF_A_KIND() {
        return FOUR_OF_A_KIND;
    }

    public void setFOUR_OF_A_KIND(String FOUR_OF_A_KIND) {
        this.FOUR_OF_A_KIND = FOUR_OF_A_KIND;
    }

    public String getFULL_HOUSE() {
        return FULL_HOUSE;
    }

    public void setFULL_HOUSE(String FULL_HOUSE) {
        this.FULL_HOUSE = FULL_HOUSE;
    }

    public String getSMALL_STRAIGHT() {
        return SMALL_STRAIGHT;
    }

    public void setSMALL_STRAIGHT(String SMALL_STRAIGHT) {
        this.SMALL_STRAIGHT = SMALL_STRAIGHT;
    }

    public String getLARGE_STRAIGHT() {
        return LARGE_STRAIGHT;
    }

    public void setLARGE_STRAIGHT(String LARGE_STRAIGHT) {
        this.LARGE_STRAIGHT = LARGE_STRAIGHT;
    }

    public String getCHANCE() {
        return CHANCE;
    }

    public void setCHANCE(String CHANCE) {
        this.CHANCE = CHANCE;
    }

    public String getYAHTZEE() {
        return YAHTZEE;
    }

    public void setYAHTZEE(String YAHTZEE) {
        this.YAHTZEE = YAHTZEE;
    }

    public String getTOTAL_SCORE() {
        return TOTAL_SCORE;
    }

    public void setTOTAL_SCORE(String TOTAL_SCORE) {
        this.TOTAL_SCORE = TOTAL_SCORE;
    }

    public ArrayList<String> getScore() {
        return score;
    }

    public void setScore(ArrayList<String> score) {
        this.score = score;
    }

    public ArrayList<Integer> getScoreInt() {
        return scoreInt;
    }

    public void setScoreInt(ArrayList<Integer> scoreInt) {
        this.scoreInt = scoreInt;
    }

    public ArrayList<Integer> getScoreInt1() {
        return scoreInt1;
    }

    public void setScoreInt1(ArrayList<Integer> scoreInt1) {
        this.scoreInt1 = scoreInt1;
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
