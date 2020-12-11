/*
    Name:       Wyatt Kirschner
    StudentID:  200407722
    Date:       12/10/20
    Project:    Nutrious - A macro finder using Spoonacular API
 */

package Models.Food.Nutrition;


import com.google.gson.annotations.SerializedName;

public class caloricBreakdown {
    @SerializedName("percentProtein")
    private double percentProtein;

    @SerializedName("percentFat")
    private double percentFat;

    @SerializedName("percentCarbs")
    private double percentCarbs;

    public caloricBreakdown(double percentProtein, double percentFat, double percentCarbs) {
        setPercentProtein(percentProtein);
        setPercentFat(percentFat);
        setPercentCarbs(percentCarbs);
    }

    public String percentProteinToString()
    {
        return String.valueOf(getPercentProtein());
    }

    public String percentFatToString()
    {
        return String.valueOf(getPercentFat());
    }

    public String percentCarbsToString()
    {
        return String.valueOf(getPercentCarbs());
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
