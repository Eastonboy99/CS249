import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class BookStore extends Notifications {

  private HashMap<String, Integer> inventorySold = new HashMap<>();
      
    BookStore(int id, Notifier schedule, int tickInterval) {
      super(id, schedule, tickInterval);
      inventorySold.put("Books", 0);
      inventorySold.put("Magizines", 0);
  }

  @Override
  public void doAlarm(){
    Random rand = new Random();

    int books = inventorySold.get("Books") + rand.nextInt(7);
    inventorySold.put("Books", books);
    int mag = inventorySold.get("Magizines") + rand.nextInt(10);
    inventorySold.put("Magizines", mag);
      System.out.println("Object id: "+ this._id + ", Object Type: Book Store, Books Sold: " + inventorySold.get("Books") + " Magizines Sold: " + this.inventorySold.get("Magizines"));
  }
}