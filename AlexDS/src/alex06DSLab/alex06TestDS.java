package alex06DSLab;

public class alex06TestDS {
    public static void main(String[] args) {
        System.out.println("General Data Structures Testing (LinkedList, Map, Tree...) started here!\n");
        //TestDoublyLinkedList();
        //TestBubbleSort();
        //TestHashMapStringMoe();
        TestCustomLinkedListGeneric();
    }
    public static void TestCustomLinkedListGeneric(){
        System.out.println("Test Custom Linked List With Generic input");
        // test T = String
        CustomLinkedList<String> clString = new CustomLinkedList<>();
        clString.add("Tom");
        clString.add("Jack");
        clString.add("Abudula");
        System.out.println("\nTesting Generic Type = String");
        System.out.println(clString.toString());
        System.out.println("Size of String Type LinkedList= " + clString.getSize());

        // test T = Person
        CustomLinkedList<Person> clPerson = new CustomLinkedList<>();
        clPerson.add(new Person("Alex","Montreal"));
        clPerson.add(new Person("Bob", "Ottawa"));
        clPerson.add(new Person("Charles","London"));
        System.out.println("\nTesting Generic Type = Person");
        System.out.println(clPerson.toString());
        System.out.println("Size of Person Type LinkedList = " + clPerson.getSize());

    }

    public static void TestBubbleSort(){
        System.out.println("Test Bubble Sort");
        int[] testIn = new int[]{26, 128, 96, 49, 5, 3, 1};
        System.out.println("Original:");
        for(int i=0;i<testIn.length;i++){
            System.out.print(testIn[i]+ (i==testIn.length-1?"\n":","));
        }
        int[] testOut = BubbleSort(testIn);

        System.out.println("Sorted:");
        for(int i=0;i<testOut.length;i++){
            System.out.print(testOut[i]+ (i==testOut.length-1?"\n":","));
        }
        System.out.println("\n");
    }

    public static int[] BubbleSort(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        int temp = 0;
        for (int i = 0; i < output.length - 1; i++) {
            for (int j = 0; j < output.length - 1; j++) {
                if (output[j] > output[j + 1]) {
                    temp = output[j + 1];
                    output[j + 1] = output[j];
                    output[j] = temp;
                }
            }
        }
        return output;
    }

    public static void TestDoublyLinkedList(){
        System.out.println("Test Doubly Linked List");
        //Testing Constructor (1)
        DoublyLinkedList dLList1 = new DoublyLinkedList();
        System.out.println(dLList1.toString());
        dLList1.add(101);
        dLList1.add(102);
        dLList1.add(103);
        System.out.println(dLList1.toString());

        // Testing Constructor (2)
        DoublyLinkedList dLList2 = new DoublyLinkedList(201);
        dLList2.add(202);
        dLList2.add(new int[]{203, 204, 205});
        System.out.println(dLList2.toString());

        // Testing Constructor (3)
        DoublyLinkedList dLList3 = new DoublyLinkedList(new int[]{300,301});
        System.out.println(dLList3.toString());


        // Test Insert by index
        System.out.println("Current Size = " + dLList3.getSize());
        //dLList3.insertByIndex(3, 303);
        System.out.println(dLList3.toString());
        System.out.println("Current Size = " + dLList3.getSize());

        // Test get By Index Reversed
        System.out.println("\nTest Get by index (Des)");
        for (int i = 0; i < dLList3.getSize(); i++) {
            System.out.print(dLList3.getByIndexReversed(i) + ",");
        }

        // Test get By Index
        System.out.println("\nTest Get by index (Asc)");
        for (int i = 0; i < dLList3.getSize(); i++) {
            System.out.print(dLList3.getByIndex(i) + ",");
        }
        System.out.println("\n");


        System.out.println("\nTest Delete by Index");
        dLList3.deleteByIndex(0);
        System.out.println(dLList3.toString());
        System.out.println("\n\nEnd of Doubly Linked List Testing\n");
    }
    public static void TestHashMapStringMoe(){
        CustomeHashMapString hash = new CustomeHashMapString();
        hash.putValue("1", "a");
        hash.putValue("2", "b");
        hash.putValue("3", "c");
        hash.putValue("4", "d");
        hash.putValue("5", "e");
        hash.putValue("6", "f");
        hash.putValue("7", "g");
        hash.putValue("8", "h");
        hash.putValue("9", "i");
        hash.putValue("10", "j");
        hash.putValue("11", "k");
        hash.putValue("12", "456");



        System.out.println("--------------");
        //hash.printDebug();
        System.out.println(hash);
    }
}