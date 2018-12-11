import java.util.ArrayList;
import java.util.HashMap;

public class Notifier {

    private int currentTick = -1;
    private HashMap<Integer, ArrayList<Notifications>> schedule = new HashMap<>();

    Notifier() {

    }

    /**
     * @return the currentTick
     */
    public int getCurrentTick() {
        return currentTick;
    }
    public void reset(){
        this.currentTick = -1;
    }

    public void tick() {
        currentTick++;
    System.out.println("Count: " + (currentTick));

        if (schedule.containsKey(currentTick)) {
            ArrayList<Notifications> notifications = schedule.get(currentTick);
            for (int i = 0; i < notifications.size(); i++) {
                notifications.get(i).doAlarm();
            }
        }
    }

    // Check to see if tick has already passed
    public void registerObject(int time, Notifications object) {
        if (!this.schedule.containsKey(time)) {
            this.schedule.put(time, new ArrayList<Notifications>());
        }
        this.schedule.get(time).add(object);

    }
}