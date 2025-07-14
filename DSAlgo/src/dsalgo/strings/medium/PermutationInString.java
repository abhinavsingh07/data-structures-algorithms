/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.strings.medium;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        //https://leetcode.com/problems/permutation-in-string/ 
        //fixed size sliding window
        int[] sOneAlphabets = new int[26];
        int[] sTwoAlphabets = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            //minus from a
            int index = c - 'a';
            sOneAlphabets[index] += 1;
        }

        // s2 = "eidbaooo"
        int k = s1.length(), left = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            int index = c - 'a';
            if (i >= k) {
                int index2 = s2.charAt(left) - 'a';
                sTwoAlphabets[index2] -= 1;
                left++;
            }

            sTwoAlphabets[index] += 1;

            if (Arrays.equals(sOneAlphabets, sTwoAlphabets)) {
                return true;
            }

        }
        return false;
    }
}
