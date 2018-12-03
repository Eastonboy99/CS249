import java.util.ArrayList;
import java.util.Arrays;

public class CH14_V5_Problem_4_page_799 {
    public static void main(String[] args) {
        
        ArrayList<Double> data = new ArrayList<>(Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0));
        

        MyMathClass<Double> math = new MyMathClass<>(data);

        System.out.println(math.standardDeviation());
    }
}