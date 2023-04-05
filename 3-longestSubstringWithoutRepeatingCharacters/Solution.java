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

        //"<null>" -> 0
        if (s == null){
            return 0;
        }
        //This set will contain each character
        //which has aleady appeared as we traverse
        //through the String s
        Set<String> set = new HashSet<>();
        boolean noDuplicatesInSet = true;

        //until at the end of the string
        for (int i = 0; i < s.length(); i++){

        }
        //ITERATION 1
            //add first letter to set
            set.add(s.substring(0, 1));

        //ITERATION 2
            //check if second letter
            //was previously added to set;
            //if not, add it
            if (!set.add(s.substring(1,2))){
                //if so, we have found a repeat char
                return 1;
            }
            

        
            


    }
}