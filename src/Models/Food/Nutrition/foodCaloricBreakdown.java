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

    public foodCaloricBreakdown(double percentProtein, double percentFat, double percentCarbs) {
        setPercentProtein(percentProtein);
        setPercentFat(percentFat);
        setPercentCarbs(percentCarbs);
    }

    public double getPercentProtein() {
        return percentProtein;
    }

    public void setPercentProtein(double percentProtein) {
        this.percentProtein = percentProtein;
    }

    public double getPercentFat() {
        return percentFat;
    }

    public void setPercentFat(double percentFat) {
        this.percentFat = percentFat;
    }

    public double getPercentCarbs() {
        return percentCarbs;
    }

    public void setPercentCarbs(double percentCarbs) {
        this.percentCarbs = percentCarbs;
    }
}
