public final class TextUtils {
    private TextUtils() {
    }

    public static int getCharactersNumber(String text) {
        return text.length();
    }

    public static int getCharactersNumberWithoutWhitespaces(String text) {
        String textWithoutWhitespace = text.replace(" ", "");
        return textWithoutWhitespace.length();
    }

    public static int getWordsNumber(String text) {
        String[] textElements = text.split(" ");
        return textElements.length;
    }

    public static boolean isPalindrome(String text) {
        String reversedText = new StringBuilder(text).reverse().toString();
        return text.equals(reversedText);
    }
}
