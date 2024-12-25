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
public class SingleNumber {

    //leetcode link:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
    static public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String args[]) {
        int singleno = singleNumber(new int[]{1, 1, 2, 3, 3});
        String s="A man, a plan, a canal: Panama";
        
        System.out.print(s.replaceAll("[^A-Za-z0-9]",""));
    }

    //logic explanation
    //If we XOR all the numbers in the array:
    //1. Numbers that appear twice will cancel each other out because (a xor a)=0;
    //2. The number that appears once will remain because (0 xor x)=x.
}
