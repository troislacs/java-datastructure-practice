package CustomArrayList;

import java.util.*;

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}


public class ArrayListTest {
    public static void main(String[] args) {
        //Generic arrayList
        ArrayList<Integer> testArray = new ArrayList<>();
        testArray.add(1);

        ArrayList<Person> personArray = new ArrayList<>();
        personArray.add(new Person(18, "Joe"));
        personArray.add(new Person(28, "John"));
        personArray.add(new Person(48, "Jack"));

        //Lambda Expression
//        personArray.forEach(person -> System.out.println(person));

        for(Person p : personArray){
            System.out.println(p);
        }

        System.out.println("-------------------");
        Person p1 = personArray.get(1);
        System.out.println(p1);

        Person searchValue = new Person(18, "Joe");
        System.out.println(personArray.contains(searchValue));


        List<Person> people = new ArrayList<>();
        printList(people);//upcasting
    }

    private static void printList(List pList){
        
    }
}
