import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Don't node"));

    }

    public static boolean checkForPalindrome(String text) {
        Stack<String> stcCopy = new Stack<>();
        Stack<String> stc = new Stack<>();
        Stack<String> stc2 = new Stack<>();


        text = text.replaceAll("[ '.,?!_-]","").trim().toLowerCase();
        String[] chars = text.split("");

        stc.addAll(Arrays.asList(chars));
        stcCopy.addAll(Arrays.asList(chars));


        while (!stc.isEmpty()) {
            stc2.add(stc.pop());
        }

        System.out.println("Kontrol 1: "+ stcCopy);
        System.out.println("Kontrol 2: "+ stc2);

        return stcCopy.equals(stc2);

    }
}