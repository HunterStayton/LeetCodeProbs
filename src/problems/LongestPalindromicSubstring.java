package problems;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {
    private int start, maxPalLen;

    public static void main(String[] args) {
        LongestPalindromicSubstring runner = new LongestPalindromicSubstring();
        runner.longestPalindrome("babad");
        System.out.print(9 / 2);
    }

    //A string is palindromic if it reads the same forward and backward.
    //racecar, etc

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) return s;

        for (int i = 0; i < length - 1; i++) {
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i + 1);
        }
        return s.substring(start, start + maxPalLen);
    }

    private void expandAroundCenter(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxPalLen < k - j - 1) {
            start = j + 1;
            maxPalLen = k - j - 1;
        }
    }


//    public String longestPalindrome(String s) {
//        int length = s.length();
//        if(length < 2) return s;
//        for(int i = 0; i < length - 1; i++){
//            expandAroundCenter(s, i , i);
//            expandAroundCenter(s, i, i + 1);
//        }
//        return s.substring(start,start+maxPalLen);
//    }
//    private void expandAroundCenter(String s, int j, int k) {
//        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
//            j--;
//            k++;
//        }
//        if (maxPalLen < k - j - 1) {
//            start = j + 1;
//            maxPalLen = k - j - 1;
//        }
//    }

}
