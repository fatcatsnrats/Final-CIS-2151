
package guipractice;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GUIPractice extends Application{

    
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // change the name of your fxml file to match
        Parent root = FXMLLoader.load(getClass().getResource("FXML1.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("CIS-1500 Final Project");
        stage.setScene(scene);
        stage.show();
    }
    
}
