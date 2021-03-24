package Arrays;

import java.util.Scanner;

public class Task1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
         int[] data;

         try{
             System.out.println("Enter the size of the array");
             int size = input.nextInt();
             if (size< 1){
                 throw new IllegalArgumentException("Error: the value must be more than 1");
             }
             data = new int[size];
             for (int i=0; i< data.length; i++){
                 data[i] = (int)(Math.random() * 100 +1);
             }
             for(int j=0; j<data.length; j++){
                 System.out.printf("%s%d", j==0 ? "" : "," , data[j]);
             }
             System.out.println();
             System.out.println("prime numbers");
             boolean isFirst= true;
             for (int i=0; i< data.length; i++){
                 //I will create a method to check if the number is prime
                 if (isPrime(data[i])){
                     System.out.printf("%s%d", isFirst ? "" : ",",data[i]);
                     isFirst = false;
                 }
             }
         }
         catch(IllegalArgumentException exc){
             System.out.println(exc.getMessage());
         }
    }

    private static boolean isPrime(int number){

        for (int i=2;i<= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        if (number < 2){
            return false;
        }
        return true;
    }
}

