package Models.Food;
import Models.Food.Nutrition.foodNutritionCentral;

import com.google.gson.annotations.SerializedName;

// https://api.spoonacular.com/food/ingredients/9003/information?apiKey=5fec8b624e914a81b3e359d38938c941
// https://api.spoonacular.com/food/ingredients/9003/information?amount=1&apiKey=5fec8b624e914a81b3e359d38938c941

// No conversion needed

public class SingleFoodQuery {
    @SerializedName("originalName")
    private String originalName;

    @SerializedName("amount")
    private String amount;

    @SerializedName("image")
    private String image;

    private foodNutritionCentral foodNutritionCentral;


    public SingleFoodQuery(String originalName, String amount, String image, Models.Food.Nutrition.foodNutritionCentral foodNutritionCentral) {
        setOriginalName(originalName);
        setAmount(amount);
        setImage(image);
        setFoodNutritionCentral(foodNutritionCentral);
    }
    /*
        Needed to convert to make it easier to deal with if required
     */
    public double getAmountInDouble()
    {
        return Double.parseDouble(getAmount());
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Models.Food.Nutrition.foodNutritionCentral getFoodNutritionCentral() {
        return foodNutritionCentral;
    }

    public void setFoodNutritionCentral(Models.Food.Nutrition.foodNutritionCentral foodNutritionCentral) {
        this.foodNutritionCentral = foodNutritionCentral;
    }
}
