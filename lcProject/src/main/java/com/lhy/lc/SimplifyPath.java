package com.lhy.lc;

//以 Unix 风格给出一个文件的绝对路径，你需要简化它。或者换句话说，将其转换为规范路径。
//
// 在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..） 表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成
//部分。更多信息请参阅：Linux / Unix中的绝对路径 vs 相对路径
//
// 请注意，返回的规范路径必须始终以斜杠 / 开头，并且两个目录名之间必须只有一个斜杠 /。最后一个目录名（如果存在）不能以 / 结尾。此外，规范路径必须是表
//示绝对路径的最短字符串。
//
//
//
// 示例 1：
//
// 输入："/home/"
//输出："/home"
//解释：注意，最后一个目录名后面没有斜杠。
//
//
// 示例 2：
//
// 输入："/../"
//输出："/"
//解释：从根目录向上一级是不可行的，因为根是你可以到达的最高级。
//
//
// 示例 3：
//
// 输入："/home//foo/"
//输出："/home/foo"
//解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。
//
//
// 示例 4：
//
// 输入："/a/./b/../../c/"
//输出："/c"
//
//
// 示例 5：
//
// 输入："/a/../../b/../c//.//"
//输出："/c"
//
//
// 示例 6：
//
// 输入："/a//b////c/d//././/.."
//输出："/a/b/c"
// Related Topics 栈 字符串
// 👍 231 👎 0

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName SimplifyPath
 * @Description 简化路径
 * @Author lihengyu
 * @Date 2020/12/24 11:06
 * @Version 1.0
 * 解答成功: 执行耗时:5 ms,击败了85.44% 的Java用户 内存消耗:38.4 MB,击败了86.28% 的Java用户
 */
public class SimplifyPath {
    public static void main(String[] args) {
        Solution solution = new SimplifyPath().new Solution();
        System.out.println(solution.simplifyPath("/a//b////c/d//././/.."));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String simplifyPath(String path) {
            String[] split = path.split("/");
            int pointPointCount = 0;

            Stack<String> stack = new Stack<>();
            for (int i = 0; i < split.length; i++) {
                if (!"".equals(split[i].trim())){
                    stack.push(split[i].trim());
                }
            }
            ArrayList<String> strings = new ArrayList<>();

            while (!stack.empty()){
                String currentString = stack.pop();
                if (".".equals(currentString)){
                    continue;
                }else if ("..".equals(currentString)){
                    pointPointCount++;
                }else {
                    if (pointPointCount>0){
                        pointPointCount--;
                        continue;
                    }
                    strings.add(currentString);
                }
            }
            int size = strings.size();

            if (size==0){
                return "/";
            }

            StringBuilder sb = new StringBuilder();
            String[] stringArr = new String[size];

            for(String s : strings){
                stringArr[--size] = s;
            }

            for (int i = 0; i < stringArr.length; i++) {
                sb.append("/").append(stringArr[i]);
            }

            return sb.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}