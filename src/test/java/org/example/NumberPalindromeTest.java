package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberPalindromeTest {
    private final NumberPalindrome palindrome = new NumberPalindrome();

    @ParameterizedTest
    @CsvSource({"abcba, true", "hello, false", "racecar, true"})
    void works(String source, boolean expected) {
        var actual = palindrome.isPalindrome(source);

        assertThat(actual).isEqualTo(expected);
    }
}