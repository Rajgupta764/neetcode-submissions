class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        String convert=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int right=convert.length()-1;
        while(left<=right){
            if(convert.charAt(left)!=convert.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
