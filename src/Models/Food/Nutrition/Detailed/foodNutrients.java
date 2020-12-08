package Models.Food.Nutrition.Detailed;

/*
"title": "Calories",
      "amount": 50.2,
      "unit": "kcal",
 */

import com.google.gson.annotations.SerializedName;

public class foodNutrients {

    @SerializedName("title")
    private String title;

    @SerializedName("amount")
    private double amount;

    @SerializedName("unit")
    private String unit;
}
