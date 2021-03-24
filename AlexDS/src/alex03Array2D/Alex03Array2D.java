package alex03Array2D;
import java.util.Scanner;
import java.lang.Math;

public class Alex03Array2D {
    /*
    Day01TwoDimArrays
    Ask user for width and height of an array.
    Values must be numerical, 1 or greater.
    If not display an error message and end the program.
    Allocate two-dimensional array of integers of given width and height.
    Generate random values from -99 to 99 and assign to each cell of the array.
    Display the array to the user in a user-friendly manner, where columns have all the same width (commas align). Example:
            -99,  2  ,  22
            15, -71,  5
    Compute and display:
        1) Sum of all numbers in the array
        2) Sum of each of the row of the array
        3) Sum of each of the column of the array
        4) Standard deviation of all numbers in the array (google it !!!)
        5) Find pairs of numbers in the array whose sum is a prime number and display those pairs and their sum.
           (assume that negative number is not a prime number)
     */
    public static void main(String[] args) {
        Test2DArray();
    }

    private static void Test2DArray()
    {
        try{
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter height i (integer)");
            int sizeH = scan.nextInt();
            if (sizeH < 1)throw new IllegalArgumentException();

            System.out.println("Enter width j (integer)");
            int sizeW = scan.nextInt();
            if (sizeW < 1)throw new IllegalArgumentException();

            int[][] arr2d = new int[sizeH][sizeW];

            int[] sumRow = new int[sizeH];
            int[] sumColumn = new int[sizeW];
            int total=0;
            float sDev;
            float sDevE2=0;



            // Assign random -99 to 99 to array elements

            System.out.println("Original Data is as following");

            for(int i=0;i<sizeH;i++){
                sumRow[i]=0;
                for(int j=0;j<sizeW;j++){
                    arr2d[i][j] = (int)(Math.random()*199)-99;
                    System.out.printf("%d%s",arr2d[i][j],(j==(sizeW-1)?"":", "));
                    sumRow[i]+=arr2d[i][j];
                }
                total += sumColumn[i];
                System.out.println("\n");
            }



            float average = ((float)total)/((float)(sizeH*sizeW));

            // Another rotation, j rotate first, i second

            for(int j=0;j<sizeW;j++){
                sumColumn[j]=0;
                for(int i=0;i<sizeH;i++){
                    sumColumn[j]+=arr2d[i][j];
                    sDevE2 += (float)(arr2d[i][j]-average)*(arr2d[i][j]-average)/(sizeH*sizeW-1);
                }

            }


            sDev = (float)Math.sqrt(sDevE2);

            System.out.println("Sum Prime rows:");
            System.out.println("===================");
            for(int i=0;i<sizeH;i++){
                if(isPrime(sumRow[i])){
                    for(int j=0;j<sizeW;j++){
                        System.out.print(arr2d[i][j]+",");
                    }
                    System.out.println("\n");
                    System.out.println("Total Sum is: " + sumRow[i]);
                }
            }

            System.out.println("===================");

            for(int i=0;i<sizeH;i++){
                System.out.println("Sum of Row " + i + " is: " + sumRow[i]);
            }

            for(int i=0;i<sizeW;i++){
                System.out.println("Sum of Column " + i + " is: " + sumColumn[i]);
            }

            System.out.println("The Standard Deviation of all numbers is: " + sDev);

        }
        catch(Exception exc){
            System.out.println("\nData Entry Error\n");
        }


    }
    private static boolean isPrime(int number){
        if(number<=1)return false;
        else if(number<=3)return true;
        else{
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0)return false;
            }
            return true;
        }
    }
}

