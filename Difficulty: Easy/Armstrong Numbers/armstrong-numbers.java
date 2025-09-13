// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int orginal=n;
        int count=0;
        while(n>0){
            int b=n%10;
            count+=(b*b*b);
            n=n/10;
        }
        
        if(count==orginal){
            return true;
        }
        return false;
    }
}