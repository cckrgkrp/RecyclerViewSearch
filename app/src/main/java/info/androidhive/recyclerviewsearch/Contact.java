package info.androidhive.recyclerviewsearch;

/**
 * Created by ravi on 16/11/17.
 */

public class Contact {
    String koreanName;
    String image;
    String englishName;

    public Contact() {
    }

    public String getName() {
        return koreanName;
    }

    public String getImage() {
        return "https://s3.ap-northeast-2.amazonaws.com/vin-image/"+image+".jpg";
    }

    public String getPhone() {
        return englishName;
    }
}
