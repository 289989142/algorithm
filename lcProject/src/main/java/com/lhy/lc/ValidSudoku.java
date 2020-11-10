package com.lhy.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * 超过 34 34 bad
 * @author HASEE
 */
public class ValidSudoku {
    public static void main(String[] args) {
        Solution solution = new ValidSudoku().new Solution();
        char[][] board = {
                {'5', '3', '.', '.','7', '.','.', '.', '.'},
                {'6', '.', '.', '1','9', '5','.', '.', '.'},
                {'.', '9', '8', '.','.', '.','.', '6', '.'},
                {'8', '.', '.', '.','6', '.','.', '.', '3'},
                {'4', '.', '.', '8','.', '3','.', '.', '1'},
                {'7', '.', '.', '.','2', '.','.', '.', '6'},
                {'.', '6', '.', '.','.', '.','2', '8', '.'},
                {'.', '.', '.', '4','1', '9','.', '.', '5'},
                {'.', '.', '.', '.','8', '.','.', '7', '9'}
        };
        System.out.println(solution.isValidSudoku(board));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            if (checkLine(board)){
                if (checkRow(board)){
                    return checkSquare(board);
                }
            }
            return false;
        }
        /*      {'5', '3', '.', '.','7', '.','.', '.', '.'},
                {'6', '.', '.', '1','9', '5','.', '.', '.'},
                {'.', '9', '8', '.','.', '.','.', '6', '.'},
                {'8', '.', '.', '.','6', '.','.', '.', '3'},
                {'4', '.', '.', '8','.', '3','.', '.', '1'},
                {'7', '.', '.', '.','2', '.','.', '.', '6'},
                {'.', '6', '.', '.','.', '.','2', '8', '.'},
                {'.', '.', '.', '4','1', '9','.', '.', '5'},
                {'.', '.', '.', '.','8', '.','.', '7', '9'}*/
        private boolean checkLine(char[][] board){
            List<Character> list =new ArrayList<Character>();
            int count = 0;
            for (int i = 0; i <9 ; i++) {
                list.clear();
                count = 0;
                for (int j = 0; j < 9 ; j++) {
                    if (board[i][j] != '.') {
                        count++;
                        if (!list.contains(board[i][j])) {
                            list.add(board[i][j]);
                        }
                    }
                }
                if (count != list.size()){
                    return false;
                }
            }
            return true;
        }
        private boolean checkRow(char[][] board){
            List<Character> list =new ArrayList<Character>();
            int count = 0;
            for (int i = 0; i < 9 ; i++) {
                list.clear();
                count = 0;
                for (int j = 0; j <9; j++) {
                    if (board[j][i] != '.') {
                        count++;
                        if (!list.contains(board[j][i])) {
                            list.add(board[j][i]);
                        }
                    }
                }
                if (count != list.size()){
                    return false;
                }
            }
            return true;
        }
        private boolean checkSquare(char[][] board){
          //  int i1 = 0;
          //  int j1 = 0;
           // int i2 = 3;
           // int j2 = 3;
           // int i3 = 6;
           // int j3 = 6;

   /*           {'5', '3', '.', '.','7', '.','.', '.', '.'},
                {'6', '.', '.', '1','9', '5','.', '.', '.'},
                {'.', '9', '8', '.','.', '.','.', '6', '.'},
                {'8', '.', '.', '.','6', '.','.', '.', '3'},
                {'4', '.', '.', '8','.', '3','.', '.', '1'},
                {'7', '.', '.', '.','2', '.','.', '.', '6'},
                {'.', '6', '.', '.','.', '.','2', '8', '.'},
                {'.', '.', '.', '4','1', '9','.', '.', '5'},
                {'.', '.', '.', '.','8', '.','.', '7', '9'}*/
            for (int i = 0; i < 7; i+=3) {
                for (int j = 0; j < 7; j+=3) {  //先分成9小块
                    List<Character> list =new ArrayList<Character>();
                    int count = 0;
                    for (int k = 0; k <3 ; k++) {   //再对每小块进行查重
                        for (int l = 0; l < 3; l++) {
                            if (board[i+k][j+l] != '.') {
                                count++;
                                if (!list.contains(board[i+k][j+l])) {
                                    list.add(board[i+k][j+l]);
                                }
                            }
                        }
                    }
                    if (count != list.size()){
                        return false;
                    }
                }
            }
            return true;
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}
