package alex04Recursion;

public class Alex04RecursionTest {
    public static void main(String[] args) {
        // CountHi
        //System.out.println("Test CountHi");
        //String testString = "hi---ok---hi-xxx-hi-hiabc-hi";
        //CountHi(testString,0);
        //System.out.println(CountHi3("okhihiyeshi9hi"));

        //System.out.println(changXY("abxyzokxxd"));

        System.out.println(nestParen("((()))"));

        // factorial
        //System.out.println("Test factorial");
        //int numTestFac=5;
        //System.out.println("f("+ numTestFac +")= " + fac(numTestFac));

        // bunny ears
        //System.out.println("Test bunny ears");
        //int bunnies = 10;
        //System.out.println(bunnies + " has/have "+ bunnyEars2(bunnies) + "ears!");


        // array test
        // count evens

        //System.out.println(endX("Yesxthereisx") + ">>>>>>");
        //System.out.println(endX("abcdxax99"));


    }

    public static boolean nestParen(String str) {
        if(str.length() == 0)
            return true;

        if(str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
            return nestParen(str.substring(1,str.length()-1));

        return false;
    }

    public static String changXY(String input){
        if(input.length()==0)return input;

        if(input.charAt(0)=='x')return 'y'+changXY(input.substring(1));
        else return input.charAt(0)+changXY(input.substring(1));
    }

    public static String countHi2(String input){
        return null;
    }

    public static String endX(String str){
        if(str.length()==1)return str;

        if(str.charAt(0)=='x'){
            return endX(str.substring(1)) + 'x';
        }
        else{
            return str.charAt(0) + endX(str.substring(1));
        }
    }



    // Array-2 evenOdd
    /*
    Array-2 > evenOdd
    prev  |  next  |  chance
    Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
*
            evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
    evenOdd([3, 3, 2]) → [2, 3, 3]
    evenOdd([2, 2, 2]) → [2, 2, 2]

     */
    public static int[] evenOdd(int[] nums) {
        int[] newNums = new int[nums.length];
        int countEven =0;
        int countOdd=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                newNums[countEven]=nums[i];
                countEven++;
            }
            else{
                newNums[nums.length-1-countOdd]=nums[i];
                countOdd++;
            }
        }
        return newNums;
    }

    // count evens
    public static int countEvens(int[] nums) {
        int count=0;
        for(int i : nums){
            count = i%2==0? count+1 : count;
        }
        return count;
    }

    // bunny ears
    public static int bunnyEars2(int bunnies){
        if (bunnies < 0)throw new IllegalArgumentException();
        else if(bunnies == 0)return 0;
        else{
            return (bunnies%2==0? 3+bunnyEars2(bunnies-1):2+bunnyEars2(bunnies-1));
        }

    }

    // another method to check how many "hi"s
    private static void CountHi(String input, int number){
        if(input.contains("hi")){
            CountHi(input.replaceFirst("hi",""),number+1);
        }
        else{
            System.out.println(number);
        }
    }

    // another method to check how many "hi"s
    private static int CountHi3(String input){
        if(input.length()<2)return 0;

        if(input.substring(0,2).equals("hi")){
            return 1 + CountHi3(input.substring(2));
        }
        else {
            return CountHi3(input.substring(1));
        }
    }

    // factorial(n)
    public static int fac(int n) {
        if(n<=0)throw new IllegalArgumentException("n must be a positive integer!");
        if (n==1) return n;
        else {
            //int temp = fac(n-1);
            //temp = n*temp;
            return n*fac(n-1);
        }
    }






}
