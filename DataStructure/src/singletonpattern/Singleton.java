package singletonpattern;

public class Singleton {
    private static Singleton instance = new Singleton();
    int counter = 0;

    private Singleton(){
        counter++;
    }

    public static Singleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("the number of instances " + counter);
    }
}
