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
public class ReverseStringInPlace {

    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;

        while (i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }

    //utilised 2 pointer technique
}
