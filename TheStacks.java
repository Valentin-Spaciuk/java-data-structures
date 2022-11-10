package org.spck;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(9);
        System.out.println(stack.peek()); // checks last element
        System.out.println(stack.size()); // return size
        System.out.println(stack.pop());  // remove last element
        System.out.println(stack.size());
        System.out.println(stack.empty());// checks if empty or not (boolean)
    }
}
