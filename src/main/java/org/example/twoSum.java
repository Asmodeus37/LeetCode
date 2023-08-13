package org.example;
import java.util.*;

class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[0];
        for(int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] + nums[j] == target){
                    a[0] = i;
                    a[1] = j;
                }
        }
        return nums;
    }
}