/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsalgo.arrays.easy;

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
public class findMaxAverageSlidingWindow {

    //leetocde:https://leetcode.com/problems/maximum-average-subarray-i/
    //Accepted
    //Used sliding window pattern but not efficient approach 
    public double findMaxAverage(int[] nums, int k) {
        if (k < 0) {
            return 0.00;
        }
        int i = 0, j = k - 1;
        double average = -Double.MAX_VALUE;
        while (i > -1 && j < nums.length) {
            int sum = 0;
            for (int loop = i; loop <= j; loop++) {
                sum += nums[loop];
            }
            double calcAverage = (sum * 1.0) / k;
            if (average < calcAverage) {
                average = calcAverage;
            }
            i++;
            j++;
        }

        return average;
    }

    //O(N) time and O(1) Space
    public double findMaxAverageEfficientSlidingWindow(int[] nums, int k) {
        if (k < 0) {
            return 0.00;
        }
        int sum = 0;
        //calculate sum upto k elements
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        int maxSum = sum;
        //use sliding window pattern
        int left = 0, right = k;
        while (right < nums.length) {
            //add right
            sum = sum + nums[right++];

            //Subtract left
            sum = sum - nums[left++];
            maxSum = Math.max(sum, maxSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String args[]) {
        // Use class loader to access the file in the same package
        InputStream inputStream = findMaxAverageSlidingWindow.class.getResourceAsStream("data.txt");

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

        int arr[] = new int[87];
        int k = 0;
        for (Integer num : numbers) {
            arr[k++] = num;
        }
        findMaxAverageSlidingWindow obj = new findMaxAverageSlidingWindow();
        System.out.println("INPUT LENGTH ::" + arr.length);
        System.out.println("MAX Average::" + Float.MIN_VALUE);
    }
}
