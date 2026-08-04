class Solution {

    public int myAtoi(String s) {

        // Remove leading and trailing spaces
        s = s.trim();

        //If string is empty, return 0
        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;      // Positive by default
        int index = 0;
        long result = 0;   // Use long to detect overflow

        //Check for '+' or '-'
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        // Read digits one by one
        while (index < s.length() && Character.isDigit(s.charAt(index))) {

            // Convert character to digit
            int digit = s.charAt(index) - '0';

            // Build the number
            result = result * 10 + digit;

            //Check for overflow
            if (sign * result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            index++;
        }

        //Return final answer
        return (int) (sign * result);
    }

    // Main method for testing
    public static void main(String[] args) {

        Solution obj = new Solution();

        System.out.println(obj.myAtoi("42"));               
        System.out.println(obj.myAtoi("   -42"));           
        System.out.println(obj.myAtoi("4193 with words"));  
        System.out.println(obj.myAtoi("words and 987"));    
        System.out.println(obj.myAtoi("-91283472332"));     
        System.out.println(obj.myAtoi("91283472332"));     
        System.out.println(obj.myAtoi("+123"));            
        System.out.println(obj.myAtoi("000123"));          
        System.out.println(obj.myAtoi("3.14159"));         
        System.out.println(obj.myAtoi("+-12"));            
    }
}