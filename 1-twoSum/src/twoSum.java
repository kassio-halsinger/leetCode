package twoSum;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5};
        int target1 = 0;
        int[] output = twoSum(nums,target1);
        System.out.println(output);
    }

    /*
     * Given an array of integers nums and an integer target, 
     * return indices of the two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, 
     * and you may not use the same element twice.
     * 
     * You can return the answer in any order.
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap<Integer,Integer>();
        int[] solution = new int[2];

        map.put(target - nums[0],0);
        
        for (int i = 1; i < nums.length; i++){
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                solution[0] = (int) map.get(difference);
                solution[1] = i;
                return solution;
            }
            else {
                map.put(difference, i);
            }
        }
        return solution;
    }
}
