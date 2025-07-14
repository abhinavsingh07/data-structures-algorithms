     package dsalgo.arrays.easy;

public class TwoSum {
    //leetcode link:https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
    //this logic is x+y=target;
    //to find x =target-y; search (target-y) use intertion on arr
    public int[] twoSum(int[] nums, int target) {
        boolean found = false;
        int i = 0;
        for (; i < nums.length; i++) {

            int diff = target - nums[i];
            int j = i + 1;
            for (; j < nums.length; j++) {

                if (diff == nums[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                return new int[]{
                    i,
                    j
                };

            }
        }
        return new int[0];
    }
}


//[1,1,2,3,3,4,4]