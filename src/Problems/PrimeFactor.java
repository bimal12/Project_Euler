package Problems;

/**
 * Created by bimal_000 on 0031, 31, 10, 2015.
 */
public class PrimeFactor {

    static long firstPrimeFactor(long num){
        boolean factor = false;
        //check to see if number is 1
        if (num == 1){
            return 1;
        }
        long numb = 0;
        //check to see if the number is prime
        for (long i = num/2; i > 1; i--){
            numb = i;

            if (num%i == 0 && isPrime(i)){
                factor = true;
                break;
            }

        }
        numb = (factor)? numb:0;
        System.out.println("Largest prime factor is");
        return (numb==0)?num:numb;
    }

    static boolean isPrime(long n){
        for (long i = 2;i<=n/2;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    static long  largestPrimeFactor(long num){
        long largestPrime = Long.MIN_VALUE;
        for (int i = 2; i <= num; i++) {
            if (num % i ==0 ){
                largestPrime = (i>largestPrime)? i : largestPrime;
                System.out.println(i);
                num = num/i;
                i=1;
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {
//        long check = firstPrimeFactor(600851475143L);
        long check = largestPrimeFactor(600851475143L);
        System.out.println(check);
    }
}
