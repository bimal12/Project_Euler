package Problems;

/**
 * Created by bimal_000 on 0031, 31, 10, 2015.
 */
public class Multiples_3_5 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i<1000; i++){
            if(i%3 == 0 || i%5 ==0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
