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
public class RemoveDublicatesSorted {
    //Leetcode link:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
    //logic :Essentially, once an element is encountered, you simply need to bypass its duplicates and move on to the next unique element.
    //isme next elmemt same milta h to j++. if different milta h then i++ then nums[i]=nums[j];
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i += 1;
                nums[i] = nums[j];
            }
        }
        return (i + 1);
    }
}
