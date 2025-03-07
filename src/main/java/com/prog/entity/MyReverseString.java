package com.prog.entity;

public class MyReverseString {
    public static String myReverseString(String str) {
        int length = str.length();
        char[] charArray =str.toCharArray();
        for(int i=0;i<length-1;i++){
            char temp = charArray[i];
            charArray[i] = charArray[length-1-i];
            charArray[length-1-i] = temp;
        }
        return new String(charArray);
    }
}
