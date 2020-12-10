package Utilities;

/*package Utilities;
// API KEY: 5fec8b624e914a81b3e359d38938c941 // https://api.spoonacular.com/?apiKey=5fec8b624e914a81b3e359d38938c941
// The initial request is ?, followed by &
// https://api.spoonacular.com/recipes/716429/information?apiKey=5fec8b624e914a81b3e359d38938c941&includeNutrition=true
// https://api.spoonacular.com/food/ingredients/search?query=banana&number=2&sort=calories&sortDirection=desc&apiKey=5fec8b624e914a81b3e359d38938c941
// https://api.spoonacular.com/food/ingredients/search?query=banana&sortDirection=desc&apiKey=5fec8b624e914a81b3e359d38938c941
// https://api.spoonacular.com/food/ingredients/9040/information?amount=1&apiKey=5fec8b624e914a81b3e359d38938c941 -- Can grab by ID and insert into the Query
// Grab the CaloricBreakdown which includes percentProtein, percentFat, percentCarbs... nutrition, nutrients, Calories, Fat, Carbs, Protein
//https://api.spoonacular.com/food/ingredients/search?query=cookie&apiKey=5fec8b624e914a81b3e359d38938c941

//  https://api.spoonacular.com/food/ingredients/search?apiKey=5fec8b624e914a81b3e359d38938c941

// If the JSON file returns blank or total results  = 0, then it won't add anything to the program


public class FoodUtility {

    public static ArrayList<>

}*/
import Models.Food.SingleFoodQuery;
import Utilities.*;
import com.google.gson.Gson;

import Models.Search.SpoonacularJsonResponse;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;

public class FoodUtility {

    public static SingleFoodQuery getFoodResults(File jsonFile) {
        Gson gson = new Gson();
        SingleFoodQuery searchResult = null;

        try (
                FileReader fileReader = new FileReader(jsonFile);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            searchResult = gson.fromJson(jsonReader, SingleFoodQuery.class);
            System.out.println(searchResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return searchResult;

    }
}