package tests;

import org.junit.Assert;
import org.junit.Test;
import recursion.App;

public class RecursionTest {

    @Test
    public void testChangeXY(){
        String output1 = App.changeXY("CCCCxRxY");
        Assert.assertEquals("CCCCyRyY", output1);

        String output2 = App.changeXY("tttxcxc");
        Assert.assertEquals("tttycyc", output2 );
    }

    @Test
    public void testCountOfHi(){
        int result = App.countOfHi("hihihih");
        Assert.assertEquals(3, result);
    }

    @Test
    public void testPow(){
        int result = App.pow(2, 3);
        Assert.assertEquals(8, result);
    }
}
