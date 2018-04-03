import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroceryItem item01 = new GroceryItem();
        GroceryItem item02 = new GroceryItem(LocalDate.now(), "Almond Milk", 15);
        GroceryItem item03 = new GroceryItem(LocalDate.now(), "Oreo", 4);

        ArrayList<GroceryItem> listOfItems = new ArrayList<>();
        listOfItems.add(item01);
        listOfItems.add(item02);
        listOfItems.add(item03);

    }
}