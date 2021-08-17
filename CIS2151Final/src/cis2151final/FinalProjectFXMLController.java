/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis2151final;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author omara
 */
public class FinalProjectFXMLController implements Initializable {

    public Image dice1ImgFile = new Image(getClass().getResourceAsStream("dice1.jpg"));
    public Image dice2ImgFile = new Image(getClass().getResourceAsStream("dice2.jpg"));
    public Image dice3ImgFile = new Image(getClass().getResourceAsStream("dice3.jpg"));
    public Image dice4ImgFile = new Image(getClass().getResourceAsStream("dice4.jpg"));
    public Image dice5ImgFile = new Image(getClass().getResourceAsStream("dice5.jpg"));
    public Image dice6ImgFile = new Image(getClass().getResourceAsStream("dice6.jpg"));
    @FXML
    private ImageView dice1Img;
    @FXML
    private CheckBox keepDice1;
    @FXML
    private CheckBox keepDice2;
    @FXML
    private CheckBox keepDice3;
    @FXML
    private Label playerTurn;
    @FXML
    private ImageView dice2Img;
    @FXML
    private ImageView dice3Img;
    @FXML
    private ImageView dice4Img;
    @FXML
    private CheckBox keepDice4;
    @FXML
    private ImageView dice5Img;
    @FXML
    private CheckBox keepDice5;
    @FXML
    private Button rollDice;

    Player player1;
    Player player2;
    Player rulesPlayer;
    @FXML
    private Label player1Ones;
    @FXML
    private Label player1Twos;
    @FXML
    private Label player1Threes;
    @FXML
    private Label player1Fours;
    @FXML
    private Label player1Fives;
    @FXML
    private Label player1Sixes;
    @FXML
    private Label player1ThreeOfAKind;
    @FXML
    private Label player1FourOfAKind;
    @FXML
    private Label player1FullHouse;
    @FXML
    private Label player1SmallStraight;
    @FXML
    private Label player1LargeStraight;
    @FXML
    private Label player1Chance;
    @FXML
    private Label player1Yahtzee;
    @FXML
    private Label player1Total;
    @FXML
    private Label player2Ones;
    @FXML
    private Label player2Twos;
    @FXML
    private Label player2Threes;
    @FXML
    private Label player2Fours;
    @FXML
    private Label player2Fives;
    @FXML
    private Label player2Sixes;
    @FXML
    private Label player2ThreeOfAKind;
    @FXML
    private Label player2FourOfAKind;
    @FXML
    private Label player2FullHouse;
    @FXML
    private Label player2SmallStraight;
    @FXML
    private Label player2LargeStraight;
    @FXML
    private Label player2Chance;
    @FXML
    private Label player2Yahtzee;
    @FXML
    private Label player2Total;
    @FXML
    private ListView<String> categoryList;
    @FXML
    private Button confirmCategory;
    @FXML
    private Label turnCount;
    @FXML
    private Label textBox1;
    @FXML
    private Label textBox2;
    @FXML
    private Label textBox3;
    @FXML
    private Label textBox4;
    @FXML
    private Label textBox5;
    @FXML
    private Label textBox6;

    @FXML
    private void keepDice1(ActionEvent event) {
        dice1Keep = true;
    }

    @FXML
    private void keepDice2(ActionEvent event) {
        dice2Keep = true;
    }

    @FXML
    private void keepDice3(ActionEvent event) {
        dice3Keep = true;
    }

    @FXML
    private void keepDice4(ActionEvent event) {
        dice4Keep = true;
    }

    @FXML
    private void keepDice5(ActionEvent event) {
        dice5Keep = true;
    }

    public static Random rand = new Random();
    public boolean dice1Keep, dice2Keep, dice3Keep, dice4Keep, dice5Keep;
    public int dice1, dice2, dice3, dice4, dice5;
    public int turnInt = 3;
    public int[] diceArray = new int[6];
    public boolean player1Turn;
    public boolean categorySelected = false;

    @FXML
    private void rollDice(ActionEvent event) {
        textBox1.setText("");
        textBox2.setText("");

        String temp = "You ran out of rolls! Select a category to get,"
                + " your points!";
        if (categorySelected) {
            categorySelected = false;
            turnInt = 3;
//            if (player1Turn) {
//                player1Turn = false;
//            } else {
//                player1Turn = true;
//            }
        }
        if (counter >= 26) {
        if (turnInt < 1) {
            textBox1.setText(temp);
        } else {
            if (!keepDice1.isSelected()) {
                dice1 = rand.nextInt(5);
                dice1++;
            }
            switch (dice1) {
                case 1:
                    dice1Img.setImage(dice1ImgFile);
                    break;
                case 2:
                    dice1Img.setImage(dice2ImgFile);
                    break;
                case 3:
                    dice1Img.setImage(dice3ImgFile);
                    break;
                case 4:
                    dice1Img.setImage(dice4ImgFile);
                    break;
                case 5:
                    dice1Img.setImage(dice5ImgFile);
                    break;
                case 6:
                    dice1Img.setImage(dice6ImgFile);
                    break;
            }

            if (!keepDice2.isSelected()) {
                dice2 = rand.nextInt(5);
                dice2++;
            }
            switch (dice2) {
                case 1:
                    dice2Img.setImage(dice1ImgFile);
                    break;
                case 2:
                    dice2Img.setImage(dice2ImgFile);
                    break;
                case 3:
                    dice2Img.setImage(dice3ImgFile);
                    break;
                case 4:
                    dice2Img.setImage(dice4ImgFile);
                    break;
                case 5:
                    dice2Img.setImage(dice5ImgFile);
                    break;
                case 6:
                    dice2Img.setImage(dice6ImgFile);
                    break;
            }

            if (!keepDice3.isSelected()) {
                dice3 = rand.nextInt(5);
                dice3++;
            }
            switch (dice3) {
                case 1:
                    dice3Img.setImage(dice1ImgFile);
                    break;
                case 2:
                    dice3Img.setImage(dice2ImgFile);
                    break;
                case 3:
                    dice3Img.setImage(dice3ImgFile);
                    break;
                case 4:
                    dice3Img.setImage(dice4ImgFile);
                    break;
                case 5:
                    dice3Img.setImage(dice5ImgFile);
                    break;
                case 6:
                    dice3Img.setImage(dice6ImgFile);
                    break;
            }

            if (!keepDice4.isSelected()) {
                dice4 = rand.nextInt(5);
                dice4++;
            }
            switch (dice4) {
                case 1:
                    dice4Img.setImage(dice1ImgFile);
                    break;
                case 2:
                    dice4Img.setImage(dice2ImgFile);
                    break;
                case 3:
                    dice4Img.setImage(dice3ImgFile);
                    break;
                case 4:
                    dice4Img.setImage(dice4ImgFile);
                    break;
                case 5:
                    dice4Img.setImage(dice5ImgFile);
                    break;
                case 6:
                    dice4Img.setImage(dice6ImgFile);
            }

            if (!keepDice5.isSelected()) {
                dice5 = rand.nextInt(5);
                dice5++;
            }
            switch (dice5) {
                case 1:
                    dice5Img.setImage(dice1ImgFile);
                    break;
                case 2:
                    dice5Img.setImage(dice2ImgFile);
                    break;
                case 3:
                    dice5Img.setImage(dice3ImgFile);
                    break;
                case 4:
                    dice5Img.setImage(dice4ImgFile);
                    break;
                case 5:
                    dice5Img.setImage(dice5ImgFile);
                    break;
                case 6:
                    dice5Img.setImage(dice6ImgFile);
            }
            diceArray[0] = dice1;
            diceArray[1] = dice2;
            diceArray[2] = dice3;
            diceArray[3] = dice4;
            diceArray[4] = dice5;

            turnInt--;
            turnCount.setText(String.valueOf(turnInt));
        }
        displayScore();
        } else {
            playAgain();
        }
//        dice1Img.setImage(dice1ImgFile);
    }

    public void displayScore() {
        if (player1Turn) {
            if (!player1.isONES()) {
                player1Ones.setTextFill(Color.RED);
                player1Ones.setText(String.valueOf(sum(1)));
            }
            if (!player1.isTWOS()) {
                player1Twos.setTextFill(Color.RED);
                player1Twos.setText(String.valueOf(sum(2)));
            }
            if (!player1.isTHREES()) {
                player1Threes.setTextFill(Color.RED);
                player1Threes.setText(String.valueOf(sum(3)));
            }
            if (!player1.isFOURS()) {
                player1Fours.setTextFill(Color.RED);
                player1Fours.setText(String.valueOf(sum(4)));
            }
            if (!player1.isFIVES()) {
                player1Fives.setTextFill(Color.RED);
                player1Fives.setText(String.valueOf(sum(5)));
            }
            if (!player1.isSIXES()) {
                player1Sixes.setTextFill(Color.RED);
                player1Sixes.setText(String.valueOf(sum(6)));
            }
            if (!player1.isTHREE_OF_A_KIND()) {
                player1ThreeOfAKind.setTextFill(Color.RED);
                player1ThreeOfAKind.setText(String.valueOf(ofAKind(3, false)));
            }
            if (!player1.isFOUR_OF_A_KIND()) {
                player1FourOfAKind.setTextFill(Color.RED);
                player1FourOfAKind.setText(String.valueOf(ofAKind(4, false)));
            }
            if (!player1.isFULL_HOUSE()) {
                player1FullHouse.setTextFill(Color.RED);
                if (ofAKind(3, true) > 0 && ofAKind(2, true) > 0) {
                    player1FullHouse.setText(String.valueOf(25));
                } else {
                    player1FullHouse.setText(String.valueOf(0));

                }
            }
            if (!player1.isSMALL_STRAIGHT()) {
                player1SmallStraight.setTextFill(Color.RED);
                if (isStraight(4)) {
                    player1SmallStraight.setText(String.valueOf(30));
                } else {
                    player1SmallStraight.setText(String.valueOf(0));
                }
            }
            if (!player1.isLARGE_STRAIGHT()) {
                player1LargeStraight.setTextFill(Color.RED);
                if (isStraight(5)) {
                    player1LargeStraight.setText(String.valueOf(40));
                } else {
                    player1LargeStraight.setText(String.valueOf(0));
                }
            }
            if (!player1.isYAHTZEE()) {
                player1Yahtzee.setTextFill(Color.RED);
                player1Yahtzee.setText(String.valueOf(ofAKind(5, true)));
            }
            if (!player1.isCHANCE()) {
                player1Chance.setTextFill(Color.RED);
                player1Chance.setText(String.valueOf(dice1 + dice2 + dice3 + dice4 + dice5));
            }

        } else {
            if (!player2.isONES()) {
                player2Ones.setTextFill(Color.RED);
                player2Ones.setText(String.valueOf(sum(1)));
            }
            if (!player2.isTWOS()) {
                player2Twos.setTextFill(Color.RED);
                player2Twos.setText(String.valueOf(sum(2)));
            }
            if (!player2.isTHREES()) {
                player2Threes.setTextFill(Color.RED);
                player2Threes.setText(String.valueOf(sum(3)));
            }
            if (!player2.isFOURS()) {
                player2Fours.setTextFill(Color.RED);
                player2Fours.setText(String.valueOf(sum(4)));
            }
            if (!player2.isFIVES()) {
                player2Fives.setTextFill(Color.RED);
                player2Fives.setText(String.valueOf(sum(5)));
            }
            if (!player2.isSIXES()) {
                player2Sixes.setTextFill(Color.RED);
                player2Sixes.setText(String.valueOf(sum(6)));
            }
            if (!player2.isTHREE_OF_A_KIND()) {
                player2ThreeOfAKind.setTextFill(Color.RED);
                player2ThreeOfAKind.setText(String.valueOf(ofAKind(3, false)));
            }
            if (!player2.isFOUR_OF_A_KIND()) {
                player2FourOfAKind.setTextFill(Color.RED);
                player2FourOfAKind.setText(String.valueOf(ofAKind(4, false)));
            }
            if (!player2.isFULL_HOUSE()) {
                player2FullHouse.setTextFill(Color.RED);
                if (ofAKind(3, true) > 0 && ofAKind(2, true) > 0) {
                    player2FullHouse.setText(String.valueOf(25));
                } else {
                    player2FullHouse.setText(String.valueOf(0));

                }
            }
            if (!player2.isSMALL_STRAIGHT()) {
                player2SmallStraight.setTextFill(Color.RED);
                if (isStraight(4)) {
                    player2SmallStraight.setText(String.valueOf(30));
                } else {
                    player2SmallStraight.setText(String.valueOf(0));
                }
            }
            if (!player2.isLARGE_STRAIGHT()) {
                player2LargeStraight.setTextFill(Color.RED);
                if (isStraight(5)) {
                    player2LargeStraight.setText(String.valueOf(40));
                } else {
                    player2LargeStraight.setText(String.valueOf(0));
                }
            }
            if (!player2.isYAHTZEE()) {
                player2Yahtzee.setTextFill(Color.RED);
                player2Yahtzee.setText(String.valueOf(ofAKind(5, true)));
            }
            if (!player2.isCHANCE()) {
                player2Chance.setTextFill(Color.RED);
                player2Chance.setText(String.valueOf(dice1 + dice2 + dice3 + dice4 + dice5));
            }

        }

    }

//    @FXML
//    private void rollDice(MouseEvent event) {
//    }
//    int[] categories = new int[13];
//    int[] categories1 = new int[13];
    public int counter;

    public void updateScores() {

        player1Ones.setTextFill(Color.BLACK);
        player1Twos.setTextFill(Color.BLACK);
        player1Threes.setTextFill(Color.BLACK);
        player1Fours.setTextFill(Color.BLACK);
        player1Fives.setTextFill(Color.BLACK);
        player1Sixes.setTextFill(Color.BLACK);
        player1ThreeOfAKind.setTextFill(Color.BLACK);
        player1FourOfAKind.setTextFill(Color.BLACK);
        player1FullHouse.setTextFill(Color.BLACK);
        player1SmallStraight.setTextFill(Color.BLACK);
        player1LargeStraight.setTextFill(Color.BLACK);
        player1Yahtzee.setTextFill(Color.BLACK);
        player1Chance.setTextFill(Color.BLACK);

        player2Ones.setTextFill(Color.BLACK);
        player2Twos.setTextFill(Color.BLACK);
        player2Threes.setTextFill(Color.BLACK);
        player2Fours.setTextFill(Color.BLACK);
        player2Fives.setTextFill(Color.BLACK);
        player2Sixes.setTextFill(Color.BLACK);
        player2ThreeOfAKind.setTextFill(Color.BLACK);
        player2FourOfAKind.setTextFill(Color.BLACK);
        player2FullHouse.setTextFill(Color.BLACK);
        player2SmallStraight.setTextFill(Color.BLACK);
        player2LargeStraight.setTextFill(Color.BLACK);
        player2Yahtzee.setTextFill(Color.BLACK);
        player2Chance.setTextFill(Color.BLACK);
    }

    public void categorySuccess(String str) {

        turnCount.setText(String.valueOf(3));
        playerTurn.setText(str);
        rollDice.setVisible(true);
        textBox1.setText("");
        textBox2.setText("");
        categorySelected = true;
        dice1Keep = false;
        dice2Keep = false;
        dice3Keep = false;
        dice4Keep = false;
        dice5Keep = false;
        keepDice1.setSelected(false);
        keepDice2.setSelected(false);
        keepDice3.setSelected(false);
        keepDice4.setSelected(false);
        keepDice5.setSelected(false);

        updateDisplayInitialize();

        if (player1Turn) {
            player1Turn = false;
        } else {
            player1Turn = true;
        }

        updateScores();
    }

    @FXML
    private void confirmCategory(ActionEvent event) {

        int index = categoryList.getSelectionModel().getSelectedIndex();

        String temp = "You have already chosen that category,"
                + " please select another category.";
        String string1 = "Player 1's Turn";
        String string2 = "Player 2's Turn";
        if (player1Turn) {
//            for (int i = 0; i < categories.length; i++) {
//                if (categories[i] == index) {
//                    counter++;
//                }
//            }
//            if (counter <= 26) {
//                categories[index] = index;
                switch (index) {
                    case 0:
                        if (!player1.isONES()) {
                            player1.ONES = true;
                            player1.setOnes(Integer.valueOf(player1Ones.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 1:
                        if (!player1.isTWOS()) {
                            player1.TWOS = true;
                            player1.setTwos(Integer.valueOf(player1Twos.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 2:
                        if (!player1.isTHREES()) {
                            player1.THREES = true;
                            player1.setThrees(Integer.valueOf(player1Threes.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 3:
                        if (!player1.isFOURS()) {
                            player1.FOURS = true;
                            player1.setFours(Integer.valueOf(player1Fours.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 4:
                        if (!player1.isFIVES()) {
                            player1.FIVES = true;
                            player1.setFives(Integer.valueOf(player1Fives.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 5:
                        if (!player1.isSIXES()) {
                            player1.SIXES = true;
                            player1.setSixes(Integer.valueOf(player1Sixes.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 6:
                        if (!player1.isTHREE_OF_A_KIND()) {
                            player1.THREE_OF_A_KIND = true;
                            player1.setThreeOfAKind(Integer.valueOf(player1ThreeOfAKind.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 7:
                        if (!player1.isFOUR_OF_A_KIND()) {
                            player1.FOUR_OF_A_KIND = true;
                            player1.setFourOfAKind(Integer.valueOf(player1FourOfAKind.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 8:
                        if (!player1.isFULL_HOUSE()) {
                            player1.FULL_HOUSE = true;
                            player1.setFullHouse(Integer.valueOf(player1FullHouse.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 9:
                        if (!player1.isSMALL_STRAIGHT()) {
                            player1.SMALL_STRAIGHT = true;
                            player1.setSmallStraight(Integer.valueOf(player1SmallStraight.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 10:
                        if (!player1.isLARGE_STRAIGHT()) {
                            player1.LARGE_STRAIGHT = true;
                            player1.setLargeStraight(Integer.valueOf(player1LargeStraight.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 11:
                        if (!player1.isCHANCE()) {
                            player1.CHANCE = true;
                            player1.setChance(Integer.valueOf(player1Chance.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 12:
                        if (!player1.isYAHTZEE()) {
                            player1.YAHTZEE = true;
                            player1.setYahtzee(Integer.valueOf(player1Yahtzee.getText()));
                            categorySuccess(string2);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                }
//            } else {
//                displayScore();
//                playAgain();
////                text1.setText("You cannot selected that category more than once!");
////                textBox.getChildren().add(text1);
//            }

        } else {
//            for (int i = 0; i < categories1.length; i++) {
//                if (categories1[i] == index) {
//                    counter++;
//                }
//            }
//            if (counter <= 26) {
                switch (index) {
                    case 0:
                        if (!player2.isONES()) {
                            player2.ONES = true;
                            player2.setOnes(Integer.valueOf(player2Ones.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 1:
                        if (!player2.isTWOS()) {
                            player2.TWOS = true;
                            player2.setTwos(Integer.valueOf(player2Twos.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 2:
                        if (!player2.isTHREES()) {
                            player2.THREES = true;
                            player2.setThrees(Integer.valueOf(player2Threes.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 3:
                        if (!player2.isFOURS()) {
                            player2.FOURS = true;
                            player2.setFours(Integer.valueOf(player2Fours.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 4:
                        if (!player2.isFIVES()) {
                            player2.FIVES = true;
                            player2.setFives(Integer.valueOf(player2Fives.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 5:
                        if (!player2.isSIXES()) {
                            player2.SIXES = true;
                            player2.setSixes(Integer.valueOf(player2Sixes.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 6:
                        if (!player2.isTHREE_OF_A_KIND()) {
                            player2.THREE_OF_A_KIND = true;
                            player2.setThreeOfAKind(Integer.valueOf(player2ThreeOfAKind.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 7:
                        if (!player2.isFOUR_OF_A_KIND()) {
                            player2.FOUR_OF_A_KIND = true;
                            player2.setFourOfAKind(Integer.valueOf(player2FourOfAKind.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 8:
                        if (!player2.isFULL_HOUSE()) {
                            player2.FULL_HOUSE = true;
                            player2.setFullHouse(Integer.valueOf(player2FullHouse.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 9:
                        if (!player2.isSMALL_STRAIGHT()) {
                            player2.SMALL_STRAIGHT = true;
                            player2.setSmallStraight(Integer.valueOf(player2SmallStraight.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 10:
                        if (!player2.isLARGE_STRAIGHT()) {
                            player2.LARGE_STRAIGHT = true;
                            player2.setLargeStraight(Integer.valueOf(player2LargeStraight.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 11:
                        if (!player2.isCHANCE()) {
                            player2.CHANCE = true;
                            player2.setChance(Integer.valueOf(player2Chance.getText()));
                            categorySuccess(string1);
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                    case 12:
                        if (!player2.isYAHTZEE()) {
                            player2.YAHTZEE = true;
                            player2.setYahtzee(Integer.valueOf(player2Yahtzee.getText()));
                            categorySuccess(string1);
                            player2.setYahtzee(Integer.valueOf(player2Yahtzee.getText()));
                        } else {
                            textBox1.setText(temp);
                        }
                        break;
                }
//            } else {
//                displayScore();
//                playAgain();
////                text1.setText("You cannot selected that category more than once!");
////                textBox.getChildren().add(text1);
//            }
        }

        counter++;
        player1Total.setText(String.valueOf(player1.total()));
        player2Total.setText(String.valueOf(player2.total()));
    }

    @FXML
    private void dice1Img(MouseEvent event) {
    }

    @FXML
    private void dice2Img(MouseEvent event) {
    }

    /**
     * Initializes the controller class.
     */
    public enum Rules {
        ZERO, ONES, TWOS, THREES, FOURS, FIVES, SIXES, THREE_OF_A_KIND,
        FOUR_OF_A_KIND, FULL_HOUSE, SMALL_STRAIGHT, LARGE_STRAIGHT, CHANCE,
        YAHTZEE, TOTAL_SCORE
    }

    public void playAgain() {
        counter = 0;
        String temp;
        if (player1.total() > player2.total()) {
            temp = "Player 1 won the game with "
                    + String.valueOf(player1.totalScore) + " points!";
        } else if (player1.total() < player2.total()) {
            temp = "Player 2 won the game with "
                    + String.valueOf(player2.totalScore) + " points!";
        } else {
            temp = "This game was a draw!!! Both players got "
                    + String.valueOf(player1.totalScore) + " points!";
        }

        textBox1.setText(temp);
        textBox2.setText("Roll the dice to play again.");
        textBox3.setText("");
        textBox4.setText("");
        textBox5.setText("");
        textBox6.setText("");

        player1 = new Player();
        player2 = new Player();
        player1Turn = true;
        updateDisplayInitialize();
        updateScores();
    }

    public int sum(int n) {
        int count = 0;
        for (int i = 0; i < diceArray.length; i++) {
            if (diceArray[i] == n) {
                count++;
            }
        }
        return count * n;
    }

    public boolean isStraight(int n) {
        int[] freq = frequency();
        for (int i = 0; i < (freq.length - n + 1); i++) {
            int nInARow = 0;
            for (int j = 0; j < n; j++) {
                if (freq[i + j] > 0) {
                    nInARow++;
                }
            }
            if (nInARow == n) {
                return true;
            }
        }

        return false;
    }

    public int ofAKind(int n, boolean exact) {
        int[] freq = frequency();
        for (int i = 0; i < freq.length; i++) {
            if (exact) {
                if (freq[i] == n) {
                    if (n == 5) {
                        return 50;
                    } else {
                        return dice1 + dice2 + dice3 + dice4 + dice5;
                    }
                }
            } else {
                if (freq[i] >= n) {
                    if (n == 5) {
                        return 50;
                    } else {
                        return dice1 + dice2 + dice3 + dice4 + dice5;
                    }
                }
            }
        }
        return 0;
    }

    public int[] frequency() {
        int[] freq = new int[6];
        for (int i = 0; i < 5; i++) {
            freq[diceArray[i] - 1]++;
        }
        return freq;
    }

    public void updateDisplayInitialize() {
        player1Ones.setText(String.valueOf(player1.ones));
        player1Twos.setText(String.valueOf(player1.twos));
        player1Threes.setText(String.valueOf(player1.threes));
        player1Fours.setText(String.valueOf(player1.fours));
        player1Fives.setText(String.valueOf(player1.fives));
        player1Sixes.setText(String.valueOf(player1.sixes));
        player1ThreeOfAKind.setText(String.valueOf(player1.threeOfAKind));
        player1FourOfAKind.setText(String.valueOf(player1.fourOfAKind));
        player1FullHouse.setText(String.valueOf(player1.fullHouse));
        player1SmallStraight.setText(String.valueOf(player1.smallStraight));
        player1LargeStraight.setText(String.valueOf(player1.largeStraight));
        player1Chance.setText(String.valueOf(player1.chance));
        player1Yahtzee.setText(String.valueOf(player1.yahtzee));
        player1Total.setText(String.valueOf(player1.totalScore));

        player2Ones.setText(String.valueOf(player2.ones));
        player2Twos.setText(String.valueOf(player2.twos));
        player2Threes.setText(String.valueOf(player2.threes));
        player2Fours.setText(String.valueOf(player2.fours));
        player2Fives.setText(String.valueOf(player2.fives));
        player2Sixes.setText(String.valueOf(player2.sixes));
        player2ThreeOfAKind.setText(String.valueOf(player2.threeOfAKind));
        player2FourOfAKind.setText(String.valueOf(player2.fourOfAKind));
        player2FullHouse.setText(String.valueOf(player2.fullHouse));
        player2SmallStraight.setText(String.valueOf(player2.smallStraight));
        player2LargeStraight.setText(String.valueOf(player2.largeStraight));
        player2Chance.setText(String.valueOf(player2.chance));
        player2Yahtzee.setText(String.valueOf(player2.yahtzee));
        player2Total.setText(String.valueOf(player2.totalScore));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        categoryList.getItems().addAll("Ones", "Twos", "Threes", "Fours", "Fives",
                "Sixes", "Three Of A Kind", "Four Of A Kind", "Full House", "Small Straight",
                "Large Straight", "Chance", "Yahtzee");
        player1 = new Player();
        player2 = new Player();
        updateDisplayInitialize();

        dice1Keep = false;
        dice2Keep = false;
        dice3Keep = false;
        dice4Keep = false;
        dice5Keep = false;

        textBox1.setText("Roll the dice to start the game!");
        textBox2.setText("");
        textBox3.setText("");
        textBox4.setText("");
        textBox5.setText("");
        textBox6.setText("");

        player1Turn = true;
        counter = 24;

    }
//    
//    public ObservableList<Player> getScores() {
//        ObservableList<Player> scoresObservableList = FXCollections.observableArrayList();
//        scoresObservableList.add(rulesPlayer);
//        scoresObservableList.add(player1);
//        scoresObservableList.add(player2);
//        return scoresObservableList;
//    }

}
