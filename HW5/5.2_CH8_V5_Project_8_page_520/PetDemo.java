
import java.util.Scanner;
import java.text.DecimalFormat;

public class PetDemo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#### ml");

        Pet pets[] = new Pet[4];

        pets[0] = new Dog("Dexter", 13, 50);
        pets[1] = new Dog("Baxter", 6, 27);
        pets[2] = new Cat("Daisy", 3, 8);
        pets[3] = new Cat("Susie", 5, 6);

        for (int i = 0; i < 4; i++) {
            System.out.println("For " + pets[i].getName() + ": Acepromazine: " + df.format(pets[i].acepromazine())
                    + " Carprofen: " + df.format(pets[i].carprofen()));
        }

    }
}
