package Models.Search.Results;


// https://spoonacular.com/food-api/docs/show-images
// https://spoonacular.com/cdn/ingredients_250x250/apple.jpg
// https://spoonacular.com/cdn/ingredients_ x /{image name}
// 100x100, 250x250, 500x500
// https://spoonacular.com/cdn/ingredients_250x250/pineapple-with-can.png
// Just grab the image string and attach it to a base string and done

import com.google.gson.annotations.SerializedName;

public class searchResults {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("image")
    private String image;

    public searchResults(int id, String name, String image) {
        setId(id);
        setName(name);
        setImage(image);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
