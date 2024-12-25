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
public class SortedSquares {

    public int[] sortedSquares(int[] nums) {
        //brute force technique    
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        //bubble sort
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    //this is o(n2)
    //need to do in o(n) time.
}
