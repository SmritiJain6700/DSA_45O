//vimp
package Recursion.Advanced;

import java.util.Stack;


public class SortStackRecursion {
    public static void sort(Stack<Integer> stack){
        if(stack.size() == 1) return;

        int temp = stack.peek();
        stack.pop();
        sort(stack);
        insert(stack,temp);
    }

    public static void insert(Stack<Integer> stack, int temp){
        if(stack.size()==0 || stack.peek() <= temp){
            stack.push(temp);
            return;
        }
        int val = stack.peek();
        stack.pop();
        insert(stack, temp);
        stack.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        

        // after sorting 
        sort(stack);
        for(int x:stack){
            System.out.println(x+"");
        }


    }
    
}
