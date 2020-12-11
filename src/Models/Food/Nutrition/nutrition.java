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


    public nutrition(Models.Food.Nutrition.Detailed.nutrients[] nutrients, Models.Food.Nutrition.caloricBreakdown caloricBreakdown, Models.Food.Nutrition.weightPerServing weightPerServing) {
        this.nutrients = nutrients;
        this.caloricBreakdown = caloricBreakdown;
        this.weightPerServing = weightPerServing;
    }

    public Models.Food.Nutrition.Detailed.nutrients[] getNutrients() {
        return nutrients;
    }

    public void setNutrients(Models.Food.Nutrition.Detailed.nutrients[] nutrients) {
        this.nutrients = nutrients;
    }

    public Models.Food.Nutrition.caloricBreakdown getCaloricBreakdown() {
        return caloricBreakdown;
    }

    public void setCaloricBreakdown(Models.Food.Nutrition.caloricBreakdown caloricBreakdown) {
        this.caloricBreakdown = caloricBreakdown;
    }

    public Models.Food.Nutrition.weightPerServing getWeightPerServing() {
        return weightPerServing;
    }

    public void setWeightPerServing(Models.Food.Nutrition.weightPerServing weightPerServing) {
        this.weightPerServing = weightPerServing;
    }
}
