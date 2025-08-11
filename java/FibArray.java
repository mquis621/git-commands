import java.util.Arrays;

public class FibArray{

    public static int[] fib(int n){
        int[] seq = new int[n];

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            seq[i] = a;
            int temp = a;
            a = b;
            b = temp + a;
        }

        return seq;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(fib(5)));
    }
}