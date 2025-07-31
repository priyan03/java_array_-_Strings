//using collections
class Solution {
    public String longestPalindrome(String s) {
       int maxLen = 0;
       String longest = "";
       List<String>list = new ArrayList<>();
       for(int i = 0; i < s.length(); i++){
        for(int j = i + 1; j <= s.length(); j++){
            String sub = s.substring(i, j);
            if(isPalindrome(sub)){
                list.add(sub);
                if(sub.length() > maxLen){
                    maxLen = sub.length();
                    longest = sub;
                }
            }
        }
       }
       return longest;
    }
    private boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}

//using normal 

class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len - 1) /2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private int expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
