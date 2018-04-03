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
        GroceryItem item04 = new GroceryItem(LocalDate.now(), "Oreo", 4);
        GroceryItem item05 = new GroceryItem(LocalDate.now(), "Chia Seeds Value Pack", 7);
        GroceryItem item06 = new GroceryItem(LocalDate.now(), "Gum", 1);
        GroceryItem item07 = new GroceryItem(LocalDate.now(), "Lotion", 18);
        GroceryItem item08 = new GroceryItem(LocalDate.now(), "Mango", 1);
        GroceryItem item09 = new GroceryItem(LocalDate.now(), "Kale", 2);
        GroceryItem item10 = new GroceryItem(LocalDate.now(), "Cereal", 5);


        //create three grocery item objects
        ArrayList<GroceryItem> listOfItems = new ArrayList<>();
        listOfItems.add(item01);
        listOfItems.add(item02);
        listOfItems.add(item03);
        listOfItems.add(item04);
        listOfItems.add(item05);
        listOfItems.add(item06);
        listOfItems.add(item07);
        listOfItems.add(item08);
        listOfItems.add(item09);
        listOfItems.add(item10);


        //write grocery item(s) to the file input.txt
        writeToFile(listOfItems);

        //number of items were purchased during the last visit to the grocery store
        int itemsPurchased = itemsPurchasedLastVisit(listOfItems);
        System.out.println("Items Purchased Last Visit: " + itemsPurchased);

        //the total price of items purchased on date [D]
        LocalDate localDate = LocalDate.now();
        int itemsTotalPrice = totalPriceOfItemsPurchased(listOfItems, localDate);
        System.out.println("Total Price of Purchased Items(last visit): $" + itemsTotalPrice);

        //How many times was [A] purchased? For example, if A is eGGs then the above sample item should be counted.
        String userItemInput = "Oreo";
        int amountOfTimesPurchased = amountOfTimesItemIsPurchased(listOfItems, userItemInput);
        System.out.println(userItemInput + " Purchase Occurrence(s): " + amountOfTimesPurchased);
    }

    private static int amountOfTimesItemIsPurchased(ArrayList<GroceryItem> listOfItems, String userItem) {
        int count = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (listOfItems.get(i).getItem().equals(userItem)) {
                count++;
            }
        }
        return count;
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