package hashmap;

import java.util.*;

class Person extends Object{
    String name;
    String age;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\''
                +
                '}';
    }
}

class Account{
    String accNo;
    double balance;

    public Account(String accNo) {
        this.accNo = accNo;
    }
}

public class App2 {

    //HashSet, Tree, Stack and Queue
    //SORT
    //Design patterns : Singleton and factory and mvc and decorator

    public static void main(String[] args) {
        HashMap<Person, List<Account>> personAccounts = new HashMap<>();
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("11111"));
        accounts.add(new Account("22222"));

        personAccounts.put(new Person("A"), accounts);

        for(Account acc : accounts){

        }

        String myname = "Reza";
        var city = "Montreal";

        //var is a keyword for local variable
        for (var data :  personAccounts.entrySet()){
            Person p = data.getKey();
            List<Account> account = data.getValue();
            System.out.println(p + "has -> " + account.size());
        }

        for (Map.Entry<Person,List<Account>> data :  personAccounts.entrySet()){
            Person p = data.getKey();
            List<Account> account = data.getValue();
            System.out.println(p + "has -> " + account.size());
        }

        //HashMap<Person, Map<Account, List<Person>>> map = new HashMap<>();

        //hashcollision
        // whenever 2 objects are equals their hashcode needs to be equals
        //whenever 2 objects have the same hashcode, they can be equal or not

        // Do not want duplicate value => HashSet (Set)
        //If you have lots of insertion => LinkedList
        //If you do fetch by index=> ArrayList
        // If you have key and value => HashMap
        // Count the multithreading => Vector/ArrayList

    }
}
