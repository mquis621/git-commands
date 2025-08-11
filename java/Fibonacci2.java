import java.util.ArrayList;
import java.util.List;

public class Fibonacci2 {

    public static List<Integer> fib(int n) {
        List<Integer> seq = new ArrayList<>();
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            seq.add(a);
            int temp = a;
            a = b;
            b = a + temp;
        }

        return seq;
    }


    public static void main(String[] args) {
        List<Integer> result = fib(3);
        System.out.println(result);
    }
}
   