import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {

    public static List<Integer> fibIterative(int n) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            sequence.add(a);
            int temp = a;
            a = b;
            b = temp + b;
        }

        return sequence;
    }

    public static void main(String[] args) {
        List<Integer> result = fibIterative(5);
        System.out.println(result);  
    }
}
