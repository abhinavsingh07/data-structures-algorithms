/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.easy.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class ContainsDuplicate {

    //use haset to determine value appears already or not
    //leetoce link:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
    public boolean containsDuplicate(int[] nums) {
        boolean found = false;
        if (nums.length > 0) {
            Set<Integer> val = new HashSet<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (!val.add(nums[i])) {
                    found = true;
                    return found;
                }
            }
        }

        return found;
    }
}
