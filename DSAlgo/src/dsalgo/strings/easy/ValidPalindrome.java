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
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        //Leetcode:https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/883/   

        s = s.replaceAll("[^A-Za-z0-9]", "");//This will replace all the characters except alphanumeric    
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
