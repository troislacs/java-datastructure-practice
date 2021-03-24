package abstraction;

public class App {
    public static void main(String[] args) {
        Shape c = new Circle(); //polymorphism
        printName(c);

        Sqaure s = new Sqaure();
        printName(s);

        s.doSomething();

    }

    public static void printName(Shape shape){
        System.out.println(shape.getName());
    }

}
