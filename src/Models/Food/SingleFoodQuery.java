/*
    Name:       Wyatt Kirschner
    StudentID:  200407722
    Date:       12/10/20
    Project:    Nutrious - A macro finder using Spoonacular API
 */

package Models.Food;


import Models.Food.Nutrition.nutrition;
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

    @SerializedName("nutrition")
    private nutrition nutrition;


    public SingleFoodQuery(String originalName, String amount, String image, nutrition nutrition) {
        setOriginalName(originalName);
        setAmount(amount);
        setImage(image);
        setNutrition(nutrition);
    }

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

    public nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(nutrition nutrition) {
        this.nutrition = nutrition;
    }
}
