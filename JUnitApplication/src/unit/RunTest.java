package unit;

import org.junit.Assert;

import org.junit.Test;

public class RunTest {
    @Test // check if findBig() returns correct results
    public void runFindBig() {
        // assertEquals checks if the first argument is equal to the second argument
        Assert.assertEquals(200, Calculator.findBig(100, 200));
    }

    @Test // check if findSmall() returns correct results
    public void runFindSmall() {
        Assert.assertEquals(10, Calculator.findSmall(10, 20));
    }

    @Test // check if findBiggest() returns correct results
    public void runFindBiggest() {
        int[] intArray = {10, 5, -5, 1, 50, 3000, -10};
        Assert.assertEquals(3000, Calculator.findBiggest(intArray));
    }
}
     