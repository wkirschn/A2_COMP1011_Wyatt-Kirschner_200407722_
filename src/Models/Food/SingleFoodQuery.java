package Models.Food;
import Models.Food.Nutrition.foodNutritionCentral;

import com.google.gson.annotations.SerializedName;

// https://api.spoonacular.com/food/ingredients/9003/information?apiKey=5fec8b624e914a81b3e359d38938c941
// https://api.spoonacular.com/food/ingredients/9003/information?amount=1&apiKey=5fec8b624e914a81b3e359d38938c941
public class SingleFoodQuery {
    @SerializedName("originalName")
    private String originalName;

    @SerializedName("amount")
    private String amount;

    @SerializedName("image")
    private String image;

    private foodNutritionCentral foodNutritionCentral;


}
