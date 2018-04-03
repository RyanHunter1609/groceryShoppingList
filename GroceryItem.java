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
        date = LocalDate.now();
        item = "Lotion";
        price = 20;
    }
}
