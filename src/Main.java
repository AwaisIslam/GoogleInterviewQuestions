public class Main {
    public static void main(String[] args) {
        reverseString();
    }

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
}
