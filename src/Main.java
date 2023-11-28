import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't nod"));
        System.out.println("********************************************");
        System.out.println(checkForPalindrome2("abccba"));
        System.out.println(checkForPalindrome2("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome2("I did, did I?"));
        System.out.println(checkForPalindrome2("hello"));
        System.out.println(checkForPalindrome2("Don't nod"));
    }

    public static boolean checkForPalindrome(String text) {
        Stack<String> stcCopy = new Stack<>();
        Stack<String> stc = new Stack<>();
        Stack<String> stc2 = new Stack<>();

        text = text.replaceAll("[ '.,?!_-]", "").trim().toLowerCase(Locale.ENGLISH);
        String[] chars = text.split("");

        stc.addAll(Arrays.asList(chars));
        stcCopy.addAll(Arrays.asList(chars));

        while (!stc.isEmpty()) {
            stc2.add(stc.pop());
        }

        return stcCopy.equals(stc2);

    }

    public static boolean checkForPalindrome2(String text) {

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        text = text.replaceAll("[ '.,?!_-]", "").trim().toLowerCase(Locale.ENGLISH);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            stack.push(c);
            queue.offer(c);
        }

        while (!stack.isEmpty()) {

            if (!stack.pop().equals(queue.remove())) {
                return false;
            }
        }
        return true;
    }
}