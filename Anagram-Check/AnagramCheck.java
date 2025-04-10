import java.util.Arrays;

public class AnagramCheck {

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Input: \"" + str1 + "\", \"" + str2 + "\"");
        System.out.println("Output: " + areAnagrams(str1, str2));

        String str3 = "hello";
        String str4 = "world";
        System.out.println("Input: \"" + str3 + "\", \"" + str4 + "\"");
        System.out.println("Output: " + areAnagrams(str3, str4));
    }
}