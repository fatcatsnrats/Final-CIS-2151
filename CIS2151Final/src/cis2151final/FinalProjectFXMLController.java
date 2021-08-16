/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis2151final;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author omara
 */
public class FinalProjectFXMLController implements Initializable {

    public Image dice1ImgFile = new Image(getClass().getResourceAsStream("dice6.jpg"));

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
    private void keepDice1(ActionEvent event) {
        dice1Img.setImage(dice1ImgFile);
    }

    @FXML
    private void keepDice2(ActionEvent event) {
        dice2Img.setImage(dice1ImgFile);
    }

    @FXML
    private void keepDice3(ActionEvent event) {
    }


    @FXML
    private void rollDice(ActionEvent event) {
        dice1Img.setImage(dice1ImgFile);
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        categoryList = new ListView<>();
//        categoryList.setPrefSize(120, 100);
        categoryList.getItems().addAll("Ones", "Twos", "Threes", "Fours", "Fives",
                "Sixes", "Three Of A Kind", "Four Of A Kind", "Full House", "Small Straight", 
                "Large Straight", "Chance", "Yahtzee");
        
//        rollDice.getText();
//        rulesPlayer = new Player(" ");
//        player1 = new Player();
//        player2 = new Player();
//        moveSelectorLower.getItems().add("Ones");
        // TODO
//
//        tableColumn1.setCellValueFactory(new PropertyValueFactory<Player, ArrayList<String>>("score"));
//        tableColumn2.setCellValueFactory(new PropertyValueFactory<Player, ArrayList<Integer>>("scoreInt"));
//        tableColumn3.setCellValueFactory(new PropertyValueFactory<Player, ArrayList<Integer>>("scoreInt1"));
//        
//        scoringTable.setItems(getScores());
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
