import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {

        // First Time through
        int idCounter = -1;
        Notifier schedule = new Notifier();
        Student tStudent = new Student(++idCounter, schedule, 3, 3.4);
        Faculty tFaculty = new Faculty(++idCounter, schedule, 5);
        BookStore tBookStore = new BookStore(++idCounter, schedule, 1);

        for (int i = 0; i < 10; i++)
            schedule.tick();

        // Lets run again
        System.out.println("---------------Resetting---------------");
        schedule.reset();
        for (int i = 0; i < 10; i++)
            schedule.tick();
    }
}