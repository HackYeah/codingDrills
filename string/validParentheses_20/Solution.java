package codingDrills.string.validParentheses_20;

import java.util.HashMap;
import java.util.Stack;
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */
public class Solution {
    HashMap<Character, Character> map = new HashMap<>();

    public Solution () {
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.map.containsKey(c)){
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != this.map.get(c)) {
                    return false;
                    }
                }else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();
        }
    }

