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
public class ContnuousSubArraySum {

    public boolean checkSubarraySum(int[] nums, int k) {
        //https://leetcode.com/problems/continuous-subarray-sum/
        //nums = [23,2,4,6,7], k = 6
        //(a-b)%k==0 =>a%k==b%k
        Map<Integer, Integer> map = new HashMap();
        map.put(0, -1); //imp step
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum = totalSum + nums[i];
            int remainder = totalSum % k; //its remiander present in hashmap means found b as a%k==b%k

            if (map.get(remainder) == null) {
                map.put(remainder, i);
            } else {
                int index = map.get(remainder);
                int indexDiff = i - index;
                if (indexDiff >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
