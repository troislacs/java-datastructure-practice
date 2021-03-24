package alex07Hashmap;

import java.util.HashMap;

public class HashMapTest {


    public static void main(String[] args) {
        //TestJDKHashMap();
        TestCustomHashMap();
    }
    public static void TestCustomHashMap(){
        CustomHashMap hash = new CustomHashMap();
        for(int i=0;i<11;i++) {
            System.out.print(hash.getSize()+",");
            hash.growSize();
        }

    }
    public static void TestJDKHashMap(){
        System.out.println("Try out JDK HashMap!");
        Person testPerson = new Person("John","Jaspie");
        HashMap hm = new HashMap();
        hm.put("Alex","Alberta");
        hm.put("Bob","Belvedere");
        hm.put("Charles","East");
        hm.put(testPerson,"Quebec");
        System.out.println(hm.size());
        System.out.println(hm.get("Tom").toString());
        //System.out.println(hm.get(testPerson).toString());

    }
}
