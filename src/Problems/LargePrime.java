package Problems;

/**
 * Created by bimal_000 on 0001, 01, 11, 2015.
 */
public class LargePrime {
    //work out the 10001st prime number



    public static boolean isPrime(int n){
        for (int i = 2;i<=n/2;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1;
        int n = 0;
        while(n<6){
            if (isPrime(num)){
                n++;
            }
            System.out.println(num);
            num+=2;

        }
        System.out.println(num-2);
    }
}
