package com.cynor;

public class Main {

    public static void main(String[] args) {
        int[] inputData = new int[] {5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        int targetSize = 15;
        System.out.println("minimum " + findMinimumNumbersRequired(inputData, targetSize));
    }

    static int findMinimumNumbersRequired(int[] inputData, int targetSize) {
        int minimumNumsOfRequired = Integer.MAX_VALUE;

        int left =0, sum=0;

        for(int right=0; right < inputData.length; right++) {
            sum += inputData[right];

            while(sum >= targetSize) {
                minimumNumsOfRequired = Math.min(minimumNumsOfRequired, right - left + 1);
                sum -= inputData[left++];
            }
        }
        return minimumNumsOfRequired;
    }
}
