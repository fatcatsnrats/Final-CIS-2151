
package cis2151final;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CIS2151Final extends Application {

    
    public static void main(String[] args) {
        // TODO code application logic here

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FinalProjectFXML.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("CIS 2151 Final Project || YAHTZEE");
        stage.setScene(scene);
        stage.show();
    }    
}
