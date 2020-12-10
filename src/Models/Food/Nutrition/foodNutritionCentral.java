package Models.Food.Nutrition;
import Models.Food.Nutrition.Detailed.foodNutrients;


public class foodNutritionCentral {
    private foodNutrients[] foodNutrients;
    private foodCaloricBreakdown foodCaloricBreakdown;
    private foodWeightPerServing foodWeightPerServing;

    public foodNutritionCentral(Models.Food.Nutrition.Detailed.foodNutrients[] foodNutrients,
                                Models.Food.Nutrition.foodCaloricBreakdown foodCaloricBreakdown,
                                Models.Food.Nutrition.foodWeightPerServing foodWeightPerServing) {
        setFoodNutrients(foodNutrients);
        setFoodCaloricBreakdown(foodCaloricBreakdown);
        setFoodWeightPerServing(foodWeightPerServing);
    }

    public Models.Food.Nutrition.Detailed.foodNutrients[] getFoodNutrients() {
        return foodNutrients;
    }

    public void setFoodNutrients(Models.Food.Nutrition.Detailed.foodNutrients[] foodNutrients) {
        this.foodNutrients = foodNutrients;
    }

    public Models.Food.Nutrition.foodCaloricBreakdown getFoodCaloricBreakdown() {
        return foodCaloricBreakdown;
    }

    public void setFoodCaloricBreakdown(Models.Food.Nutrition.foodCaloricBreakdown foodCaloricBreakdown) {
        this.foodCaloricBreakdown = foodCaloricBreakdown;
    }

    public Models.Food.Nutrition.foodWeightPerServing getFoodWeightPerServing() {
        return foodWeightPerServing;
    }

    public void setFoodWeightPerServing(Models.Food.Nutrition.foodWeightPerServing foodWeightPerServing) {
        this.foodWeightPerServing = foodWeightPerServing;
    }
}
