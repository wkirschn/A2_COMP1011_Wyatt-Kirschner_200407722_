/*
    Name:       Wyatt Kirschner
    StudentID:  200407722
    Date:       12/10/20
    Project:    Nutrious - A macro finder using Spoonacular API
 */


import Utilities.FoodUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
       // Parent root = FXMLLoader.load(getClass().getResource("Views/searchFoodView.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("Views/searchFoodView.fxml"));
        primaryStage.setScene(new Scene(root, 1000, 700)); //800, 600
        primaryStage.getIcons().add(new Image("Images/Nutritious_icon.png"));
        root.getStylesheets().add("Views/stylesheet.css");
        primaryStage.setTitle("Nutritious - Search");
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);


    }
}

