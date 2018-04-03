import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //create three grocery item objects
        GroceryItem item01 = new GroceryItem();
        GroceryItem item02 = new GroceryItem(LocalDate.now(), "Almond Milk", 15);
        GroceryItem item03 = new GroceryItem(LocalDate.now(), "Oreo", 4);

        //create three grocery item objects
        ArrayList<GroceryItem> listOfItems = new ArrayList<>();
        listOfItems.add(item01);
        listOfItems.add(item02);
        listOfItems.add(item03);

        //write grocery item(s) to the file input.txt
        writeToFile(listOfItems);

        //number of items were purchased during the last visit to the grocery store
        int itemsPurchased = itemsPurchasedLastVisit(listOfItems);
        System.out.println("Items Purchased Last Visit: " + itemsPurchased);

        //the total price of items purchased on date [D]
        LocalDate localDate = LocalDate.now();
        int itemsTotalPrice = totalPriceOfItemsPurchased(listOfItems, localDate);
        System.out.println("Total Price of Purchased Items(last visit): $" + itemsTotalPrice);
    }

    private static int totalPriceOfItemsPurchased(ArrayList<GroceryItem> listOfItems, LocalDate date) {
        int totalPriceSum = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getDate().equals(date)) {
                totalPriceSum += listOfItems.get(i).getPrice();
            }
        }
        return totalPriceSum;
    }

    private static int itemsPurchasedLastVisit(ArrayList<GroceryItem> listOfItems) {
        int count = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            count++;
        }
        return count;
    }

    private static void writeToFile(ArrayList<GroceryItem> itemArrayList) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("input.txt");
        //writes a nullable object to the PrintWriter
        printWriter.print(itemArrayList);
        printWriter.close();
    }

}