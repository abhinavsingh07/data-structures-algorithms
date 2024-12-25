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
public class SortedSquaresON {

    public int[] sortedSquares(int[] nums) {
        //leetcode :https://leetcode.com/problems/squares-of-a-sorted-array/submissions/1487944233
        int[] sortedNums = new int[nums.length];
        int i = 0, j = nums.length - 1, k = sortedNums.length - 1;

        while (i <= j) {
            int sorted = 0;
            if ((nums[i] * nums[i]) > (nums[j] * nums[j])) {
                sorted = nums[i] * nums[i];
                i++;
            } else {
                sorted = nums[j] * nums[j];
                j--;
            }
            sortedNums[k--] = sorted;
        }

        return sortedNums;
    }
    
    //time complexity o(N)
}
