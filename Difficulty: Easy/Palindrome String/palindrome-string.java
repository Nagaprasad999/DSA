class Solution {
    public static  boolean ispal(String s,int i,int n){
        if(i>=n/2){
            return true;
           
        }
        if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        return ispal(s,i+1,n);
    }
    
    
    boolean isPalindrome(String s) {
        // code here
       return ispal(s,0,s.length());
    }
}