/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.strings.medium;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class LongestSubstringWithoutRepeatingCharacters {

    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    //variable length sliding window
    public int lengthOfLongestSubstring(String s) {
        int i = 0, subStrLength = 0;
        Set<Character> alphabets = new HashSet<>();

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            // If duplicate is found, move left pointer `i` and remove characters from the set
            while (alphabets.contains(c)) {
                alphabets.remove(s.charAt(i));
                i++;
            }

            alphabets.add(c);
            subStrLength = Math.max(subStrLength, j - i + 1);
        }

        return subStrLength;
    }
}
