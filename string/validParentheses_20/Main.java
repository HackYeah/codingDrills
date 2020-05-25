package codingDrills.string.validParentheses_20;

public class Main {
    public static void main(String[] args){
        Solution s = new Solution();
        String input1 = "()";
        String input2 = "()[]{}";
        String input3 = "(]";
        System.out.println("Valid or not valid " + s.isValid(input1) + s.isValid(input2)+ s.isValid(input3));
    }
}
