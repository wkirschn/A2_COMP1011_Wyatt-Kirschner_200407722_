package Models;

import com.google.gson.annotations.SerializedName;

public class SpoonacularJsonResponse {

    //Contains id (int), name (string), image (string)

    @SerializedName("results")
    private String results;

    @SerializedName("offset")
    private int offset;

    // How many are being shown

    @SerializedName("number")
    private int number;

    // Total Query

    @SerializedName("totalResults")
    private int totalResults;

}
