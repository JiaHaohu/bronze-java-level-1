package com.tw.exam.questionAnotherMedium;

class DigitsHelper {
    /**
     * <p>This function returns the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters. This function will return 0 if there are no
     * digits in the string.</p>
     *
     * <p>For example:</p>
     *
     * <ul>
     * <li><code>sumDigits("aa1bc2d3") → 6</code></li>
     * <li><code>sumDigits("aa11b33") → 8</code></li>
     * <li><code>sumDigits("Chocolate") → 0</code></li>
     * </ul>
     *
     * @param text The input string.
     * @return The sum of digits in the string.
     */
    public static int sumDigits(String text) {
        // TODO: Please implement the method
        // <-start-
        if (text ==null){
            throw  new IllegalArgumentException();
        }
        char[] chars = text.toCharArray();
        int sum = 0;
        for (char c:chars) {
            if (c>='0' && c<='9'){
                sum=sum+(c-'0');
            }
        }
        return sum;
        // --end-->
    }
}
