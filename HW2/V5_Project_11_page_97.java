import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class V5_Project_11_page_97 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Assignment grades[] = new Assignment[3];
        if (args.length > 0) {
            try {
                File inputFile = new File(args[0]);
                BufferedReader br = new BufferedReader(new FileReader(inputFile));
                for (int i = 0; i < 3; i++) {
                    String name = br.readLine();
                    double score = Double.parseDouble(br.readLine());
                    double max_score = Double.parseDouble(br.readLine());
                    grades[i] = new Assignment(name, score, max_score);
                }
            } catch (FileNotFoundException ex) {
                // insert code to run when exception occurs
            }

        } else {
            for (int i = 0; i < grades.length; i++) {
                grades[i] = new Assignment(i + 1);
                // grades[i].getInput(i + 1);
            }

        }

        printTable(grades);
    }

    public static void printTable(Assignment[] grades) {
        double sum = 0, total = 0; // the sum of all the assignments and the total max points
        DecimalFormat df2 = new DecimalFormat(".##"); // the 2 decimal place format
        DecimalFormat percent = new DecimalFormat(".##%"); // the percent format

        String leftAlignFormat = "| %-13s | %-7s | %-14s |%n"; // the format of the table
        System.out.format("+---------------+---------+----------------+%n");
        System.out.format("| Exercise      | Score   | Total Possible |%n");
        System.out.format("+---------------+---------+----------------+%n");

        for (int i = 0; i < grades.length; i++) {
            System.out.format(leftAlignFormat, grades[i].name, df2.format(grades[i].score),
                    df2.format(grades[i].max_score));
            sum += grades[i].score;
            total += grades[i].max_score;
        }
        System.out.format(leftAlignFormat, "Total", df2.format(sum), df2.format(total));
        System.out.format("+---------------+---------+----------------+%n");
        double decimal = sum / total; // the decimal used for the percentage
        System.out.println(" Your total is " + df2.format(sum) + " out of " + df2.format(total) + ", or "
                + percent.format(decimal));
    }
}

class Assignment {
    Scanner input = new Scanner(System.in); // scanner to read input
    String name; // name of class
    double score, // score earned by student
            max_score; // max possible score the student could earn

    Assignment(String name, double score, double max_score) {
        this.name = name;
        this.score = score;
        this.max_score = max_score;
    }

    Assignment(int currentNumber) {
        String garbage; // garbage charater collection
        System.out.println("Name of exercise " + currentNumber + ":");
        this.name = input.nextLine();
        System.out.println("Score received for exercise " + currentNumber + ":");
        this.score = input.nextDouble();
        garbage = input.nextLine();
        System.out.println("Total points possible for exercise " + currentNumber + ":");
        this.max_score = input.nextDouble();
        garbage = input.nextLine();
    }

    public void getInput(int currentNumber) {
        String garbage; // garbage charater collection
        System.out.println("Name of exercise " + currentNumber + ":");
        this.name = input.nextLine();
        System.out.println("Score received for exercise " + currentNumber + ":");
        this.score = input.nextDouble();
        garbage = input.nextLine();
        System.out.println("Total points possible for exercise " + currentNumber + ":");
        this.max_score = input.nextDouble();
        garbage = input.nextLine();
    }
}