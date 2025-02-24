import java.util.Stack;
public class TryReverse {
    public static void main(String[] args) {
        String input ="This is java";
        System.out.println(input);
        String reversed= reverseString(input);
        System.out.println(reversed);
    }
    public static String reverseString(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();

        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
