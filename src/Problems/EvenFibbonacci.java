package Problems;

import java.util.stream.IntStream;

/**
 * Created by bimal_000 on 0031, 31, 10, 2015.
 */
public class EvenFibbonacci {
    public static void main(String[] args) {
        int fib1 = 0;
        int fib2 = 1;
        int fibonnaci = 1;
        int sum = 0;
        while (fib1+fib2<4000000){
            fibonnaci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonnaci;
            if (fibonnaci%2 == 0){
                sum += fibonnaci;
            }
        }
        System.out.println(sum);
    }
}
