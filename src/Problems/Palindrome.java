package Problems;

/**
 * Created by bimal_000 on 0001, 01, 11, 2015.
 */
public class Palindrome {
    public static void main(String[] args) {
        int maxP = 0;
        for (int j =999;j>1;j--){
        for (int i =999; i>1;i--){

        int num = i*j;
        int n = num;
        int rev = 0,rmd;
        while (num>0){
            rmd = num%10;
            rev= rev*10 + rmd;
            num= num/10;
        }
        if (rev == n){
            System.out.println(i+": palindrome");
            maxP = (maxP<n)? n : maxP;
        }
        else {
            System.out.println("not");
        }
        }}
        System.out.println(maxP);
    }
}
