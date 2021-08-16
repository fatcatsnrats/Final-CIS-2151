/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author omara
 */
public class FXMLController implements Initializable {

    int goldValue; ///
    int health;
    int dex;
    int strength;
    //int npcHp;
    int intel;
    //int pcStrength;
    //int pcIntel;
    //int pcDex;
    PlayableCharacter player;
    NonPlayerCharacter npc;

    @FXML
    private Label hpAmount;
    @FXML
    private Label goldAmount;
    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Button eastButton;
    @FXML
    private Button westButton;
    @FXML
    private Line northWall;
    @FXML
    private Line westWall;
    @FXML
    private Line southWall;
    @FXML
    private Line eastWall;
    @FXML
    private Button searchButton;
    @FXML
    private Button sleepButton;
    @FXML
    private Button fightButton;
    @FXML
    private Button runButton;
    @FXML
    private Button rollDice;
    @FXML
    private VBox leftPane;
    @FXML
    private BorderPane roomsPane;
    @FXML
    private Button continueButton;
    @FXML
    private Label pcStrengthLabel;
    @FXML
    private Label pcIntelLabel;
    @FXML
    private Label pcDexLabel;
    @FXML
    private Label npcIntelLabel;
    @FXML
    private Label npcDexLabel;
    @FXML
    private Label npcHpLabel;
    @FXML
    private Button continueFight;
    @FXML
    private VBox leftPaneStats;
    @FXML
    private VBox rightPaneStats;
    @FXML
    private Label npcStrengthLabel;
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private Label Label4;

    public FXMLController() {
//        player = new PlayableCharacter();
//        npc = new NonPlayerCharacter();
//        player.setGoldValue(0);
//        player.setHealth(20);

        player = new PlayableCharacter();
        npc = new NonPlayerCharacter();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        leftPane.setVisible(false);
        searchButton.setVisible(false);
        sleepButton.setVisible(false);
        fightButton.setVisible(false);
        runButton.setVisible(false);
        roomsPane.setVisible(false);
        rollDice.setVisible(true);

        leftPaneStats.setVisible(false);
        rightPaneStats.setVisible(false);
        //Text 

        player.setGoldValue(0);
        player.setHealth(20);

        // TODO
    }

    @FXML
    private void northButton(ActionEvent event) {
        northButton.setVisible(false);
        southButton.setVisible(false);
        eastButton.setVisible(false);
        westButton.setVisible(false);
        //dialogueBox.set("You have entered the north room");
        Label1.setText("You have entered the north room");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");
        roomEncounter();

    }

    @FXML
    private void southButton(ActionEvent event) {

        northButton.setVisible(false);
        southButton.setVisible(false);
        eastButton.setVisible(false);
        westButton.setVisible(false);
        Label1.setText("You have entered the south room");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");
        roomEncounter();

    }

    @FXML
    private void eastButton(ActionEvent event) {

        northButton.setVisible(false);
        southButton.setVisible(false);
        eastButton.setVisible(false);
        westButton.setVisible(false);
        Label1.setText("You have entered the east room");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");
        roomEncounter();

    }

    @FXML
    private void westButton(ActionEvent event) {

        northButton.setVisible(false);
        southButton.setVisible(false);
        eastButton.setVisible(false);
        westButton.setVisible(false);
        Label1.setText("You have entered the west room");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");
        roomEncounter();

    }

    @FXML
    private void searchButton(ActionEvent event) {
        player.dex = player.getDex();
        player.health = player.getHealth();
        player.goldValue = player.getGoldValue();

        fightButton.setVisible(false);
        runButton.setVisible(false);
        sleepButton.setVisible(false);
        searchButton.setVisible(false);
        Label1.setText("");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");
        Random goldRand = new Random();
        int goldDice = 20;
        int goldEncounter = goldRand.nextInt(goldDice);
        goldEncounter++;
        if (goldEncounter < player.intel) {
            player.goldValue += 500;
            String goldValueString = String.valueOf(player.goldValue);
            goldAmount.setText("Gold: " + goldValueString);
            Label1.setText("You have found 500 gold!");
        } else {
            Label1.setText("Your search came up empty.");
        }
        if (player.health > 0) {
            continueButton.setVisible(true);
        } else {
            gameOver();
        }
        player.setGoldValue(player.goldValue);
        player.setHealth(player.health);
    }

    @FXML
    private void sleepButton(ActionEvent event) {
        fightButton.setVisible(false);
        runButton.setVisible(false);
        sleepButton.setVisible(false);
        searchButton.setVisible(false);
        Label1.setText("");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");

        

        player.dex = player.getDex();
        player.health = player.getHealth();
        npc.strength = npc.getStrength();

        Random sleepRand = new Random();
        int sleepChance = 6;
        int safeSleep = sleepRand.nextInt(sleepChance);
        if (safeSleep == 0) {
            Random fightRand = new Random();
            int fightChance = 20;
            int fightEncounter = fightRand.nextInt(fightChance);
            fightEncounter++;
            if (fightEncounter >= player.dex) {
                Label1.setText("A monster has snuck up on you in "
                        + "your sleep and got a hit on you!");
                if ((npc.strength / 3) < 1) {
                    player.health -= 1;
                } else {
                player.health -= (npc.strength / 3);
                }
                String hpValueString = String.valueOf(player.health);
                if (player.health < 1) {
                    hpAmount.setText("HP: 0");
                } else {
                hpAmount.setText("HP: " + hpValueString);
                }
            } else {
                
                String hpValueString = String.valueOf(player.health);
                hpAmount.setText("HP: " + hpValueString);
                Label1.setText("A monster has snuck up on you in "
                        + "your sleep and missed their attack!");
            }
            if (player.health > 0) {
                continueButton.setVisible(true);

                //wallGenerator();
            } else {
                gameOver();
            }
            player.setHealth(player.health);
            String hpValueString = String.valueOf(player.health);
            if (player.health < 1) {
                    hpAmount.setText("HP: 0");
                } else {
                hpAmount.setText("HP: " + hpValueString);
                }

        } else {
            Label1.setText("You had a good nights rest and have "
                    + "regained your full health!");
            player.health = 20;
            String hpValueString = String.valueOf(player.health);
            hpAmount.setText("HP: " + hpValueString);
            continueButton.setVisible(true);

        }

        player.setHealth(player.health);
    }

    @FXML
    private void fightButton(ActionEvent event) {
        fightButton.setVisible(false);
        runButton.setVisible(false);
        sleepButton.setVisible(false);
        searchButton.setVisible(false);
        Label1.setText("");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");

        //monsterStatsRand();
        player.health = player.getHealth();
        player.strength = player.getStrength();
        player.dex = player.getDex();
        npc.health = npc.getHealth();
        npc.intel = npc.getIntel();
        npc.strength = npc.getStrength();
        npc.dex = npc.getDex();

        // c&p
        String npcHpString = String.valueOf(npc.health);
        String pcHpString = String.valueOf(player.health);
        hpAmount.setText("HP: " + pcHpString);
        npcHpLabel.setText("HP: " + npcHpString);
        //
        if (player.health > 0) {
            if (npc.health > 0) {
                Random fightRand = new Random();
                int fightChance = 20;
                int fightEncounter = fightRand.nextInt(fightChance);
                Random npcFightRand = new Random();
                int npcFightEncounter = npcFightRand.nextInt(fightChance);
                if (fightEncounter >= npc.dex) {
                    Label1.setText("You hit the monster for "
                            + (player.strength / 3) + " hitpoints!");

                    npc.health -= (player.strength / 3);

                } else {
                    Label1.setText("You missed your attack!");
                }
                npcHpString = String.valueOf(npc.health);
                if (npc.health < 1) {
                    npcHpString = "0";
                }
                npcHpLabel.setText("HP: " + npcHpString);

                npc.setHealth(npc.health);

                if (npc.health > 0) {
                    if (npcFightEncounter >= player.dex) {
                        int hitDamage = (npc.strength / 3);
                        
                        if (hitDamage < 1) {
                            hitDamage = 1;
                        }
                        Label2.setText("The monster has hit you and reduced"
                                + " your health by " + hitDamage + " points.");
                        player.health -= hitDamage;
                    } else {
                        Label2.setText("You narrowly avoided an attack!");
                        
                    }
                }
                player.setHealth(player.health);

                String hpValueString = String.valueOf(player.health);
                if (player.health < 1) {
                    hpAmount.setText("HP: 0");
                } else {
                hpAmount.setText("HP: " + hpValueString);
                }
                npcHpString = String.valueOf(npc.health);
                if (npc.health < 1) {
                    npcHpString = "0";
                }
                npcHpLabel.setText("HP: " + npcHpString);
                if (npc.health > 0) {
                    continueFight.setVisible(true);
                } else {
                    rightPaneStats.setVisible(false);
                    Label3.setText("You have successfuly slain the beast!");
                    if (player.health > 0) {
                        continueButton.setVisible(true);
                    } else {
                        gameOver();
                    }
                }
            } else {
                rightPaneStats.setVisible(false);
                npc.setHealth(npc.health);
                Label3.setText("You have successfuly slain the beast!");

                if (player.health > 0) {
                    continueButton.setVisible(true);
                } else {
                    gameOver();
                }
            }
        } else {
            gameOver();
        }
    }

    @FXML
    private void runButton(ActionEvent event) {
        fightButton.setVisible(false);
        runButton.setVisible(false);
        sleepButton.setVisible(false);
        searchButton.setVisible(false);
        Label1.setText("");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");

        
        
        player.dex = player.getDex();
        player.health = player.getHealth();
        npc.intel = npc.getIntel();
        npc.strength = npc.getStrength();

        Random seeRand = new Random();
        int seeLimit = 20;
        int seeChance = seeRand.nextInt(seeLimit);
        seeChance += 1;
        int fightChance = 20;
        if (seeChance < npc.intel) {
            Random npcFightRand = new Random();
            int npcFightEncounter = npcFightRand.nextInt(fightChance);
            npcFightEncounter++;
            if (npcFightEncounter >= player.dex) {

                if ((npc.strength / 3) < 1) {
                    player.health -= 1;
                } else {
                    player.health -= (npc.strength / 3);
                }
                Label1.setText("The monster managed to get a hit"
                        + " on you!");
            } else {
                Label1.setText("You managed a clean escape!");
            }

        } else {
            Label1.setText("You managed a clean escape!");
        }
        String hpValueString = String.valueOf(player.health);
        if (player.health < 1) {
                    hpAmount.setText("HP: 0");
                } else {
                hpAmount.setText("HP: " + hpValueString);
                }

        if (player.health > 0) {
            continueButton.setVisible(true);
        } else {
            gameOver();
        }

        player.setHealth(player.health);
    }

    @FXML
    public void rollDice(ActionEvent event) {

        player.goldValue = 0;
        player.setGoldValue(player.goldValue);
        
        player.health = player.getHealth();
        player.strength = diceRoll();
        player.dex = diceRoll2();
        player.intel = diceRoll3();

        rollDice.setVisible(false);
        continueButton.setVisible(true);
        leftPaneStats.setVisible(true);
        String pcHpString = String.valueOf(player.health);
        String pcDexString = String.valueOf(player.dex);
        String pcIntelString = String.valueOf(player.intel);
        String pcStrengthString = String.valueOf(player.strength);

        pcDexLabel.setText("Dexterity: " + pcDexString);
        pcIntelLabel.setText("Intelligence: " + pcIntelString);
        pcStrengthLabel.setText("Strength: " + pcStrengthString);
    }

    private void wallGenerator() {
        int wallLimit = 4;
        Random wallDirection = new Random();
        int directionWall = wallDirection.nextInt(wallLimit);
        if (directionWall == 0) {
            Label1.setText("The north room is blocked off!");
            northWall.setStroke(Color.RED);
            southWall.setStroke(Color.GREEN);
            eastWall.setStroke(Color.GREEN);
            westWall.setStroke(Color.GREEN);

            northButton.setVisible(false);
            southButton.setVisible(true);
            eastButton.setVisible(true);
            westButton.setVisible(true);
        }
        if (directionWall == 1) {
            Label1.setText("The south room is blocked off!");
            southWall.setStroke(Color.RED);
            northWall.setStroke(Color.GREEN);
            eastWall.setStroke(Color.GREEN);
            westWall.setStroke(Color.GREEN);

            southButton.setVisible(false);
            northButton.setVisible(true);
            eastButton.setVisible(true);
            westButton.setVisible(true);
        }
        if (directionWall == 2) {
            Label1.setText("The east room is blocked off!");
            eastWall.setStroke(Color.RED);
            northWall.setStroke(Color.GREEN);
            southWall.setStroke(Color.GREEN);
            westWall.setStroke(Color.GREEN);

            eastButton.setVisible(false);
            northButton.setVisible(true);
            southButton.setVisible(true);
            westButton.setVisible(true);
        }
        if (directionWall == 3) {
            Label1.setText("The west room is blocked off!");
            westWall.setStroke(Color.RED);
            northWall.setStroke(Color.GREEN);
            southWall.setStroke(Color.GREEN);
            eastWall.setStroke(Color.GREEN);

            westButton.setVisible(false);
            northButton.setVisible(true);
            southButton.setVisible(true);
            eastButton.setVisible(true);

        }

        rightPaneStats.setVisible(false);
        leftPane.setVisible(true);

        Label2.setText("");
        Label3.setText("");
        Label4.setText("");

    }

    private void roomEncounter() {
        Random dangerRoom = new Random();
        int dangerChance = 3;
        int roomDanger = dangerRoom.nextInt(dangerChance);
        if (roomDanger == 0) {
            monsterEncounter();
        } else {
            peacefullEncounter();
        }
    }

    private void monsterEncounter() {
        monsterStatsRand();
        rightPaneStats.setVisible(true);

        npc.dex = npc.getDex();
        npc.intel = npc.getIntel();
        npc.strength = npc.getStrength();
        npc.health = npc.getHealth();

        Label2.setText("You have encountered a monster, do you want"
                + " to fight or run away?");
        fightButton.setVisible(true);
        runButton.setVisible(true);

        String npcHpString = String.valueOf(npc.health);
        String npcDexString = String.valueOf(npc.dex);
        String npcIntelString = String.valueOf(npc.intel);
        String npcStrengthString = String.valueOf(npc.strength);
        npcDexLabel.setText("Dexterity: " + npcDexString);
        npcIntelLabel.setText("Intelligence: " + npcIntelString);
        npcStrengthLabel.setText("Strength: " + npcStrengthString);
        npcHpLabel.setText("HP: " + npcHpString);

        ///rework
    }

    private void peacefullEncounter() {
        monsterStatsRand();
        Label2.setText("This room is safe! Do you want to search "
                + "for gold or sleep to regain full HP?");
        sleepButton.setVisible(true);
        searchButton.setVisible(true);
    }

    @FXML
    private void continueButton(ActionEvent event) {
        npcHpLabel.setText("HP: --");
        continueButton.setVisible(false);
        roomsPane.setVisible(true);
        leftPane.setVisible(true);
        wallGenerator();
    }

    private void gameOver() {
        player.health = 20;
        player.goldValue = player.getGoldValue();
        leftPane.setVisible(false);
        searchButton.setVisible(false);
        rollDice.setVisible(true);
        rightPaneStats.setVisible(false);
        leftPaneStats.setVisible(false);
        continueFight.setVisible(false);
        goldAmount.setText("Gold: --");
        Label2.setText("");
        Label3.setText("");
        Label4.setText("");
        Label1.setText("You have died with a total of "
                + player.goldValue + " gold! Roll the dice to play again!");
    }

    @FXML
    private void continueFight(ActionEvent event) {
        player.health = player.getHealth();
        if (player.health < 1) {
            gameOver();
        } else {
        fightButton.setVisible(true);
        runButton.setVisible(true);
        continueFight.setVisible(false);
        
        }
    }

    private void monsterStatsRand() {
        Random monsterRand = new Random();
        int limit = 6;
        int monsterStats = monsterRand.nextInt(limit);
        monsterStats += 1;
        int npcHealth = monsterStats;

        npc.setHealth(npcHealth);
        npc.setDex(npcHealth * 2);
        npc.setIntel(npcHealth * 2);
        npc.setStrength(npcHealth * 2);
    }

    private int diceRoll() {
        Random randomInt = new Random();
        int diceSides = 6;
        int diceRoll = randomInt.nextInt(diceSides);
        diceRoll += 1;
        String diceRollString = String.valueOf(diceRoll);

        Random randomInt2 = new Random();
        int diceSides2 = 6;
        int diceRoll2 = randomInt2.nextInt(diceSides2);
        diceRoll2 += 1;
        String diceRollString2 = String.valueOf(diceRoll2);

        Random randomInt3 = new Random();
        int diceSides3 = 6;
        int diceRoll3 = randomInt3.nextInt(diceSides3);
        diceRoll3 += 1;
        String diceRollString3 = String.valueOf(diceRoll3);
        Label1.setText("                       Strength:         " 
                + diceRollString + "    ||    " + 
                diceRollString2 + "    ||    " + diceRollString3);
        String hpValueString = String.valueOf(player.health);
        hpAmount.setText("HP: " + hpValueString);

        int diceTotal = (diceRoll + diceRoll2 + diceRoll3);

        return diceTotal;
    }
    private int diceRoll2() {
        Random randomInt = new Random();
        int diceSides = 6;
        int diceRoll = randomInt.nextInt(diceSides);
        diceRoll += 1;
        String diceRollString = String.valueOf(diceRoll);

        Random randomInt2 = new Random();
        int diceSides2 = 6;
        int diceRoll2 = randomInt2.nextInt(diceSides2);
        diceRoll2 += 1;
        String diceRollString2 = String.valueOf(diceRoll2);

        Random randomInt3 = new Random();
        int diceSides3 = 6;
        int diceRoll3 = randomInt3.nextInt(diceSides3);
        diceRoll3 += 1;
        String diceRollString3 = String.valueOf(diceRoll3);
        Label3.setText("                       Dexterity:        " 
                + diceRollString + "    ||    " + 
                diceRollString2 + "    ||    " + diceRollString3);
        String hpValueString = String.valueOf(player.health);
        hpAmount.setText("HP: " + hpValueString);

        int diceTotal = (diceRoll + diceRoll2 + diceRoll3);

        return diceTotal;
    }
    private int diceRoll3() {
        Random randomInt = new Random();
        int diceSides = 6;
        int diceRoll = randomInt.nextInt(diceSides);
        diceRoll += 1;
        String diceRollString = String.valueOf(diceRoll);

        Random randomInt2 = new Random();
        int diceSides2 = 6;
        int diceRoll2 = randomInt2.nextInt(diceSides2);
        diceRoll2 += 1;
        String diceRollString2 = String.valueOf(diceRoll2);

        Random randomInt3 = new Random();
        int diceSides3 = 6;
        int diceRoll3 = randomInt3.nextInt(diceSides3);
        diceRoll3 += 1;
        String diceRollString3 = String.valueOf(diceRoll3);
        Label2.setText("                       Intelligence:    " 
                + diceRollString + "    ||    " + 
                diceRollString2 + "    ||    " + diceRollString3);
        String hpValueString = String.valueOf(player.health);
        hpAmount.setText("HP: " + hpValueString);

        int diceTotal = (diceRoll + diceRoll2 + diceRoll3);

        return diceTotal;
    }

}
