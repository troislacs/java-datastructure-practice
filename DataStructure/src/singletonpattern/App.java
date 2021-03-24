package singletonpattern;

public class App {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        object1.showMessage();

        Singleton object2 = Singleton.getInstance();
        object2.showMessage();

        Singleton object3 = Singleton.getInstance();
        object3.showMessage();
    }
}
