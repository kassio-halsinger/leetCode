//Author: Kassio Halsinger
//Last Updated: 4/5/23

import java.util.*;

class Solution {
    /* Given a string s, return the length of the...
     * ...longest substring w/o repeating chars.
     */ 
    public int lengthOfLongestSubstring(String s) {
        //"abcabcbb" -> "abc" -> 3
        //"a" -> "a" -> 1
        //"bbbbbb" -> "b" -> 1

        //THIS CAN PERHAPS BE DELETED
        //"<null>" -> 0
        if (s == null){
            return 0;
        }
        //This set will contain each character
        //which has aleady appeared as we traverse
        //through the String s
        Set<String> set = new HashSet<>();

        //until at the end of the string
        for (int i = 0; i < s.length(); i++){
            //check if second letter
            //was previously added to set;
            //if not, add it
            if (!set.add(s.substring(i,i+1))){
                //if so, we have found a repeat char
                return set.size();
            }
        }
        return set.size();
    }
}