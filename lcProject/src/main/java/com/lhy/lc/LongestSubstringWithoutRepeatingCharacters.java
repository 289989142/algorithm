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

    /**
     解答成功:
     执行耗时:853 ms,击败了5.01% 的Java用户
     内存消耗:38.9 MB,击败了57.09% 的Java用户
    **/
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
}