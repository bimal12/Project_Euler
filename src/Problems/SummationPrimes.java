package Problems;

/**
 * Created by bimal_000 on 0001, 01, 11, 2015.
 */
public class SummationPrimes {
    public static boolean isPrime(int n){
        if(n==1){
            return false;}
        for (int i = 2;i<=n/2;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 3;
        long sum =2;
        while(num<2000000){
            if (isPrime(num)){
                sum+=num;
                //System.out.println(sum);

            }
           // System.out.println(num);
            num+=2;

        }
        System.out.println(sum);
    }
}
