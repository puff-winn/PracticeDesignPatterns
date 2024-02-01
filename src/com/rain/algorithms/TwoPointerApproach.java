package com.rain.algorithms;

public class TwoPointerApproach implements BaseMethod{
    @Override
    public int trap(int[] height) {
        int total = 0;
        int leftMax = 0, rightMax = 0;
        int l=0, r=height.length-1;
        while(l<=r){
            if(leftMax<=rightMax){
                total+=(Math.max(leftMax-height[l], 0));
                leftMax = Math.max(leftMax, height[l]);
                l++;
            } else {
                total+=(Math.max(0, rightMax-height[r]));
                rightMax = Math.max(rightMax, height[r]);
                r--;
            }
        }
        return total;
    }
}
