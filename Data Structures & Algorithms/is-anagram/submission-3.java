class Solution {
    public boolean isAnagram(String s, String t) {
         int n=s.length();
         int m=t.length();
         if(m!=n){
            return false;
         }
         char st1[]=s.toCharArray();
         char st2[]=t.toCharArray();
         Arrays.sort(st1);
         Arrays.sort(st2);
         String s1=new String(st1);
         String s2=new String(st2);
         if(s1.equals(s2)){
            return true;
         }
         return false;
    }
}
