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
public class MoverZeroesRight {

    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] != 0) {
                i++;
            }

            if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;

            }

        }
       //tow pointer technique used
       //Leetode:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
    }
}
