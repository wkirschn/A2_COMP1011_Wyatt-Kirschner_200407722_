package Controllers;

import Models.Search.Results.results;
import Models.Search.SpoonacularJsonResponse;
import Utilities.FoodUtility;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class searchFoodController {

    @FXML
    private VBox leftVBox;

    @FXML
    private TextField searchTextField;

    @FXML
    private Button searchButton;

    @FXML
    private Label searchLabel;

    @FXML
    private Label totalResultsLabel;

    @FXML
    private Label pageLabel;

    @FXML
    private ListView<results> searchListView;

    @FXML
    private Button clearButton;

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

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

    /**
     *  When the item is sent to be searched, the JSON will be strung together to build the JSON file from Spoonacular
     *  A list will also be populated
     */

    @FXML
    private void getFoodItems()  {
        String searchText = searchTextField.getText();
        searchListView.getItems().clear();
        try {
            SpoonacularJsonResponse searchResponse = FoodUtility.getSearchResponse(searchText);
            List<results> food = Arrays.asList(searchResponse.getSearchResults());
            searchListView.getItems().addAll(food);
            totalResultsLabel.setText("Rows Returned: " + searchResponse.getTotalResults());

        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

   @FXML
    private void clearSearch()
    {
        searchListView.getItems().clear();
    }

}
