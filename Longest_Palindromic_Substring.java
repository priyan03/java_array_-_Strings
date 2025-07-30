class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String longest = "";
        List<String> list = new ArrayList<>();
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
