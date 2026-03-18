package org.example;

public class NumberPalindrome {
    public boolean isPalindrome(String source) {
        if (source == null || source.length() <= 1) {
            return true;
        }
        if (source.charAt(0) != source.charAt(source.length() - 1)) {
            return false;
        }
        var newSource = source.substring(1, source.length() - 1);
        return isPalindrome(newSource);
    }
}
