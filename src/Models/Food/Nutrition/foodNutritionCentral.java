/*
    Name:       Wyatt Kirschner
    StudentID:  200407722
    Date:       12/10/20
    Project:    Nutrious - A macro finder using Spoonacular API
 */

package Models.Food.Nutrition;
import Models.Food.Nutrition.Detailed.nutrients;


public class foodNutritionCentral {
    private nutrients[] nutrients;
    private caloricBreakdown caloricBreakdown;
    private weightPerServing weightPerServing;

    public foodNutritionCentral(nutrients[] nutrients,
                                caloricBreakdown caloricBreakdown,
                                weightPerServing weightPerServing) {
        setNutrients(nutrients);
        setCaloricBreakdown(caloricBreakdown);
        setWeightPerServing(weightPerServing);
    }

    public nutrients[] getNutrients() {
        return nutrients;
    }

    public void setNutrients(nutrients[] nutrients) {
        this.nutrients = nutrients;
    }

    public caloricBreakdown getCaloricBreakdown() {
        return caloricBreakdown;
    }

    public void setCaloricBreakdown(caloricBreakdown caloricBreakdown) {
        this.caloricBreakdown = caloricBreakdown;
    }

    public weightPerServing getWeightPerServing() {
        return weightPerServing;
    }

    public void setWeightPerServing(weightPerServing weightPerServing) {
        this.weightPerServing = weightPerServing;
    }
}