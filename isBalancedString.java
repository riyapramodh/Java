import java.util.*;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            boolean isBalanced = isBalanced(str);
            System.out.println(isBalanced);
        }
        scanner.close();
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false; // More closing than opening parentheses
                }
                char opening = stack.pop();
                if ((c == '}' && opening != '{') ||
                    (c == ']' && opening != '[') ||
                    (c == ')' && opening != '(')) {
                    return false; // Mismatched parentheses
                }
            }
        }
        return stack.isEmpty(); // Check if there are any unmatched opening parentheses left
    }
}
