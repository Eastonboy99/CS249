import java.util.Scanner;

public class Assignment {
    Scanner input = new Scanner(System.in);
    String name;
    double score, max_score;

    public void getInput(int currentNumber){
        System.out.println("Name of exercise "+ currentNumber +":");
        this.name = input.nextLine();
        System.out.println("Score received for exercise "+ currentNumber +":");
        this.score = input.nextDouble();
        System.out.println("Total points possible for exercise "+ currentNumber +":");
        this.max_score = input.nextDouble();
    }
}