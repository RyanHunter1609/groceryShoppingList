import java.time.LocalDate;

public class GroceryItem {
    private LocalDate date;
    private String item;
    private Integer price;

    // record the date, the item, and the price (rounded to nearest dollar) in that list.
    //create objects in seperate classes
    //CRUD
    public GroceryItem() {
        date = LocalDate.now();
        item = "Mango";
        price = 1;
    }

    public GroceryItem(LocalDate date, String item, Integer price) {
        this.date = date;
        this.item = item;
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return date + " | " + item + " | " + price + "\n";
    }
}
