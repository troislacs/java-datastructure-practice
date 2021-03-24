package tasks;

import java.util.ArrayList;
import java.util.List;

public class FiboCache {
    private List<Long> fibsCached = new ArrayList<>(); // NOT a HashMap !
    private int fibsCompCount = 2;

    public FiboCache() {
        fibsCached.add(0L);
        fibsCached.add(1L);
    }

    public long getNthFib(int n) {
        n--;
        if (n < 0) {
            throw new IllegalArgumentException("Index can not be less than 1");
        }
        //calculate and return the value
        return computeNthFib(n);
    }

    private long computeNthFib(int n) {
        //first try to take the value by key
        //if it exists return , if not you need to calculate and PUT in the data collection(database/redis)
        for (int index = fibsCached.size(); index <= n; index++) {
            long val = fibsCached.get(index - 1) + fibsCached.get(index - 2);
            fibsCached.add(val);
            fibsCompCount++;
        }
        return fibsCached.get(n);
    }

    public int getCountOfFibsComputed() {
        return fibsCompCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (long l : fibsCached){
            sb.append(l==0 ? "": ", ");
            sb.append(l);

        }
        return sb.toString();
    }
}