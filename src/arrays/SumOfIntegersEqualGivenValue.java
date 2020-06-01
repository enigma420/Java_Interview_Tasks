package arrays;

import java.util.Arrays;

public class SumOfIntegersEqualGivenValue {

    private int[] arrayOfIntegers;

    public SumOfIntegersEqualGivenValue(int[] arrayOfIntegers) {
        this.arrayOfIntegers = arrayOfIntegers;
    }

    public boolean findSumOfTwoValues(int[] arr, int val, int startIndex){
        for(int i = startIndex, j = arr.length - 1 ; i < j;){
            int sum = arr[i] + arr[j];
            if(sum == val){
                return true;
            }

            if(sum < val){
                ++i;
            }else {
                --j;
            }
        }
        return false;
    }

    public boolean findSumOfThreeValues(int[] array,int requiredSum){
        Arrays.sort(array);
        for(int i = 0 ; i < array.length-2 ; i++){
            int remainingSum = requiredSum - array[i];
            if(findSumOfTwoValues(array,remainingSum,i+1)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] arrayOfInt = {5,7,3,3,5,1,2,9,6};
        SumOfIntegersEqualGivenValue instance = new SumOfIntegersEqualGivenValue(arrayOfInt);
      boolean result = instance.findSumOfThreeValues(instance.arrayOfIntegers,18);
        System.out.println("result: " + result);
    }
}

