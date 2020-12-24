package com.lhy.datastructure.stack;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @ClassName ArrayStack
 * @Description 数组实现的栈
 * @Author lihengyu
 * @Date 2020/12/24 10:20
 * @Version 1.0
 */
public class ArrayStack {
    private final int count;
    private String[] stackStr;
    private int ptr;

    public ArrayStack(int count){
        ptr = -1;
        this.count = count;
        stackStr = new String[this.count];
    }

    public void push(String s)throws ArrayIndexOutOfBoundsException{
        if (ptr<count-1){
            stackStr[++ptr] = s;
        }else {
            System.out.println(s+"压栈溢出!");
        }
    }

    public String pop(){
        return stackStr[ptr--];
    }

    public Boolean isEmpty(){
        return ptr < 0;
    }

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i <= ptr; i++){
            s.append(stackStr[i]).append(" ");
        }
        return s.toString();
    }
    public static void main(String[] args){
        ArrayStack stk = new ArrayStack(2);
        stk.push("A");
        stk.push("B");
        stk.push("C");
        System.out.println("第一次打印"+stk.toString());
        System.out.println("出栈"+stk.pop());
        System.out.println("第二次打印"+stk.toString());
    }
}
