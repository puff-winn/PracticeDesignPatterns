package com.rain.algorithms;

public class BruteForce implements BaseMethod {

    @Override
    public int trap(int[] height){
        int total = 0;
        int n = height.length;
        for(int i=1; i<n-1; i++){
            int leftHigh = height[i], rightHigh=height[i];
            int l=i-1, h=i+1;
            for(; l>=0; l--){
                if(height[l]>leftHigh){
                    leftHigh=height[l];
                }
            }
            for(; h<n; h++){
                if(height[h]>rightHigh){
                    rightHigh=height[h];
                }
            }
            if(leftHigh!=height[i] && rightHigh!=height[i]){
                total+=(Math.min(rightHigh, leftHigh)-height[i]);
            }
        }
        return total;
    }
}
