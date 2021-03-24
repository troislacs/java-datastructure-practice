package Tree;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(19);
        intTree.insert(30);
        intTree.insert(27);
        intTree.insert(60);
        intTree.insert(40);
        intTree.insert(12);
        intTree.insert(10);
        intTree.insert(14);
        intTree.insert(22);


        System.out.println("the min is " + intTree.min());
        System.out.println("the max is " + intTree.max());

        System.out.println("traversing");

        intTree.traverseOrder();

        System.out.println("Get the value" + intTree.get(30));

        System.out.println("delete");

        intTree.delete(14);

        intTree.traverseOrder();

        SortedMap<Integer, String> sortedMap = new TreeMap<>();

        int[] numbers = new int[]{1,2,3,4};

        List<Integer> numbers2 = new ArrayList<>();

        Collection<Integer> coll = new ArrayList<>();

        //DON't Forget this class
        Collections.synchronizedList(numbers2);
    }
}
