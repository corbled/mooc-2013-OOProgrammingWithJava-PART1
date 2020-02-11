import java.util.ArrayList;

public class TheGreatest {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }

    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int greatest = Integer.MIN_VALUE;
        for(int num : list) {
            if (num > greatest) {
                greatest = num;
            }
        }
        return greatest;
    }
}
