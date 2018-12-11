import java.util.ArrayList;

public abstract class Notifications {
    protected int _id;
    private int tickInterval;
    private Notifier schedule;

    Notifications(int id, Notifier schedule, int tickInterval) {
        this._id = id;
        this.schedule = schedule;
        this.setAlarm(tickInterval, schedule);
    }

    public void setAlarm(int timeInterval, Notifier schedule) {
        tickInterval = timeInterval;
    
        schedule.registerObject(schedule.getCurrentTick() + timeInterval, this);
        
    }

    public abstract void doAlarm();

}