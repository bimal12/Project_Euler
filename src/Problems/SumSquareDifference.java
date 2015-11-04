package Problems;

/**
 * Created by bimal_000 on 0001, 01, 11, 2015.
 */
public class SumSquareDifference {
    public static void main(String[] args) {

        int squaresum = 0;
        int sum =0;

        for (int i =1; i<101;i++){
            sum +=i;
            squaresum += i*i;
        }
        System.out.println(sum*sum-squaresum);



    }
}
