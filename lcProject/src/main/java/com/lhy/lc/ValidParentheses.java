package com.lhy.lc;

import java.util.Stack;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串
// 👍 2054 👎 0

/**
 * @ClassName ValidParentheses
 * @Description 有效的括号
 * @Author lihengyu
 * @Date 2020/12/24 9:22
 * @Version 1.0
 * 解答成功:
 * 执行耗时:1 ms,击败了99.13% 的Java用户
 * 内存消耗:36.8 MB,击败了37.43% 的Java用户
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            char[] chars = s.toCharArray();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < chars.length; i++) {
                if ('('==chars[i] || '['==chars[i] || '{'==chars[i]) {
                    stack.push(chars[i]);
                }else {
                    if (stack.empty()){
                        return false;
                    }
                    char pop = stack.pop();
                    switch (chars[i]){
                        case '}':
                            if (pop == '{') {
                                break;
                            }else {
                                return false;
                            }
                        case ')':
                            if (pop == '(') {
                                break;
                            }else {
                                return false;
                            }
                        case ']':
                            if (pop == '[') {
                                break;
                            }else {
                                return false;
                            }
                        default:
                            return false;
                    }
                }
            }
            if (!stack.empty()){
                return false;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}