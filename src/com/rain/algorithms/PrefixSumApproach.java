package com.rain.algorithms;

public class PrefixSumApproach implements BaseMethod {


    @Override
    public int trap(int[] height) {
        int total = 0;
        int n = height.length;
        int left[] = new int[n];
        left[0] = 0;
        int right[] = new int[n];
        right[n-1] = 0;
        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1], height[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], height[i+1]);
        }
        for(int i=1; i<n-1; i++){
            int sum = (Math.min(left[i], right[i])-height[i]);
            if(sum>0)
                total+=sum;
        }
        return total;
    }
}
