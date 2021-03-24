package linkedListArray;

import java.util.LinkedList;

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class LinkedListTest {
    public static void main(String[] args) {

        LinkedListArrayOfString linkedList = new LinkedListArrayOfString();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");

        System.out.println(linkedList);
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.deleteByValue("3"));
        System.out.println(linkedList);


        LinkedListArray<Integer> list = new LinkedListArray<>();
        list.add(1);

        LinkedListArray<Employee> listOfEmployee = new LinkedListArray<>();
        listOfEmployee.add(new Employee("A", 2000));
        listOfEmployee.add(new Employee("B", 1000));

        System.out.println(listOfEmployee);

        //JDK has its own linkedList
        LinkedList<Integer> jdkLinkedList = new LinkedList<>();
        jdkLinkedList.add(2);
    }
}
