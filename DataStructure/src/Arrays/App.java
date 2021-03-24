package Arrays;


class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class App {

    public static void main(String[] args) {
        //one way of array allocation
        int[] intArray = new int[10]; //primitives take the real value
        int x = intArray.length;

        intArray[0] = 12;

        Person[] personArray = new Person[12]; // The address of the objects will be stored in the array
        personArray[0] = new Person("A", 12);
        personArray[1] = new Person("B", 14);

        //object reference
        Person p = personArray[1];
        p.age =20;

        System.out.println(personArray[1]); //the modified value

        //one way of array allocation
        int[] myintArray;
        myintArray= new int[20];

        myintArray[0] = 132;


        System.out.println(personArray[2]);
        System.out.println(myintArray[3]);


        //Array Literal
        int[] arrLiteral  = new int[]{1,20,3,40,5,60};

        //complexity => O(n), we always count the worst case.
        //if I want to print 60, how many steps I need to jump, until I print 60
        for(int i=0; i < arrLiteral.length; i++){
            System.out.print(arrLiteral[i] + " ");
        }



    }
}
