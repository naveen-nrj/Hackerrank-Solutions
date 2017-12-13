import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
		for(int j=0;j<a;j++) {
			String input = sc.next();
			boolean x = balance(input);
            if(x==false) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
	}

	static boolean balance(String input) {
		Stack < Character > stack = new Stack < Character > ();
		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{') {
				stack.push(input.charAt(i));
			} else if (stack.empty()) {
				return false;
			} else {
				char top = stack.pop();
				if (((top == '(') && (input.charAt(i) != ')')) || ((top == '[') && (input.charAt(i) != ']')) || ((top == '{') && (input.charAt(i) != '}'))) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}
