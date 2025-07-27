import java.util.*;

public class leet_code_problems {
    public static void main(String[] args) {
        leet_code_problems tester = new leet_code_problems();
//        int[] test = {2,7,11,15};
//        tester.optimizedTwoSum(test, 9);

    }


    // 1. Two Sum

    /*
    Given an array of int nums, and an int target, return the indices of the two nums
    that add up to the given target integer.

    assume there is exactly one sol and you cannot use the same element twice.
     */

    public int[] twoSum(int [] nums, int target) {
        /*
        Example 1:
        in : nums = [2,7,11,15], tareget = 9
        out : [0,1] nums[0] = 2 + nums [1] = 7, 7 + 2 = 9
         */
        //int[] solution = new int[2];

        for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                int scan = nums[i] + nums[j];
                if(scan == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

    public int[] optimizedTwoSum(int [] nums, int target){
        /*
        A typical follow-up especially on LeetCode would be is there a way to optimize
        two sum to have a time complexity that is less than O(n^2)?
        Yes, this approach stores each number and it's index to a HashMap data struc
         */

        HashMap<Integer, Integer> map = new HashMap<>(); // init HashMap
        //stores its value, and the index

        // going through 2,7,11,15 with a target of 9.

        for(int i = 0; i < nums.length; i++){
            // complement = 9 - 2. complement = 7.
            int complement = target - nums[i];
            // is the num 7 in my map ?
            if(map.containsKey((complement))){
                return new int[]{map.get(complement), i};
            }
            //adds the number numns[i] at index i into hashmap
            map.put(nums[i],i);
        }

        return new int[0];
    }


}
