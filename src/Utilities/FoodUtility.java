
/*
    Name:   Wyatt Kirschner
    StudentID:  200407722
    Date: 12/10/20
    Project: Nutrious - A macro finder using Spoonacular API
 */

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
package Utilities;
import Models.Food.SingleFoodQuery;
import com.google.gson.Gson;

import Models.Search.SpoonacularJsonResponse;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FoodUtility {

    public static SpoonacularJsonResponse getSearchResults(File jsonFile) {
        Gson gson = new Gson();
        SpoonacularJsonResponse searchResult = null;

        try (
                FileReader fileReader = new FileReader(jsonFile);
                JsonReader jsonReader = new JsonReader(fileReader);
        ) {
            searchResult = gson.fromJson(jsonReader, SpoonacularJsonResponse.class);
            System.out.println(searchResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return searchResult;

    }


    /**
     * Used to retrieve information from the JSON file
     * @param jsonFile - used to read the information from the JSON
     * @return - the result of the search
     */



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



    public static  SpoonacularJsonResponse getSearchResponse (String searchText) throws IOException, InterruptedException {
        String jsonLocation = "src/Utilities/search.json";
     String apiKey = "&apiKey=5fec8b624e914a81b3e359d38938c941";
        String uri = "https://api.spoonacular.com/food/ingredients/search?query=" + searchText + "&number=100" + apiKey;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get(jsonLocation)));
       SpoonacularJsonResponse searchResponse = getSearchResults(new File(jsonLocation));
       return searchResponse;





    }

    public static SingleFoodQuery getFoodQuery (String foodId) throws IOException, InterruptedException {
        String jsonLocation = "src/Utilities/food.json";
       String apiKey = "&apiKey=5fec8b624e914a81b3e359d38938c941";
        String uri = "https://api.spoonacular.com/food/ingredients/" + foodId + "/information?amount=1" + apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();



        HttpResponse<Path> response = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get(jsonLocation)));

        SingleFoodQuery foodQuery =  getFoodResults(new File(jsonLocation));
        return foodQuery;

    }
}