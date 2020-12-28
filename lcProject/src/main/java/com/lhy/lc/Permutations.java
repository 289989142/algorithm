package com.lhy.lc;

import java.util.LinkedList;
import java.util.List;
//给定一个 没有重复 数字的序列，返回其所有可能的全排列。
//46
// 示例:
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
// Related Topics 回溯算法
// 👍 1055 👎 0

/**
 * @ClassName Permutations
 * @Description lc46 回溯算法
 * @Author lihengyu
 * @Date 2020/12/28 16:41
 * @Version 1.0
 * 解答成功:
 * 执行耗时:3 ms,击败了30.12% 的Java用户
 * 内存消耗:38.8 MB,击败了53.22% 的Java用户
 */
public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
        solution.permute(new int[]{1, 2, 3});
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();

        public List<List<Integer>> permute(int[] nums) {
            List<Integer> track = new LinkedList<>();
            backtrack(nums,track);
            return res;
        }
        public void backtrack(int[] nums,List<Integer> track){
            if (track.size() == nums.length){
                res.add(new LinkedList<>(track));
                return;
            }
            for (int num : nums) {
                if (track.contains(num)) {
                    continue;
                }
                track.add(num);

                backtrack(nums, track);

                track.remove(track.size()-1);
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}
/*
回溯框架
result = []
def backtrack(路径, 选择列表):
    if 满足结束条件:
        result.add(路径)
        return

    for 选择 in 选择列表:
        做选择
        backtrack(路径, 选择列表)
        撤销选择
*  */
