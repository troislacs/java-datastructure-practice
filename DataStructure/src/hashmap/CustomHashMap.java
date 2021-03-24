package hashmap;

public class CustomHashMap {
    public static void main(String[] args) {
        CustomeHashMapString hash = new CustomeHashMapString();
        hash.putValue("1", "abc");
        hash.putValue("2", "FER");
        hash.putValue("3", "eee");
        hash.putValue("4", "ggg");
        hash.putValue("5", "abc");
        hash.putValue("6", "FER");
        hash.putValue("7", "eee");
        hash.putValue("8", "ggg");
        hash.putValue("9", "FER");
        hash.putValue("10", "eee");
        hash.putValue("11", "ggg");
        hash.putValue("12", "ggg");
//        hash.putValue("12", "Reza");

        System.out.println("--------------");
        //hash.printDebug();
        System.out.println(hash);

    }
}
