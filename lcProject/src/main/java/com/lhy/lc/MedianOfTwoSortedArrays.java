package com.lhy.lc;

/**
 * @ClassName MedianOfTwoSortedArrays
 * @Description lc04
 * @Author lihengyu
 * @Date 2020/12/1 17:07
 * @Version 1.0
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int i = 0;
            int j = 0;
            int k = 0;
            int[] nums3 = new int[nums1.length+nums2.length];
            while (i < nums1.length || j < nums2.length) {
                if (i < nums1.length && j >= nums2.length) {
                    //nums1还有数
                    nums3[k++]  = nums1[i++];
                }else if (i >= nums1.length && j < nums2.length) {
                    //nums2还有数
                    nums3[k++]  = nums2[j++];
                }else {
                    //两个都有数
                    if (nums1[i] < nums2[j]) {
                        nums3[k++] = nums1[i++];
                    }else {
                        nums3[k++] = nums2[j++];
                    }
                }
            }

/*            for (int l = 0; l < nums3.length; l++) {
                System.out.println(nums3[l]);
            }*/
            if (nums3.length % 2 == 0){
                int i1 = (int) Math.floor(nums3.length / 2);
                int n = nums3[i1] + nums3[i1-1];
                return (double)n / 2;
            }else {
                return nums3[nums3.length/2];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}