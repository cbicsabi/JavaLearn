package JavaBasicsLab.SessionFourHomework;

public class ShopItem {
    private String category;
    private String name;
    private String id;
    private double price;
    private String description;

    public ShopItem(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public ShopItem(String category, String name, String id, double price) {
        this.category = category;
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public ShopItem(String category, String name, String id, double price, String description) {
        this.category = category;
        this.name = name;
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
