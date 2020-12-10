import Models.Search.SpoonacularJsonResponse;
import Utilities.FoodUtility;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/searchFoodView.fxml"));
        primaryStage.setScene(new Scene(root, 1000, 700)); //800, 600
        primaryStage.getIcons().add(new Image("Images/Nutritious_icon.png"));
        root.getStylesheets().add("Views/stylesheet.css");
        primaryStage.setTitle("Nutritious - Search");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

/*

       try {
            FoodUtility.getSearchResponse("waffle");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            FoodUtility.getFoodQuery("19335");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/



    }
}

