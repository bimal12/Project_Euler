package Problems;

/**
 * Created by bimal_000 on 0001, 01, 11, 2015.
 */
public class PythagoreanTriplet {
    public static void main(String[] args) {
        for (int c = 0; c<1000;c++){
            for (int b = 0; b<c; b++){
                for (int a = 0; a < b; a++) {
                    if (a+b+c ==1000 && a*a +b*b == c*c){
                        System.out.println(a*b*c);
                    }
                }

            }

        }
    }
}
