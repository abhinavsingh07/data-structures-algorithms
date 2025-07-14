/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.strings.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hp
 */
public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {
        //Sliding window technique
        //https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
        //Input: s = "cbaebabacd", p = "abc"
        //Output: [0,6]
        List<Integer> idxList = new ArrayList<>();
        int[] alphabetsP = new int[26];
        int[] alphabetsS = new int[26];
        int k = p.length();

        for (int i = 0; i < k; i++) {
            int index = p.charAt(i) - 'a';
            alphabetsP[index] += 1;
        }

        int left = 0;
        for (int j = 0; j < s.length(); j++) {
            int index = s.charAt(j) - 'a';
            alphabetsS[index] += 1;

            if (j >= k) {
                int idx = s.charAt(left++) - 'a';
                alphabetsS[idx] -= 1;
            }
            if (Arrays.equals(alphabetsP, alphabetsS)) {
                idxList.add(j - k + 1);
            }
        }

        return idxList;
    }
}
