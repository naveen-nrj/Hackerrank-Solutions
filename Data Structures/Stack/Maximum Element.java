import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> maxstack = new Stack<Integer>();
            int a = s.nextInt();
            for(int i=0;i<a;i++) {
            int c = s.nextInt();
            if(c==1) {
                int d = s.nextInt();
                stack.push(d);
                if (maxstack.isEmpty() || d >= maxstack.peek()) {
                        maxstack.push(d);
                }
            }
            else if(c==2) {
               int b = stack.pop();
              if(b==maxstack.peek()){
                  maxstack.pop();
              }
                
            }
            else {
                System.out.println(maxstack.peek());
                    }
                
            }
            
        }

    }

