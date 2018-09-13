import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        int num_of_grades = 3;

        Assignment grades[] = new Assignment[] { new Assignment(), new Assignment(), new Assignment() };

        for (int i = 0; i < grades.length; i++) 
            grades[i].getInput(i+1);
        
        printTable(grades);
    }

    public static void printTable(Assignment[] grades) {
        String leftAlignFormat = "| %-15s | %-4d |%n";
        System.out.format("+---------------+--------+----------------+%n");
        System.out.format("| Exercise      | Score  | Total Possible |%n");
        System.out.format("+---------------+--------+----------------+%n");

        for (int i = 0; i < grades.length; i++) {
            System.out.format(leftAlignFormat, grades[i].name, grades[i].score, grades[i].max_score);

        }
        System.out.format("+---------------+--------+----------------+%n");

    }
}