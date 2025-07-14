/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class Ident {

    public static int lengthOfLongestSubstring(String s) {

        // s = "pwwkew" answer 3
        //sliding window variable length concept applied
        int i = 0, subStrLength = 0;
        Set<Character> alphabets = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            alphabets.add(c);
            char nextC = ((j + 1) < s.length()) ? s.charAt(j + 1) : s.charAt(j);
            boolean isDuplicate = alphabets.add(nextC);

            if (!isDuplicate) {
                alphabets.remove(s.charAt(i));
                int length = (j - i + 1);
                if (subStrLength < length) {
                    subStrLength = length;
                }

                i++;
            }

        }
        return subStrLength;
    }

    public static void main(String args[]) {
        lengthOfLongestSubstring("pwwkew");
    }

}
