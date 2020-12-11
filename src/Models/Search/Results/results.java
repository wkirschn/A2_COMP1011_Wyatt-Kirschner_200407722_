/*
    Name:       Wyatt Kirschner
    StudentID:  200407722
    Date:       12/10/20
    Project:    Nutrious - A macro finder using Spoonacular API
 */

package Models.Search.Results;


// https://spoonacular.com/food-api/docs/show-images
// https://spoonacular.com/cdn/ingredients_250x250/apple.jpg
// https://spoonacular.com/cdn/ingredients_ x /{image name}
// 100x100, 250x250, 500x500
// https://spoonacular.com/cdn/ingredients_250x250/pineapple-with-can.png
// Just grab the image string and attach it to a base string and done

// ID needs to be a String to be passed into the JSON Query

import com.google.gson.annotations.SerializedName;

public class results {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("image")
    private String image;

    public results(int id, String name, String image) {
        setId(id);
        setName(name);
        setImage(image);
    }

    public int getId() {
        return id;
    }

    /*
    Used to convert the ID to a String to parse into JSON Query
     */
    public String getIdToString() {
        return String.valueOf(getId());
    }

    /*
        Need to be there to set the int from JSON
     */

    public void setId(int id) {
        this.id = id;
    }
    /*
        Need the string for the name
     */

    public String getName() {
        return name;
    }
    /*
        Saving from the search result
     */

    public void setName(String name) {
        this.name = name;
    }

    /*
        Needed as a string because the full path isn't returned, but needs to be combined to retrieve the image
     */

    public String getImage() {
        return image;
    }

    /*
        Needed to set the image
     */

    public void setImage(String image) {
        this.image = image;
    }

    public String toString() {
        return String.format(getName());
    }
}