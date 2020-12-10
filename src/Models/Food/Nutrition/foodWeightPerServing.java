package Models.Food.Nutrition;

import com.google.gson.annotations.SerializedName;

/*
"amount": 10,
      "unit": "g"
 */
public class foodWeightPerServing {
    @SerializedName("amount")
    private int amount;

    @SerializedName("unit")
    private String unit;

    public foodWeightPerServing(int amount, String unit) {
        setAmount(amount);
        setUnit(unit);
    }

    public String amountToString() {
        return String.valueOf(amount);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
