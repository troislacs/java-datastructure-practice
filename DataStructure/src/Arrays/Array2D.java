package Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] int2DArray = new int[3][5];

        int2DArray[2][4]= 10;
        int2DArray[0][3]= 12;

        //two loops to navigate through the elements

        int[][] arr = { { 1, 2 }, { 3, 4 }, {5, 6, 7, 8} };

//        for(int i=0;i<2; i++){
//            for (int j=0; j<2; j++){
//                System.out.print(arr[i][j] + "  ");
//            }
//        }

//        System.out.println("the size of rows are ->" + arr.length);

        for(int i=0; i< arr.length; i++){
//            System.out.println("the size of columns are ->" + arr[i].length);
            for(int j=0; j<arr[i].length; j++ ){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(arr[0][2]);
    }
}
