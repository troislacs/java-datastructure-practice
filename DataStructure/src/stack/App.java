package stack;

public class App {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(new Employee("A1", "B1", 1));
        stack.push(new Employee("A2", "B2", 2));
        stack.push(new Employee("A3", "B3", 3));
        stack.push(new Employee("A4", "B4", 4));
        stack.push(new Employee("A5", "B5", 5));

        stack.printStack();
        System.out.println("&&&&&&&&&&&&&");
        System.out.println(stack.pop());
        System.out.println("&&&&&&&&&&&&&");

        stack.printStack();

        stack.push(new Employee("A6", "B6", 6));
        stack.push(new Employee("A7", "B7", 7));
        stack.push(new Employee("A8", "B8", 78));

        System.out.println("&&&&&&&&&&&&&");
        System.out.println(stack.peek());
        System.out.println("&&&&&&&&&&&&&");

        stack.printStack();


    }
}
