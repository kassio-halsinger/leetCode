package src.main;

//Author: Kassio Halsinger
//Last Updated: 4/5/23

import java.util.*;

class Main{
    public static void main(String[] args) {
        String s1 = "a";
        Solution solution = new Solution();
        int ans1 = solution.lengthOfLongestSubstring(s1);
        System.out.println("s1 result: "+ans1);

        String s2 = "abc";
        int ans2 = solution.lengthOfLongestSubstring(s2);
        System.out.println("s2 result: "+ans2);

        String s3 = "abccccdefg";
        int ans3 = solution.lengthOfLongestSubstring(s3);
        System.out.println("s3 result: "+ans3);

        String s4 = "abcabcbb";
        Solution solution = new Solution();
        int ans4 = solution.lengthOfLongestSubstring(s1);
        System.out.println("s1 result: "+ans1);

        String s5 = "bbbbbb";
        int ans5 = solution.lengthOfLongestSubstring(s2);
        System.out.println("s2 result: "+ans2);

        String s6 = "pwwkew";
        int ans6 = solution.lengthOfLongestSubstring(s3);
        System.out.println("s3 result: "+ans3);
    }
}