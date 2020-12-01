package com.lhy.lc;

import java.util.ArrayList;

/**
 * @ClassName LongestSubstringWithoutRepeatingCharacters
 * @Description lc03
 * @Author lihengyu
 * @Date 2020/12/1 14:35
 * @Version 1.0
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        System.out.println(solution.lengthOfLongestSubstring(" "));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            char[] chars = s.toCharArray();
            int maxLength = 0;

            for (int i = 0; i < chars.length; i++) {
                ArrayList<Character> charList = new ArrayList<>();
                for (int j = i; j < chars.length; j++) {
                    if (!charList.contains(chars[j])) {
                        charList.add(chars[j]);
                    }else {
                        break;
                    }
                }
                maxLength = maxLength > charList.size() ? maxLength : charList.size();
            }

            return maxLength;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}