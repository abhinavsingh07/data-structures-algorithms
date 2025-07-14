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
public class RotateArrayOptimised {

    public void rotate(int[] nums, int k) {
        if (k < 0 || nums.length == 1) {
            return;
        }

        // k=3
        // nums = [1,2,3,4,5,6,7]
        // Output: [5,6,7,1,2,3,4]
        // rotate 1 steps to the right: [7,1,2,3,4,5,6]
        // rotate 2 steps to the right: [6,7,1,2,3,4,5]
        // rotate 3 steps to the right: [5,6,7,1,2,3,4]
        int[] finalArr = new int[nums.length];
        int count = 0, i = 0, j = nums.length - k;

        if (j > 0) {
            while (j < nums.length) {
                finalArr[count++] = nums[j++];
            }

            j = nums.length - k;
            while (i < j) {
                finalArr[count++] = nums[i++];
            }

            for (int l = 0; l < finalArr.length; l++) {
                nums[l] = finalArr[l];
            }
        }
            //check later

    }

    public static void main(String args[]) {
        RotateArrayOptimised cc = new RotateArrayOptimised();
        cc.rotate(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3);
    }

}
