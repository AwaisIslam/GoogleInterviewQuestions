package dailybytequestions;

public class ReverseString {
    public static void reverseString() {

        String word = "cat";
        char[] wordsArray = word.toCharArray();
        int firstIndex = 0;
        int lastIndex = wordsArray.length -1;
        while (firstIndex < lastIndex) {
            char temp = wordsArray[firstIndex];
            wordsArray[firstIndex++] = wordsArray[lastIndex];
            wordsArray[lastIndex--] = temp;
        }

        String newWord = new String(wordsArray);
        System.out.println(newWord);
    }

    public static String reverse(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseString(String s) {
        char[] chars = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            chars[j++] = s.charAt(i);
        }
        return new String(chars);
    }
}
