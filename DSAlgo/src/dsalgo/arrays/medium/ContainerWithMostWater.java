/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class ContainerWithMostWater {
    //leetcode:https://leetcode.com/problems/container-with-most-water/submissions/1488979588/
    //on leetcode some memory issue is coming
    //below brute force approach is correct i validated using leetcode text case in data.txt
    //output for that test case is 4913370.

    public int maxArea(int[] height) {
        //[1,8,6,2,5,4,8,3,7]
        //brute force
//      List<Integer> areaArr = new ArrayList<>();//taking memory in leetcode as arr.length could be 10 power 5
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int smallestHeight = height[i] < height[j] ? height[i] : height[j];
                int area = smallestHeight * (j - i); //area of rectangle or square=l*b or side*side
                if (maxArea < area) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    public static void main(String args[]) {
        // Use class loader to access the file in the same package
        InputStream inputStream = ContainerWithMostWater.class.getResourceAsStream("data.txt");

        if (inputStream == null) {
            System.err.println("File not found in the same package!");
            return;
        }
        List<Integer> numbers = new ArrayList<>(); // Dynamic list to store numbers initially

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;

            // Read line by line
            while ((line = br.readLine()) != null) {
                // Split line into numbers (use regex for flexible formats)
                String[] parts = line.split("[,\\s]+"); // Split by commas or whitespace
                for (String part : parts) {
                    numbers.add(Integer.parseInt(part)); // Convert to integer and add to list
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        int arr[] = new int[5000];
        int k = 0;
        for (Integer num : numbers) {
            arr[k++] = num;
        }
        ContainerWithMostWater obj = new ContainerWithMostWater();
        System.out.println("INPUT LENGTH ::" + arr.length);
        System.out.println("MAX AREA::" + obj.maxArea(arr));
    }

}
