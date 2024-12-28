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
