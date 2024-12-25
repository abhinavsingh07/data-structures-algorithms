/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.easy.arrays;

/**
 *
 * @author Hp
 */
public class TwoSumArraySorted {

    //leetcode:https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
    public int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};

            } else if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            }
        }
        return new int[0];
    }
}
