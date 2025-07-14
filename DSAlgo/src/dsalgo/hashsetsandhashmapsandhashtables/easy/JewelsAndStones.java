/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.hashsetsandhashmapsandhashtables.easy;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class JewelsAndStones {

    //https://leetcode.com/problems/jewels-and-stones/
    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> jset = new HashSet<>();
        int totalJewels = 0;
        for (char jewel : jewels.toCharArray()) {
            jset.add(jewel);
        }

        for (char stone : stones.toCharArray()) {
            if (jset.contains(stone)) {
                totalJewels += 1;
            }
        }

        return totalJewels;

    }
}
