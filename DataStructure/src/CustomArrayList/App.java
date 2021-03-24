package CustomArrayList;

public class App {
    public static void main(String[] args) {
        CustomArray array = new CustomArray();
        array.add(5);
        array.add(8);

        System.out.println(array);

        array.add(15);
        array.add(18);
        array.add(25);
        array.add(38);

        System.out.println(array);

        array.deleteByIndex(2);
        System.out.println(array);

        array.deleteByValue(18);
        System.out.println(array);

        array.insertValueAtIndex(3, 60);
        System.out.println(array);

        int[] slice = array.slice(2, 2);
        System.out.println(java.util.Arrays.toString(slice));

        int[] ddd = new int[]{1,2,3};
        array.addAll(ddd);
        System.out.println(array);

    }
}
