package alex05Quiz1.alex05Quiz1P1;

import org.junit.Assert;

public class AlexQuiz1Test {
    public static void main(String[] args) {

        try {
            String testString1 = "program";
            String testExpected1 = "p#r#o#g#r#a#m";
            String testString2 = "abc";
            String testExpected2 = "a#b#c";
            String testString3 = "ab";
            String testExpected3 = "a#b";
            Assert.assertEquals(testExpected1,addSharp(testString1));
            Assert.assertEquals(testExpected2,addSharp(testString2));
            Assert.assertEquals(testExpected3,addSharp(testString3));
            System.out.println("\nCongratulations! All tests Succeeded!");
        }
        catch(AssertionError exc){
            System.out.println("\nOne of the Testing Failed");
            System.out.println(exc.getMessage());
        }

    }

    public static String addSharp(String input){
        if(input.length()==1)return input;
        else {
            return input.charAt(0) + "#" + addSharp(input.substring(1));
        }

    }

}
