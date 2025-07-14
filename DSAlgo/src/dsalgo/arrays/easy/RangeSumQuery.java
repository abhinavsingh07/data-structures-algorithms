/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class RangeSumQuery {

    //https://leetcode.com/problems/range-sum-query-immutable/description/
    //prefix sum technique used
    private List<Integer> prefixSum = new ArrayList<>();

    public RangeSumQuery(int[] nums) {
        int total = nums[0];
        prefixSum.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            total += nums[i];
            prefixSum.add(total);
        }
    }

    public int sumRange(int left, int right) {
        //sum(l,r)=prefix[r]- prefix[l-1]
        //if left 0 =sum =prefix[r]
        if (left == 0) {
            return prefixSum.get(right);
        }

        return prefixSum.get(right) - prefixSum.get(left - 1);

    }
    /**
     * Your NumArray object will be instantiated and called as such: NumArray
     * obj = new NumArray(nums); int param_1 = obj.sumRange(left,right);
     */

}
