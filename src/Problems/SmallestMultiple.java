package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by bimal_000 on 0031, 31, 10, 2015.
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        int product = 1;
        List<Integer> factors = new ArrayList<>();

        for (int n = 20; n > 1; n--) {
            int remain = product%n;
            int i =1;
            System.out.println(remain);
            if(!(remain==0)){
                while (remain!=0){
                    if (product*i%n==0) {
                        product *=i;
                        i=1;
                        break;
                    }
                    i++;
                }
            }
        }
        System.out.println(product);
    }


}
