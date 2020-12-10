package Models.Search;
// TOP -> searchResults
import Models.Search.Results.results;
import com.google.gson.annotations.SerializedName;

public class SpoonacularJsonResponse {

    //Contains id (int), name (string), image (string)
    @SerializedName("results")
    private results[] results;

    //May not need since I can request for all. Starts at 0 but if I wanted to, set to 10, 20, 30 for pages

    @SerializedName("offset")
    private int offset;

    // How many are being shown, should make max 100 since it's easier than pages

    @SerializedName("number")
    private int number;

    // Total Query

    @SerializedName("totalResults")
    private int totalResults;

   public SpoonacularJsonResponse(Models.Search.Results.results[] results,
                                   int offset, int number, int totalResults) {
        setSearchResults(results);
        setOffset(offset);
        setNumber(number);
        setTotalResults(totalResults);
    }

    /*
        Will be easier to show Results being shown
     */

    private String numberToString() {
        return String.valueOf(getNumber());
    }

     /*
        Will be easier for showing the total results
     */

    private String totalResultsToString() {
        return String.valueOf(getTotalResults());
    }



    public results[] getSearchResults() {
        return results;
    }

    public void setSearchResults(results[] searchResults) {
        this.results = searchResults;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}
