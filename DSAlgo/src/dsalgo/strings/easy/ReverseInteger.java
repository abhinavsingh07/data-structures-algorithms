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
public class ReverseInteger {

    public int reverse(int x) {

        int revnum = 0;
        boolean foundNeg = false;
        //handle -ve number
        if (x < 0) {
            foundNeg = true;
            x *= -1;
        }
        //x= 123
        while (x > 0) {
            int digit = x % 10;
            x = x / 10;
            // Check for overflow before pushing the digit
            //The last digit of Integer.MAX_VALUE is 7
            if (revnum > Integer.MAX_VALUE / 10 || (revnum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            //The last digit of Integer.MIN_VALUE is 8
            if (revnum < Integer.MIN_VALUE / 10 || (revnum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
            revnum = (revnum * 10) + digit;
        }

        if (foundNeg) {
            revnum *= -1;
        }

        return revnum;
    }
}
