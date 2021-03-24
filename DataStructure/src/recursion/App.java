package recursion;

public class App {
    public static void main(String[] args) {
        //fibonacci
        //o,1,1,2,3,5,8,13...
        int n = 10;
        System.out.printf("The fibo of %d is %d", n, fibo(n));

        System.out.println();
        //factorial => 5! = 5 * 4 * 3 *2 * 1 => 5 * 4!
        System.out.printf("The factorial of %d is => %d", n, fact(n));

        System.out.println();
        int base = 4;
        int p = 5;
        System.out.printf("the power of %d and %d is %d",  base, p, pow(base, p));

        System.out.println();
        System.out.println("the count of hi is => " + countOfHi("hihiddddhihhi"));


        String x = "ccccxtttYYYYxTx";
        System.out.println(changeXY(x));
    }

    private static int fibo(int n){
        //exit condition
        if (n == 1) return 1;
        if (n == 0) return 0;
        return fibo(n-1)+ fibo(n-2);
    }

    private static int fact(int n){
        if (n == 1 || n==0) return 1;
        return n * fact(n-1);
    }
    //write a method to calculate pow(base, n)
    public static int pow(int base, int n){
        if (n == 0) return 1;
        return base * pow(base, n-1);
    }

    public static int countOfHi(String str){
        // exit condition
        if (str.length() < 2){
            return 0;
        }
        if (str.substring(0, 2).equals("hi")){
            return 1 + countOfHi(str.substring(2));
        }
        return countOfHi(str.substring(1));
    }

    public static String changeXY(String str){
        //exit condition
        if (str.length() == 0){
            return str;
        }
        //xtyxuuuu => y tyxuuuu
        if (str.charAt(0) == 'x'){
            return 'y' + changeXY(str.substring(1));
        }
        return str.charAt(0) + changeXY(str.substring(1));
    }
}
