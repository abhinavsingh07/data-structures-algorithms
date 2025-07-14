/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.medium;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Hp
 */
public class MaximumSumofDistinctSubarraysWithLengthK {
    //2461. Maximum Sum of Distinct Subarrays With Length K
    //https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/
    //sliding window pattern fixed size
    public long maximumSubarraySum(int[] nums, int k) {
        //Input: nums = [1,5,4,2,9,9,9], k = 3
        int i = 0;
        long maxSum = 0, sum = 0;
        Map<Integer, Integer> uniqueNos = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            updateMap(nums[j],uniqueNos);

            if (j >= k) {
                sum -= nums[i];
                removeMap(nums[i],uniqueNos);
                i++;
            }

            if ((j - i + 1) == k && uniqueNos.size() == k) {
             if (maxSum < sum) {
                 maxSum = sum;
              }
            } 
        }

        return maxSum;
    }

    public static void updateMap(int num,Map<Integer,Integer> map) {
        if (map.get(num) == null) {
            map.put(num, 1);
        } else {
            int currentCount = map.get(num) + 1;
            map.put(num, currentCount);
        }
    }

    public static void removeMap(int num,Map<Integer,Integer> map) {
        if (map.get(num) == 1) {
            map.remove(num);
        } else {
            int currentCount = map.get(num) - 1;
            map.put(num, currentCount);
        }
    }
}
