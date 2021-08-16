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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    private TextFlow textBox;
    @FXML
    private ImageView dice1Img;
    @FXML
    private Button keepDice1;
    @FXML
    private Button keepDice2;
    @FXML
    private Button keepDice3;
    @FXML
    private Label playerTurn;
    @FXML
    private ImageView dice2Img;
    @FXML
    private ImageView dice3Img;
    @FXML
    private ImageView dice4Img;
    @FXML
    private Button keepDice4;
    @FXML
    private ImageView dice5Img;
    @FXML
    private Button keepDice5;
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

    public Random rand = new Random();
    public boolean dice1Keep, dice2Keep, dice3Keep, dice4Keep, dice5Keep;

    @FXML
    private void rollDice(ActionEvent event) {
        Random rand = new Random();
        int dice1 = rand.nextInt(5);
        dice1++;
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

        int dice2 = rand.nextInt(5);
        dice2++;
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

        int dice3 = rand.nextInt(5);
        dice3++;
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

        int dice4 = rand.nextInt(5);
        dice4++;
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

        int dice5 = rand.nextInt(5);
        dice5++;
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

//        dice1Img.setImage(dice1ImgFile);
    }

    @FXML
    private void dice1Img(MouseEvent event) {
        dice1Img.setImage(dice1ImgFile);
    }

    @FXML
    private void dice2Img(MouseEvent event) {
        dice2Img.setImage(dice1ImgFile);
    }
//
//    @FXML
//    private void rollDice(MouseEvent event) {
//    }

    @FXML
    private void confirmCategory(ActionEvent event) {
//        String
    }

    /**
     * Initializes the controller class.
     */
    public enum Rules {
        ONES, TWOS, THREES, FOURS, FIVES, SIXES, SUM, BONUS,
        THREE_OF_A_KIND, FOUR_OF_A_KIND, FULL_HOUSE, SMALL_STRAIGHT, LARGE_STRAIGHT,
        CHANCE, YAHTZEE, TOTAL_SCORE
    }

    public void updateDisplay() {
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
//        categoryList = new ListView<>();
//        categoryList.setPrefSize(120, 100);
        categoryList.getItems().addAll("Ones", "Twos", "Threes", "Fours", "Fives",
                "Sixes", "Three Of A Kind", "Four Of A Kind", "Full House", "Small Straight",
                "Large Straight", "Chance", "Yahtzee");

//        rollDice.getText();
//        rulesPlayer = new Player(" ");
        player1 = new Player();
        player2 = new Player();
        updateDisplay();
        
        dice1Keep = false;
        dice2Keep = false;
        dice3Keep = false;
        dice4Keep = false;
        dice5Keep = false;
        
//        moveSelectorLower.getItems().add("Ones");
        // TODO
//
//        tableColumn1.setCellValueFactory(new PropertyValueFactory<Player, ArrayList<String>>("score"));
//        tableColumn2.setCellValueFactory(new PropertyValueFactory<Player, ArrayList<Integer>>("scoreInt"));
//        tableColumn3.setCellValueFactory(new PropertyValueFactory<Player, ArrayList<Integer>>("scoreInt1"));
//        
//        scoringTable.setItems(getScores());
    }

    public void startTurn(Player turnPlayer) {
        if (turnPlayer == player1) {
            playerTurn.setText("Player 1's Turn");
        } else {
            playerTurn.setText("Player 2's Turn");
        }
        Text text1 = new Text("Welcome to Yahtzee");
        Text text2 = new Text("Roll the dice when you are ready to play!");

        textBox.getChildren().add(text1);
        textBox.getChildren().add(text2);

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
