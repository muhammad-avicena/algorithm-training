package stringReverse;

public class stringReverse {
    public static String reverseString(String str) {
        String result = "";
        char[] try1 = str.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) {
            result += try1[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String originalString = "hello";
        String reversedString = reverseString(originalString);
        System.out.println(reversedString);

    }
}
