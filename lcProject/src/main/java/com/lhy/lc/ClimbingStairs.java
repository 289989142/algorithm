package com.lhy.lc;

import java.util.HashMap;

/**
 * @ClassName ClimbingStairs
 * @Description 爬楼梯 动态规划
 * @Author lihengyu
 * @Date 2020/12/2 16:39
 * @Version 1.0
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
    }


    //动态规划  执行耗时:0 ms,击败了100.00% 的Java用户 内存消耗:35.3 MB,击败了68.30% 的Java用户
       class Solution {
        public int climbStairs(int n) {
            return cacheClimStairs(n,new HashMap<Integer,Integer>(n));
        }
        private int cacheClimStairs(int n , HashMap map) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            int a = 1;
            int b = 2;
            int temp = 0;

            for (int i = 3; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return temp;
        }
    }


   //备忘录  超时
    class Solution1 {
        public int climbStairs(int n) {
            return cacheClimStairs(n,new HashMap<Integer,Integer>(n));
        }
        private int cacheClimStairs(int n , HashMap map) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            if (map.containsKey(n)){
                return (int) map.get(n);
            }else {
                int cache = climbStairs(n-1) + climbStairs(n-2);
                map.put(n,cache);
                return cache;
            }
        }
    }


    //递归   运行失败: Time Limit Exceeded 测试用例:45 stdout:
    class Solution2 {
        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}