package sony.com.recyclerjson;

public class Product {

    private String title;
//    private String imgUrl;
    private String description;

    public Product() {
    }

    public Product(String title,String description) {
        this.title = title;
//        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

//    public String getImgUrl() {
//        return imgUrl;
//    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public void setImgUrl(String imgUrl) {
//        this.imgUrl = imgUrl;
//    }

    public void setDescription(String description) {
        this.description = description;
    }
}
