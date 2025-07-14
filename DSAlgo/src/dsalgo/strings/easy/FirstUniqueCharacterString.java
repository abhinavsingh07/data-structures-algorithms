/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.strings.easy;

/**
 *
 * @author Hp
 */
public class FirstUniqueCharacterString {

    //leetode:https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/
    public int firstUniqChar(String s) {

        for (char c : s.toCharArray()) {
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);

            if (firstIndex == lastIndex) {
                return firstIndex;
            }

        }

        return -1;
    }
    
    //using alphabets length array
    public int firstUniqCharOtherApproach(String s) {

        int[] alphabetsArr = new int[26];
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            alphabetsArr[index] += 1;
        }

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            if (alphabetsArr[index] == 1) {
                return s.indexOf(ch);
            }
        }

        return -1;
    }
}
