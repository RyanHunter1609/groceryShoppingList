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
        writeToFile(listOfItems);

        //How many items were purchased during the last visit to the grocery store
        int itemsPurchased = itemsPurchasedLastVisit(listOfItems);


    }

    private static int itemsPurchasedLastVisit(ArrayList<GroceryItem> listOfItems) {
        int count = 0;
//        for (int i = 0; i < listOfItems.size(); i++) {
//            if () {
//                count++;
//            }
//        }
        return count;
    }

    //write grocery item(s) to the file input.txt
    private static void writeToFile(ArrayList<GroceryItem> itemArrayList) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("input.txt");
        //writes a nullable object to the PrintWriter
        printWriter.print(itemArrayList);
        printWriter.close();
    }

}