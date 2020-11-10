package com.lhy.lc;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author HASEE
 */
public class CountAndSay {
    public static void main(String[] args) {
        Solution solution = new CountAndSay().new Solution();
        solution.countAndSay(4);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String countAndSay(int n) {
            if (n==1) {
                return  "1" ;
            };
            int[] nums = {1};
            for (int i = 0; i < n-1; i++) {
                nums = count(nums);
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < nums.length; i++) {
                sb.append(nums[i]);
            }
            return sb.toString();
        }
        private int[] count(int[] nums){

            int currentNum = nums[0];
            int count = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == currentNum){
                    count++;
                }else {
                    arr.add(count);
                    arr.add(currentNum);

                    if (i<nums.length){
                        count = 1;
                        currentNum = nums[i];
                    }
                }
            }
            arr.add(count);
            arr.add(currentNum);
            return arr.stream().mapToInt(Integer::intValue).toArray();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}