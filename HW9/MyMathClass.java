import java.util.ArrayList;

public class MyMathClass<T extends Number> {
    private ArrayList<T> data;

    public MyMathClass(ArrayList<T> data) {
        this.setData(data);
    }

    /**
     * @param data the data to set
     */
    public void setData(ArrayList<T> data) {
        this.data = data;
    }

    /**
     * @return the data
     */
    public ArrayList<T> getData() {
        return data;
    }

    public double standardDeviation() {
        // get average
        double average = 0;
        double stdDev = 0;

        for (int i = 0; i < data.size(); i++) {
            average += data.get(i).doubleValue();
        }
        average /= this.data.size();

        // get standard deviation
        for (int i = 0; i < data.size(); i++) {
            stdDev += Math.pow((data.get(i).doubleValue() - average), 2);
        }
        stdDev /= this.data.size();
        stdDev = Math.pow(stdDev, 0.5);
        return stdDev;
    }
}