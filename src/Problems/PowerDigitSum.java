package Problems;

import java.math.BigInteger;

/**
 * Created by bimal_000 on 0001, 01, 11, 2015.
 */
public class PowerDigitSum {
    public static void main(String[] args) {
        BigInteger numb = BigInteger.valueOf(2);
        numb = numb.pow(1000);
        System.out.println(numb);
        //long num = (long) Math.pow(2, 1000);
        BigInteger sum =BigInteger.ZERO;
        BigInteger rmd;
        //need to finish this off

        while (numb.bitCount()>0){

            rmd = numb.remainder(BigInteger.TEN);
            //rmd = num%10;
            System.out.println(rmd);
            sum = sum.add(rmd);
            numb = numb.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }

}
