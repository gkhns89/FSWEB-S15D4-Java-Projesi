import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {

        Stack<String> stc = new Stack<>();

        String[] chars = text.split("");

        for (String ch: chars)
        {
            stc.addElement(ch);
        }

        System.out.println("Kontrol1: "+ stc);

        return false;
    }
}