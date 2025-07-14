/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class ContainerWithMostWaterTwoPointer {

    public int maxArea(int[] height) {
        //[1,8,6,2,5,4,8,3,7]
        int i = 0, j = height.length - 1, maxArea = 0;
        while (i < j) {
            int smallest = 0;
            if (height[i] <= height[j]) {
                smallest = height[i];
                i++;
            } else if (height[j] <= height[i]) {
                smallest = height[j];
                j--;
            }
            int area = smallest * (j - i);
            if (maxArea < area) {
                maxArea = area;
            }
        }

        return maxArea;
    }

}
