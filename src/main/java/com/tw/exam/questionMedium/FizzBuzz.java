package com.tw.exam.questionMedium;

class FizzBuzz {
    /**
     * <p>Consider a series of numbers beginning at <code>start</code> and running up to but
     * <b>NOT</b> including end. For example. Given <code>start=1</code> and
     * <code>end=5</code> gives the series 1, 2, 3, 4.</p>
     *
     * <p>This function will return a new <code>String[]</code> array containing the string form
     * of these numbers, except:</p>
     *
     * <ul>
     * <li>For multiples of 3, use "Fizz" instead of the number</li>
     * <li>For multiples of 5 use "Buzz"</li>
     * <li>For multiples of both 3 and 5 use "FizzBuzz"</li>
     * </ul>
     *
     * <p>For example:</p>
     *
     * <ul>
     * <li>
     *     <code>fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]</code>
     * </li>
     * <li>
     *     <code>fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]</code>
     * </li>
     * <li>
     *     <code>fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]</code>
     * </li>
     * </ul>
     *
     * @param start The starting number (inclusive).
     * @param end The end number (exclusive).
     * @return A string array representing the result.
     *
     * @throws IllegalArgumentException The <code>start</code> or <code>end</code> is less than zero. Or the
     * <code>start</code> is greater than <code>end</code>.
     */
    public static String[] getFizzBuzz(int start, int end) {
        // TODO: Please implement the method
        // <-start-
        if (start < 0 || end < 0) {
            throw new IllegalArgumentException();
        }
        if (start > end) {
            throw new IllegalArgumentException();
        }
        String[] s = new String[end - start];
        for (int i = start; i < end; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    s[i] = "FizzBuzz";
                }
                s[i] = "Fizz";
            } else if (i % 5 == 0) {
                s[i] = "Buzz";
            } else {
                s[i] = String.valueOf(i);
            }

        }

        return s;
        // --end-->
    }
}
