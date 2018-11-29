
public class InsertionSort {

    /**
     * Precondition: Interval a[begin] through a[end] of a have elements.
     * Postcondition: The values in the interval have been rearranged so that
     * a[begin] <= a[begin+1] <= ... <= a[end].
     */
    public static void sort(double[] a, int begin, int end) {
        if ((end - begin) > 0) {
            int splitPoint = split(a, begin, end);
            sort(a, begin, splitPoint);
            join(a, begin, splitPoint, end);
        } // else sorting one (or fewer) elements so do nothing.
    }

    private static int split(double[] a, int begin, int end) {
        return (end - 1);
    }

    private static void join(double[] a, int begin, int splitPoint, int end) {
        double[] temp;
        int intervalSize = (end - begin) + 1;
        temp = new double[intervalSize];
        int nextLeft = begin;
        int nextRight = begin + 1;

        while (a[end] > a[nextLeft] && end > nextLeft) {
            nextRight++;
            nextLeft++;
        }

        for (int i = begin; i < nextLeft; i++)
            temp[i] = a[i];
        temp[nextLeft] = a[end];
        for (int i = nextLeft; i < end; i++)
            temp[i + 1] = a[i];

        for (int i = begin; i <= end; i++) {
            a[i] = temp[i];
        }

    }

}
