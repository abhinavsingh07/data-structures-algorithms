/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.stacks.easy;

import java.util.Stack;

/**
 *
 * @author Hp
 */
public class ValidParenthesis {

    public boolean isValid(String s) {
        //https://leetcode.com/problems/valid-parentheses/submissions/1655515566/
        Stack<String> parenthesis = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                parenthesis.push(String.valueOf(c));
            } else if (!parenthesis.isEmpty()) {
                if (c == ')' && !parenthesis.pop().equals("(")) {
                    return false;
                }
                if (c == '}' && !parenthesis.pop().equals("{")) {
                    return false;
                }
                if (c == ']' && !parenthesis.pop().equals("[")) {
                    return false;
                }

            } else {
                return false;
            }
        }

        if (parenthesis.size() > 0) {
            return false;
        }

        return true;
    }
}
