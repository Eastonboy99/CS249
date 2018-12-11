import java.util.ArrayList;
import java.util.Random;

public class Faculty extends Notifications {
    private int phoneCalls = 0;
    private int _id;

    Faculty(int id, Notifier schedule, int tickInterval) {
        super(id, schedule, tickInterval);
    }

  @Override
  public void doAlarm(){
    Random rand = new Random();
      phoneCalls+= rand.nextInt(5);
      System.out.println("Object id: "+ this._id + ", Object Type: Faculty, Phone Calls Recieved: " + this.phoneCalls);
  }
}