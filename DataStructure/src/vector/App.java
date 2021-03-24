package vector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        List<Integer> listOfInt = new Vector<>(); //vector is very old and thread-safe data structure
        //it is SLOWWWW

        //it is there since jdk 1.0
        listOfInt.add(1);

        //multithreading
        //Vector is synchronized. If a thread-safe
        // implementation is not needed, it is recommended to use ArrayList in place of Vector.

    }

    public static synchronized void doSomething(){
        //thread-safe operation
    }
}
