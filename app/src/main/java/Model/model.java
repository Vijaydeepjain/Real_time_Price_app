package Model;

public class model {
    String imagelink;
    String price;
    String name;

    public model(String imagelink, String price, String name) {
        this.imagelink = imagelink;
        this.price = price;
        this.name = name;
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
