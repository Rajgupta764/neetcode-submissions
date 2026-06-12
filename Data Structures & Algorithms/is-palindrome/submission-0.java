class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        String converse=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int right=converse.length()-1;
        while(left<=right){
            if(converse.charAt(left)!=converse.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
