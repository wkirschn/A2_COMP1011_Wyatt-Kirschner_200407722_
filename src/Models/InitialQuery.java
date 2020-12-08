package Models;


// https://spoonacular.com/food-api/docs/show-images
// https://spoonacular.com/cdn/ingredients_250x250/apple.jpg
// https://spoonacular.com/cdn/ingredients_ x /{image name}
// 100x100, 250x250, 500x500
// https://spoonacular.com/cdn/ingredients_250x250/pineapple-with-can.png
// Just grab the image string and attach it to a base string and done

import com.google.gson.annotations.SerializedName;

public class InitialQuery {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("image")
    private String image;
}
