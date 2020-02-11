import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    // Copy here average from exercise 64

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int num : list) {
            sum += num;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = ((double)sum(list))/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        System.out.println("average = " + average);

        ArrayList<Double> sqrdVals = new ArrayList<Double>();
        for(double num : list) {
            num -= average;
            sqrdVals.add(Math.pow((double)num, 2.0));
        }

        double sumSqrdVals = 0;
        for(double num : sqrdVals) {
            sumSqrdVals += num;
        }
        return sumSqrdVals/(list.size() -1);
    }

}
