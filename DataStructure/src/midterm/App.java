package midterm;


import java.util.ArrayList;
import java.util.List;

class Address{
    String street;

    public Address(String street) {
        this.street = street;
    }
}
class Person{
    Address address;

    public Person(Address address) {
        this.address = address;
    }
}
public class App {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Person> plist= new ArrayList<>();

        plist.add(new Person(new Address("st1")));
        plist.add(new Person(new Address("st2")));
        plist.add(new Person(new Address("st3")));

//        plist.addAll()

        for (Person person : plist) {
            person.address.street = "ddd";
        }


        //        Declare new class SuperFibs with an ArrayList with getter only.
//        The Nth item of the indexer will return the Nth "Super Fibonacci" number.
//        "Super Fibonacci" numbers (which I made up so don't look for them online) are defined as follows. The first 3 numbers are: 1st is 0, 2nd is 1, 3rd is 1.
//        Every next number is the sum of *three* of the previous numbers.
//                So the 4th number is 0+1+1=2, for example.

//        Write a program to find how many correct answer each student had in a multiple choice quiz.

        char[] keys = {'A', 'c','d'};



    }




}
