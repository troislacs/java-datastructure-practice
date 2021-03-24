package alex05Quiz1.alex05Quiz1P2;
import org.junit.Assert;

public class AlexQuiz1P2 {
    public static void main(String[] args) {
        // test
        char[] key = new char[]{'c','b','a','b'};
        char[] student1Answer = new char[]{'a','b','d','b'};
        char[] student2Answer = new char[]{'b','a','c','d'};
        char[] student3Answer = new char[]{'a','b','c','d'};
        char[][] answers = new char[][]{student1Answer,student2Answer,student3Answer};

        // quick test
        System.out.println("Results of quick test");
        printResults(answers,key);
        System.out.println("----------------");


        // Unit Test
        try{
            int[] marksExpected = new int[]{2,0,1};
            for(int i=0;i<marksExpected.length;i++){
                Assert.assertEquals(marksExpected[i],printResultsForUnitTest(answers,key)[i]);
            }
            System.out.println("Unit Testing Succeeded!");
        }
        catch(AssertionError exc){
            System.out.println("Unit Testing Failed!");
        }

    }

    public static void printResults(char[][] answers, char[] key) {
        int count;
        int[] marks = new int[answers.length];
        for(int students=0;students<answers.length;students++) {
            if(answers[students].length == key.length) {
                count = 0;
                for (int i = 0; i < answers[students].length; i++) {
                    if (answers[students][i] == key[i]) count++;

                }
                marks[students] = count;
                System.out.println("Student " + (students + 1) + " had " + marks[students] + " correct answer(s)");
            }
            else{
                throw new IllegalArgumentException("wrong size");
            }
        }
    }

    public static int[] printResultsForUnitTest(char[][] answers, char[] key) {
        int count;
        int[] marks = new int[answers.length];
        for(int students=0;students<answers.length;students++) {
            if(answers[students].length == key.length) {
                count = 0;
                for (int i = 0; i < answers[students].length; i++) {
                    if (answers[students][i] == key[i]) count++;

                }
                marks[students] = count;
                //System.out.println("Student " + (students + 1) + " had " + marks[students] + " correct answer(s)");
            }
            else{
                throw new IllegalArgumentException("wrong size");
            }
        }
        return marks;
    }
}
