
import java.util.Scanner;
import java.text.DecimalFormat;
public class PetDemo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#### ml");

        Dog usersPet = new Dog("Jane Doe");
        Cat usersPet2 = new Cat("Jane Doe");
        System.out.println("My records on your pet are incomplete.");
        System.out.println("Here is what they currently say:");
        System.out.println(usersPet);


        usersPet.set("Dexter", 13, 50); // set the Dog's name to Dexter, set age to 13, and set weight to 50
        usersPet2.set("Daisy", 12, 8); // set the Dog's name to Dexter, set age to 13, and set weight to 50
        System.out.println("My records now say:");
        System.out.println(usersPet);
        System.out.println(usersPet2);


        System.out.println("For "+ usersPet.getName()+": Acepromazine: " + df.format(usersPet.acepromazine()) + " Carprofen: " + df.format(usersPet.carprofen()));
        System.out.println("For "+ usersPet2.getName()+": Acepromazine: " + df.format(usersPet2.acepromazine()) + " Carprofen: " + df.format(usersPet2.carprofen()));

    }
}
