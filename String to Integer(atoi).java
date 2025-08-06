class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while(i < n && s.charAt(i) == ' '){
            i++;
        }
        int sign = 1;
        if(i < n &&(s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ?-1 : 1;
            i++;
        }
        
        long result = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            result  = result * 10 + digit;

        if(result > (long) Integer.MAX_VALUE){
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        i++;
        }
        return (int) result * sign;
    }
}
