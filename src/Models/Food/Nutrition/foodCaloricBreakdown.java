package Models.Food.Nutrition;

/*
"percentProtein": 4.89,
      "percentFat": 43.44,
      "percentCarbs": 51.67
 */

import com.google.gson.annotations.SerializedName;

public class foodCaloricBreakdown {
    @SerializedName("percentProtein")
    private double percentProtein;

    @SerializedName("percentFat")
    private double percentFat;

    @SerializedName("percentCarbs")
    private double percentCarbs;
}
