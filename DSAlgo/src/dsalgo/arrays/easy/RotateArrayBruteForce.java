/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.easy;

/**
 *
 * @author Hp
 */
public class RotateArrayBruteForce {
//Constraints:
//1 <= nums.length <= 105
//-231 <= nums[i] <= 231 - 1
//0 <= k <= 105
//leetcode:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
    public void rotate(int[] nums, int k) {
        if (k < 0) {
            return;
        }
        //brute force method for large input taking time so need to solve in o(n)
        // k=3
        // nums = [1,2,3,4,5,6,7]
        // Output: [5,6,7,1,2,3,4]
        // rotate 1 steps to the right: [7,1,2,3,4,5,6]
        // rotate 2 steps to the right: [6,7,1,2,3,4,5]
        // rotate 3 steps to the right: [5,6,7,1,2,3,4]

        int j = nums.length - 1;

        while (k > 0) {
            int lastelm = nums[j];
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i > 0) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[0] = lastelm;
                }

            }
            k--;
        }

    }

    //testase 
    //[2,3,1,4,5,6,2,1]
    // 2
    //output: [2,1,2,3,1,4,5,6] expected:[2,1,2,3,1,4,5,6]
}
