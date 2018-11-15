import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class V5_Project_11_page_646 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Current Month");
        String month = input.nextLine();
        System.out.println("Please enter the Current day");
        int day = input.nextInt();
        System.out.println("Please enter the Current year");
        int year = input.nextInt();

        Date currentDate = new Date(month, day, year);

        DataStore data = new DataStore("./testfile", currentDate);
        List<Person> objects = new ArrayList<>();
        objects.add(new Person("Johann Sebastian Bach", new Date("March", 21, 1685), new Date("July", 28, 1750)));
        objects.add(new Person("Igor Stravinsky", new Date("June", 17, 1882), new Date("April", 6, 1971)));
        objects.add(new Person("John Adams", new Date("February", 15, 1947), null));

        // Write Objects to file
        System.out.println("Writing Data to file.");
        for (Person writePerson : objects) {
            data.addPerson(writePerson);
        }

        // Read Objects from file
        System.out.println("Now let's reopen the file and display the data.");
        readObjects(data);

        // Delete Person
        System.out.println("Now Deleting a person.");
        data.deletePerson("Igor Stravinsky");
        readObjects(data);

        // adding Person
        System.out.println("Now adding a person.");
        data.addPerson(new Person("Stan Lee", new Date("December", 28, 1922), new Date("November", 12, 2018)));
        readObjects(data);

        // getting Persons of certain age range
        System.out.println("Now getting people between the age of 72-96");
        List<Person> ageRange = data.getAgeRange(72, 96);
        for (Person readPerson : ageRange) {
            System.out.println(readPerson);
        }
        System.out.println("End of program.");
    }

    public static void readObjects(DataStore data) {
        List<Person> readObjects = data.readPersons();
        for (Person readPerson : readObjects) {
            System.out.println(readPerson);
        }
    }

}