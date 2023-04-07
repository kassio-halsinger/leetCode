package src.main;

//Author: Kassio Halsinger
//Last Updated: 4/5/23

import java.util.*;

class Solution {
    /* Given a string s, return the length of the...
     * ...longest substring w/o repeating chars.
     */ 
    public int lengthOfLongestSubstring(String s) {
        
        //This set will contain each character
        //which has aleady appeared as we traverse
        //through the String s
        Set<String> set = new HashSet<>();
        int solution = 0;
        int count = 0;

        //until at the end of the string
        for (int i = 0; i < s.length(); i++){         
            count++;
            
            //check if second letter
            //was previously added to set;
            //if not, add it
            if (!set.add(s.substring(i,i+1))){

                System.out.println("Repeat: "+s.substring(i,i+1));

                //if so, we have found a repeat char
                solution = Math.max(solution,set.size());

                //reset the count and set, readding the letter we 
                //just checked to the new set
                set = new HashSet<>();
                count = 0;
                i--;
            }
            System.out.println("i: "+i);
            System.out.println("count: "+count);
        }
        return Math.max(solution, count);
    }
}