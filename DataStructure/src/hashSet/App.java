package hashSet;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.contains(12);
        //It doesn't accept duplicate value
        int[] numbers = new int[]{1,1,1,1,1,1,2,2,2,2,4,5,6,7};

        for (int j=0; j< numbers.length ; j++){
            hashSet.add(numbers[j]);
        }

        System.out.println(hashSet.size());
    }
}
