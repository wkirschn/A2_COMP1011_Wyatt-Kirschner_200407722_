package Models.Food.Nutrition;

import Models.Food.Nutrition.Detailed.nutrients;
import com.google.gson.annotations.SerializedName;

public class nutrition {

    @SerializedName("nutrients")
    private Models.Food.Nutrition.Detailed.nutrients[] nutrients;

    @SerializedName("caloricBreakdown")
    private Models.Food.Nutrition.caloricBreakdown caloricBreakdown;

    @SerializedName("weightPerServing")
    private Models.Food.Nutrition.weightPerServing weightPerServing;

}
