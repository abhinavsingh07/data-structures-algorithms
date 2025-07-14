/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.strings.easy;

import java.util.Arrays;

/**
 *
 * @author Hp
 */
public class ValidAnagaram {
    //https://leetcode.com/problems/valid-anagram/description/

    public boolean isAnagram(String s, String t) {

        int[] alphabetsS = new int[26];
        int[] alphabetsT = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            alphabetsS[index] += 1;
        }

        for (int j = 0; j < t.length(); j++) {
            int index = t.charAt(j) - 'a';
            alphabetsT[index] += 1;
        }

        if (Arrays.equals(alphabetsS, alphabetsT)) {
            return true;
        }

        return false;
    }
}
