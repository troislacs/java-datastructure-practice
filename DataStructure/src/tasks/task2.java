package tasks;

public class task2 {

    public static void main(String[] args) {
        int[][] data2D = {
                {1, 3, 6},
                {7, 1, 2, 3},
                {8, 3, 2, 1, 0, 7},
                {1, 7, 1, 9}
        };

        int[][] data2SumCross = duplicateEmptyArray2D(data2D);


        //PARTA - looking for the min of all the sumOfCross
        int min = sumOfCross(data2D, 0, 0 );
        int minCol=0, minRow = 0;
        for (int row=0; row< data2D.length; row++){
            for(int col=0; col< data2D[row].length;col++){
                int sum = sumOfCross(data2D, row, col);
                if (sum <  min){
                    min = sum;
                    minCol = col;
                    minRow = row;
                }
            }
        }

        //PARTB
        for (int row=0;row< data2D.length; row++){
            for(int col=0;col<data2D[row].length ; col++){
                data2SumCross[row][col] = sumOfCross(data2D, row, col);
            }
        }
        print2D(data2D);
        System.out.println("--------");
        print2D(data2SumCross);

        System.out.printf("the smallest cross sum is %d, for row %d and col %d", min, minRow, minCol);
    }

    static int getIfExists(int[][] data, int row, int col) {
        try{
            return data[row][col];
        }catch (ArrayIndexOutOfBoundsException ex){
            return 0;
        }
    }

    static int sumOfCross(int[][] data, int row, int col) {
        // return sum of the element at row/col
        // plus (if they exist) element above, below, to the left and right of it
        return getIfExists(data, row, col)  + getIfExists(data, row -1, col) + getIfExists(data, row, col - 1)
                +getIfExists(data, row + 1, col) + getIfExists(data, row, col+1);

    }

    // useful helper for debugging
    static void print2D(int[][] data) {
        for (int row=0; row< data.length; row++){
            for(int col=0; col< data[row].length ; col ++){
                System.out.printf("%s%d", col == 0 ? "" : ",", data[row][col]);
            }
            System.out.println();
        }
    }

    // duplicate a jagged array
    static int[][] duplicateEmptyArray2D(int[][] orig2d) {
        int[][] result = new int[orig2d.length][];
        for(int row =0; row<orig2d.length ; row++ ){
            int rowLength = orig2d[row].length;
            result[row] = new int[rowLength];
        }
        return result;
    }

}
