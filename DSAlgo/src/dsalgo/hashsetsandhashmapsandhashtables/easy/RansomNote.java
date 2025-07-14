/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.hashsetsandhashmapsandhashtables.easy;

/**
 *
 * @author Hp
 */
public class RansomNote {
    //https://leetcode.com/problems/ransom-note/

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] alphabets = new int[26];

        for (char m : magazine.toCharArray()) {
            int index = m - 'a';
            alphabets[index] += 1;
        }

        for (char r : ransomNote.toCharArray()) {
            int index = r - 'a';
            alphabets[index] -= 1;

            if (alphabets[index] < 0) {
                return false;
            }
        }

        return true;
    }
}
