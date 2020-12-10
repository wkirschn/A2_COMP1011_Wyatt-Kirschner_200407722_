package Controllers;

import Models.Search.Results.results;
import Models.Search.SpoonacularJsonResponse;
import Utilities.FoodUtility;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
