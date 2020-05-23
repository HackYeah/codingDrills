package codingDrills.string.validPalindrome_125;
/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */
public class Solution {
    public boolean isPalindrome(String s){
        if (s == null || s.length() == 0){
            return true;
        }

        int left = 0, right = s.length() - 1;

        while(left < right){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                right--;
                left++;
            }
        }
        return true;
    }

/*    public boolean isPalindrome(String s){
        char[] inputArray = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();

        for (int i = 0; i < inputArray.length/2; i++){
            if (inputArray[i] != inputArray[inputArray.length-1-i]){
                return false;
            }
        }
        return true;
    }
*/
}
