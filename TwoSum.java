package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++){ 
            int current = nums[i]; 
            int x = target - current;
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(current, i);
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

}