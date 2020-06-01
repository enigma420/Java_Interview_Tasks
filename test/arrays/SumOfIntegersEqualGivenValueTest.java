package arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfIntegersEqualGivenValueTest {

    @Test
    public void checkIfSumOfRandomThreeValuesFromArrayThenReturnTrue() {
        int firstDesiredValue = 18;
        int secondDesiredValue = 15;
        int thirdDesiredValue = 22;
        int[] testArray = {5, 7, 6, 9, 1, 3, 2, 5, 3};
        SumOfIntegersEqualGivenValue instace = new SumOfIntegersEqualGivenValue(testArray);

        assertTrue(instace.findSumOfThreeValues(testArray, firstDesiredValue));
        assertTrue(instace.findSumOfThreeValues(testArray, secondDesiredValue));
        assertTrue(instace.findSumOfThreeValues(testArray, thirdDesiredValue));
    }

    @Test
    public void checkIfSumOfRandomThreeValuesFromArrayThenReturnFalse() {
        int firstDesiredValue = 5;
        int secondDesiredValue = 23;
        int[] testArray = {5, 7, 6, 9, 1, 3, 2, 5, 3};
        SumOfIntegersEqualGivenValue instace = new SumOfIntegersEqualGivenValue(testArray);

        assertFalse(instace.findSumOfThreeValues(testArray, firstDesiredValue));
        assertFalse(instace.findSumOfThreeValues(testArray, secondDesiredValue));
    }

    @Test
    public void checkIfArrayDontHaveThreeValuesThenReturnFalse() {
        int firstDesiredValue = 5;
        int secondDesiredValue = 23;
        int[] testArray = {5, 7};
        SumOfIntegersEqualGivenValue instace = new SumOfIntegersEqualGivenValue(testArray);

        assertFalse(instace.findSumOfThreeValues(testArray, firstDesiredValue));
        assertFalse(instace.findSumOfThreeValues(testArray, secondDesiredValue));
    }

    @Test
    public void checkIfArrayIsEmptyThenReturnFalse() {
        int firstDesiredValue = 5;
        int secondDesiredValue = 23;
        int[] testArray = {};
        SumOfIntegersEqualGivenValue instace = new SumOfIntegersEqualGivenValue(testArray);

        assertFalse(instace.findSumOfThreeValues(testArray, firstDesiredValue));
        assertFalse(instace.findSumOfThreeValues(testArray, secondDesiredValue));
    }


}