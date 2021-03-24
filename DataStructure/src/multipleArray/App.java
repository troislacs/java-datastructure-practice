package multipleArray;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] data;

        try {
            System.out.println("To enter the height and width of array");
            int height = scanner.nextInt();
            int width = scanner.nextInt();

            if (width < 1 || height < 1) {
                throw new IllegalArgumentException("The size needs to be more than 1");
            }
            data = new int[width][height];

            //give randome numbers to the array
            for(int row=0 ; row< data.length; row++){
                for(int col=0; col<data[row].length; col++){
                    data[row][col] = -99 +(int)(Math.random() * 199);
                }
            }

            //print array
            for(int row=0 ; row< data.length; row++){
                for(int col=0; col<data[row].length; col++){
                    System.out.printf("%s%4d", col==0 ? "" : ",", data[row][col]);
                }
                System.out.println();
            }

            printSumNumbers(data);
            printSumRows(data);
            printSumColumn(data);
            stdDeviation(data);
            findPrimeNumbers(data);
        }
        catch(IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }
    }

    private static void printSumNumbers(int[][] data){

        System.out.println("Sum of all the numbers is => " + sumArray(data));
    }

    private static void printSumRows(int[][] data){
        for (int row =0; row< data.length; row++){
            int sum = 0;
            for(int col = 0 ; col< data[row].length; col++){
                sum += data[row][col];
            }
            System.out.printf("the sum of row %d is : %d",row +1,  sum);
            System.out.println();
        }
    }

    private static double sumArray(int[][] data){
        int sum = 0;
        for(int row=0 ; row< data.length; row++){
            for(int col=0; col<data[row].length; col++){
                sum += data[row][col];
            }
        }
        return sum;
    }

    private static void printSumColumn(int[][] data){
        for (int col =0; col< data[0].length; col++){
            int sum = 0;
            for(int row = 0 ; row< data.length; row++){
                sum += data[row][col];
            }
            System.out.printf("the sum of column %d is : %d",col +1,  sum);
            System.out.println();
        }
    }

    private static void stdDeviation(int[][] data){
        double sum=0;
        double avg = sumArray(data) / (double) (data.length * data[0].length);
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                sum += Math.pow(data[row][col] - avg, 2);
            }
        }
        double v = sum / (data.length * data[0].length);
        double std = Math.sqrt(v);
        System.out.printf("std is %.3f \n", std);
    }

    public static boolean isPrime(int val) {
        if (val <= 1) return false;
        for (int i = 2; i <= val / 2; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void findPrimeNumbers(int[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {

                for (int row2 = row; row2 < data.length; row2++) {
                    for (int col2 = col; col2 < data[row2].length; col2++) {
                        if (row2 == row && col2 <= col) {
                            continue;
                        }
                        int val = data[row][col] + data[row2][col2];
                        if (isPrime(val)) {
                            System.out.printf("Prime sum %d of [%d,%d]+[%d,%d]\n", val, row, col, row2, col2);
                        }
                    }
                }
            }
        }


//        System.out.printf("\n%5s%5s%13s", "#1", "#2", "Sum(Prime)");
//        System.out.println("\n-------------------------");
//        for (int i = 0; i < data.length * data[0].length; i++) {
//            for (int j = i + 1; j < data.length * data[0].length; j++) {
//                int number1, r1, c1, number2, r2, c2; // index for number#1 number#2
//                r1 = (int) (i / data[0].length);
//                c1 = i - r1 * data[0].length;
//                number1 = data[r1][c1];
//
//                r2 = (int) (j / data[0].length);
//                c2 = j - r2 * data[0].length;
//                number2 = data[r2][c2];
//
//                int sumOfPair = number1 + number2;
//                if (isPrime(sumOfPair)) {
//                    System.out.printf("%5d%5d%12d\n", number1, number2, sumOfPair);
//                }
//            }
//        }
    }
}
