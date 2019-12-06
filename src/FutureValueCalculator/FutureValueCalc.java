package FutureValueCalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FutureValueCalc extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{
        Parent root =
                FXMLLoader.load(getClass().getResource("FutureValueCalculator.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Future Value Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
