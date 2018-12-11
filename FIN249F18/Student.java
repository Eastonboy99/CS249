import java.util.ArrayList;

public class Student extends Notifications { 
      private double gpa; 
        
      Student(int id, Notifier schedule, int tickInterval, double gpa) {
        super(id, schedule, tickInterval);
        this.gpa = gpa;
    }

    @Override
    public void doAlarm(){
        System.out.println("Object id: "+ this._id + ", Object Type: Student, G.P.A: "+ this.gpa);
    }
}