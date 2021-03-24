package alex08Quiz2P2;

import java.util.HashMap;
import java.util.Map;

public class SuperFibs {
    private Map<Integer,Long> cache = new HashMap<>();
    public static int stepsCount = 1;
    public SuperFibs(){
        cache.put(1,0L);
        cache.put(2,1L);
        cache.put(3,1L);
    }

    public long getNthFib(int n){
        if (n<1) throw new IndexOutOfBoundsException("Index Out of Bounds!");

        if (!cache.keySet().contains(n)) {
        if (n>3){
            cache.put(n,getNthFib(n-1)+getNthFib(n-2)+getNthFib(n-3));
        }
        stepsCount++;
        }

        return cache.get(n);
    }

}
