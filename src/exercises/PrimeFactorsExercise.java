package exercises;

import java.util.ArrayList;

public class PrimeFactorsExercise {
    public ArrayList generate(int n) {
        
        ArrayList primeNumbersList = new ArrayList();

        for (int i = 2; i <=n ; i++) {
            if(n%i==0) {
                primeNumbersList.add(i);
                n/=i;
            }
        }
        
        return primeNumbersList;
    }
}
