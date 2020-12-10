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

    public foodNutrients(String title, double amount, String unit) {
        setTitle(title);
        setAmount(amount);
        setUnit(unit);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
