import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;

public class CH16_V5_Project_8_page_940 {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat(".#");
        HashMap<String, ArrayList<Integer>> ratings = new HashMap<>();

        try {
            File file = new File("./ratings.txt");
            Scanner sc = new Scanner(file);
            int numRatings = Integer.parseInt(sc.nextLine());
            String title;
            int rating;
            for (int i = 0; i < numRatings; i++) {
                title = sc.nextLine();

                rating = Integer.parseInt(sc.nextLine());
                if (!ratings.containsKey(title)) {
                    ratings.put(title, new ArrayList<Integer>());
                }
                ratings.get(title).add(rating);

            }

            for (String name : ratings.keySet()) {
                double average = 0;
                ArrayList<Integer> movieRating = ratings.get(name);
                for (int val : movieRating) {
                    average += val;
                }
                average /= movieRating.size();
                System.out.println(
                        name + ": " + movieRating.size() + " reviews, average of " + df2.format(average) + " / 5");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }
}