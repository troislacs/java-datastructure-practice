package lambda;

import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class User{
    String name;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid(String username, String pass){
        return this.getPassword().equals(pass) && this.getName().equals(username);
    }
}

class Animal implements Comparator<Animal>{
    private String name;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String name, boolean canHop, boolean canSwim) {
        this.name = name;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return canHop;
    }
    public boolean canSwim(){
        return canSwim;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", canHop=" + canHop +
                ", canSwim=" + canSwim +
                '}';
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        return 0;
    }
}

//interface CheckTrait{
//    boolean test(Animal a);
//}
//
//class CheckIfHopper implements CheckTrait{
//
//    @Override
//    public boolean test(Animal a) {
//        return a.canHop();
//    }
//}

//class CheckIfSwim implements  CheckTrait{
//
//    @Override
//    public boolean test(Animal a) {
//        return a.canSwim();
//    }
//}

public class App {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("fish", false, true));
        animalList.add(new Animal("Kangaroo", true, false));
        animalList.add(new Animal("rabbit", true, false));

        //predicate

        //Since I am using Java 8 Lmabda expression, I don't need to
        //use my own interface, instead I will use predicate inteface
        print(animalList, a-> a.canHop());
        print(animalList, a -> a.canSwim());


        //Consumer
        System.out.println("checking consumer");
        Consumer<Animal> consumer = a -> {
            StringBuilder builder = new StringBuilder(a.toString());
            builder.append("  genereated");
            System.out.println(builder);
        };
        myPrint(new Animal("Kangaroo", true, false), consumer);

        //supplier
        Supplier<Integer> randomNumber = () -> {
            int tempNumber = 12000;
            return new Random().nextInt() + tempNumber;
        };
        System.out.println(printRandomNumber(randomNumber));


        //Java Lambda API for collections
        animalList.forEach(animal -> System.out.println(animal));
        animalList.forEach(animal -> {
            if (animal.canHop()){
                System.out.println(animal + " is a hopper");
            }
        });

        List<Animal> swimmerAnimals = animalList.stream().filter(a -> a.canSwim()).collect(Collectors.toList());

        List<User> users = new ArrayList<>();
        User validUser = users.stream().filter(user -> user.isValid("reza", "123")).findFirst().get();

        animalList.removeIf(animal -> animal.canSwim());

    }

    private static int printRandomNumber(Supplier<Integer> number){
        return number.get();
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker){

        for(Animal animal: animals){
            //General test
            if (checker.test(animal)){
                System.out.println(animal + " ");
            }
        }
        System.out.println();

    }

    private static void myPrint(Animal a, Consumer<Animal> consumer){
        consumer.accept(a);


    }

}
