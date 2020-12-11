/*
    Name:       Wyatt Kirschner
    StudentID:  200407722
    Date:       12/10/20
    Project:    Nutrious - A macro finder using Spoonacular API
 */

package Controllers;

import Models.Food.Nutrition.Detailed.nutrients;

import Models.Food.SingleFoodQuery;
import Models.Search.Results.results;
import Models.Search.SpoonacularJsonResponse;
import Utilities.FoodUtility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class searchFoodController implements Initializable {

    @FXML
    private VBox leftVBox;

    @FXML
    private TextField searchTextField;

    @FXML
    private Button searchButton;

    @FXML
    private Label enterFoodLabel;

    @FXML
    private Label searchLabel;

    @FXML
    private Label totalResultsLabel;

    @FXML
    private ListView<results> searchListView;

    @FXML
    private Button clearButton;

    @FXML
    private Label msgLabel;

    @FXML
    private ImageView searchImage;

    @FXML
    private Label foodLabel;

    @FXML
    private Label servingLabel;

    @FXML
    private Label calorieLabel;

    @FXML
    private Button moreInformationButton;





    private String fixSearchString(String getText)
    {
        if(getText.contains(" ")) {
           getText =  getText.replace(' ', '+');

        }
        else {


        }

        return getText;
    }


    /**
     *  When the item is sent to be searched, the JSON will be strung together to build the JSON file from Spoonacular
     *  A list will also be populated
     */




    @FXML
    private void getFoodItems()  {
        // Checks to see if empty
        if(!searchTextField.getText().isEmpty()) {
            msgLabel.setText("");
            String searchText = searchTextField.getText();
            String newSearchText = fixSearchString(searchText);
            searchListView.getItems().clear();

            try {
                SpoonacularJsonResponse searchResponse = FoodUtility.getSearchResponse(newSearchText);
                List<results> food = Arrays.asList(searchResponse.getSearchResults());
                searchListView.getItems().addAll(food);
                setSearchLabels(searchResponse.getTotalResults(), searchTextField.getText());



            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        else
        {
            msgLabel.setText("Please enter an item to search!");
        }
    }

   @FXML
    private void clearSearch()
    {
        searchImage.setImage(new Image("Images/Nutritious.png"));
        foodLabel.setText("Food Name");
        servingLabel.setText("Serving Size");
        calorieLabel.setText("Calories");

        searchListView.getItems().clear();
        searchLabel.setText("");
        enterFoodLabel.setText("Enter a name of a food item!");
        searchTextField.clear();
        totalResultsLabel.setText("0");
    }

    private void setSearchLabels(int totalResults, String searchName) {
        if(!searchListView.getItems().isEmpty())

        {
            enterFoodLabel.setText("");
            totalResultsLabel.setText(String.valueOf(totalResults));
            searchLabel.setText(searchName);

        }
    }

    private String buildImage(String getImage) {
        String imageBuilder = "https://spoonacular.com/cdn/ingredients_250x250/" + getImage;
        return imageBuilder;
    }

    @FXML
    private void changeMoreInformation(ActionEvent event) throws IOException {

       /* Parent searchParent = FXMLLoader.load(getClass().getResource("Views/detailedFoodView.fxml"));
        Scene searchScene = new Scene(searchParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(searchScene);
        window.show();*/


        Parent root = FXMLLoader.load(getClass().getResource("Views/detailedFoodView.fxml"));
        Stage primaryStage = (Stage)((javafx.scene.Node) event.getSource()).getScene().getWindow();
        root.getStylesheets().add("Views/stylesheet.css");
        primaryStage.getIcons().add(new Image("Images/Nutritious_icon.png"));
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.setTitle("Nutritious - More Information");
        primaryStage.show();


    }





// transitionScene(event, "databaseTable.fxml", 1100, 450, "RePsychle - View Table");





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        searchListView.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, foodSelected)-> {
            searchImage.setImage(new Image(buildImage(foodSelected.getImage())));
            foodLabel.setText(foodSelected.getName().toUpperCase());
            //servingLabel.setText();10118192
                    try {
                        SingleFoodQuery getFood = FoodUtility.getFoodQuery(foodSelected.getIdToString());
                        //List<nutrition> getSomething = Array.asList(getFood.getNutrition().getCaloricBreakdown().g);
                        int servingAmount = getFood.getNutrition().getWeightPerServing().getAmount();
                        String servingUnit = getFood.getNutrition().getWeightPerServing().getUnit();
                       // List<nutrients> calories = Arrays.asList(getFood.getNutrition().getNutrients());

                        servingLabel.setText(String.valueOf(servingAmount) + " " + servingUnit);

                      List<nutrients> calories = Arrays.asList(getFood.getNutrition().getNutrients());

                      calorieLabel.setText(String.valueOf(calories.get(0).getAmount()));




                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }








        }

        );

    }
}
