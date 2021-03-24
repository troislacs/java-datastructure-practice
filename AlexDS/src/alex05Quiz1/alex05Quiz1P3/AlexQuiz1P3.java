package alex05Quiz1.alex05Quiz1P3;
import org.junit.Assert;

public class AlexQuiz1P3 {
    public static void main(String[] args) {
        // unit test
        try{
            CustomArray arrayTestX = new CustomArray();
            int testDataX1 = 105;
            int testDataX2 = 106;
            int[] testDataX3 = new int[]{9001,9002,9003,9004};
            int[] testExpected = new int[]{105,106,9001,9002,9003,9004};
            arrayTestX.add(testDataX1);
            arrayTestX.add(testDataX2);
            arrayTestX.addAll(testDataX3);

            for(int i=0;i<6;i++){
                Assert.assertEquals(testExpected[i],arrayTestX.get(i));
            }
            System.out.println("Testing Succeeded!");
        }
        catch(AssertionError exc){
            System.out.println(exc.getMessage());
            System.out.println("Testing failed!");
        }


        // quick test
        CustomArray arrayTest = new CustomArray();
        int testData1 = 105;
        int testData2 = 106;
        int[] testData3 = new int[]{9001,9002,9003,9004};
        arrayTest.add(testData1);
        arrayTest.add(testData2);
        arrayTest.addAll(testData3);
        System.out.println("The above is unit test result.\n\nThe following is a quick console test");
        System.out.println(arrayTest.toString());





    }
}
