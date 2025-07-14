/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class ThreeSum {
    //best solution has timecomplexity o(n2)
    //2 pointer approach
    //https://leetcode.com/problems/3sum/
    //logi is first sort array then on i get triplets from j to k inside while loop sum=nums[i]+nums[j]+nums[k]==0
     public List<List<Integer>> threeSum(int[] nums) {
        //Input: nums = [-1,0,1,2,-1,-4]  sort->[-4,-1,-1,0,1,2]
        // Output: [[-1,-1,2],[-1,0,1]]
        //sort array
        Arrays.sort(nums);
        Set<List<Integer>> triplets=new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int j = i + 1;
            int k = len - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> elementsFound = new ArrayList<>();
                    elementsFound.add(nums[i]);
                    elementsFound.add(nums[j]);
                    elementsFound.add(nums[k]);
                    //to not add duplicate triplets
                    triplets.add(elementsFound);
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                }
            }

        }
        return new ArrayList<>(triplets);
    }
}
