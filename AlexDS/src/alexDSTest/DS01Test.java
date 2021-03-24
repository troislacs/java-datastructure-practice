package alexDSTest;

import alex01Array.Alex01Array;
import org.junit.Assert;
import org.junit.Test;

public class DS01Test {
    public static void main(String[] args) {
        try {
            alex01ArrayIsPrime();
            System.out.println("Tests All Pass!");
        }
        catch(AssertionError exc){
            System.out.println(exc.getMessage());
            System.out.println("\nTests Fail!");
        }
    }
    @Test
    public static void alex01ArrayIsPrime(){
        boolean output1 = Alex01Array.isPrime(29);
        Assert.assertEquals(true,output1);

        boolean output2 = Alex01Array.isPrime(144);
        Assert.assertEquals(false,output2);
    }

}
