import java.text.DecimalFormat;
import java.util.Scanner;


public class V5_Project_11_page_97 {

    public static void main(String[] args) {

        Assignment grades[] = new Assignment[] { new Assignment(), new Assignment(), new Assignment() };

        for (int i = 0; i < grades.length; i++)
            grades[i].getInput(i + 1);

        printTable(grades);
    }

    public static void printTable(Assignment[] grades) {
        double sum = 0, total = 0;
        DecimalFormat df2 = new DecimalFormat(".##");
        DecimalFormat percent = new DecimalFormat(".##%");
       
        String leftAlignFormat = "| %-13s | %-7s | %-14s |%n";
        System.out.format("+---------------+---------+----------------+%n");
        System.out.format("| Exercise      | Score   | Total Possible |%n");
        System.out.format("+---------------+---------+----------------+%n");

        for (int i = 0; i < grades.length; i++) {
            System.out.format(leftAlignFormat, grades[i].name, df2.format(grades[i].score), df2.format(grades[i].max_score));
            sum += grades[i].score;
            total += grades[i].max_score;
        }
        System.out.format(leftAlignFormat, "Total", df2.format(sum), df2.format(total));
        System.out.format("+---------------+---------+----------------+%n");
        double decimal = sum/total;
        System.out.println(" Your total is "+ df2.format(sum) + " out of "+ df2.format(total) + ", or " + percent.format(decimal)  );
    }
}