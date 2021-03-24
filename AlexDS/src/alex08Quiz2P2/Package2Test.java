package alex08Quiz2P2;

public class Package2Test {
    public static void main(String[] args) {
        SuperFibs f = new SuperFibs();
        for (int i = 1; i < 8; i++) {
            System.out.println(i + " : "  + f.getNthFib(i) + ", steps " + SuperFibs.stepsCount);
        }
        System.out.println(8 + " : "  + f.getNthFib(200) + ", steps " + SuperFibs.stepsCount);
    }
}
