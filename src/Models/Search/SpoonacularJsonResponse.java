package Models.Search;
// TOP -> searchResults
import Models.Search.Results.searchResults;
import com.google.gson.annotations.SerializedName;

public class SpoonacularJsonResponse {

    //Contains id (int), name (string), image (string)

    private Models.Search.Results.searchResults[] searchResults;

    @SerializedName("offset")
    private int offset;

    // How many are being shown

    @SerializedName("number")
    private int number;

    // Total Query

    @SerializedName("totalResults")
    private int totalResults;

    public SpoonacularJsonResponse(Models.Search.Results.searchResults[] searchResults,
                                   int offset, int number, int totalResults) {
        setSearchResults(searchResults);
        setOffset(offset);
        setNumber(number);
        setTotalResults(totalResults);
    }

    public Models.Search.Results.searchResults[] getSearchResults() {
        return searchResults;
    }

    public void setSearchResults(Models.Search.Results.searchResults[] searchResults) {
        this.searchResults = searchResults;
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
