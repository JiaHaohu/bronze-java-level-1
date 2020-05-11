package com.tw.exam.questionEasy;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

class StringHelper {
    /**
     * This method create a new string using the first and last <code>count</code> letters.
     * For example, if the <code>text</code> is <code>"Hello"</code>, and <code>count</code>
     * is 2. Then, the first 2 letters of <code>"Hello"</code> are <code>"He"</code> and the
     * last 2 letters are <code>"lo"</code>. Thus the returned string is <code>"Helo"</code>.
     *
     * @param text The input text.
     * @param count The number of first and last characters taken from the input text.
     * @return A new string created.
     *
     * @throws IllegalArgumentException The <code>text</code> is null. Or <code>count</code>
     * is negative. Or <code>count</code> is greater than the length of <code>text</code>.
     */
    public static String firstAndLastCharacters(String text, int count) {
        // TODO: Please implement the method.
        // <-start-
        if (text == null){
            throw new IllegalArgumentException("The text cannot be null.");
        }
        int len = text.length();
        if (count<0 || count>len ){
            throw new IllegalArgumentException("Invalid count.");
        }

        String l = text.substring(0, count);
        String r = text.substring(len - count,len);
        System.out.println(l+r);
        return  l+r;


        // --end-->
    }
}
