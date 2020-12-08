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
}
