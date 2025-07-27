package Day8;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the brackets:");
        String brackets = sc.nextLine().trim();
        Stack<Character> stack = new Stack<>();
        boolean isBalanced = true;
        for (char x : brackets.toCharArray()) {
            if (x == '{' || x == '[' || x == '(') {
                stack.push(x);
            } else if (x == '}' || x == ']' || x == ')') {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char top = stack.peek();
                if ((x == '}' && top == '{') || (x == ']' && top == '[') || (x == ')' && top == '(')) {
                    stack.pop();
                } else {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            isBalanced = false;
        }
        System.out.println(isBalanced);
        System.out.println("1234".charAt(1) - '0');
    }
}
