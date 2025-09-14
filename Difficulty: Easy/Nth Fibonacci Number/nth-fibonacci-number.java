// User function Template for Java

class Solution {
    public static int f(int n){
        if(n<=1) return n;
        int last=f(n-1);
        int slast=f(n-2);
        return last+slast;
    }
    public int nthFibonacci(int n) {
        // code here
       return f(n);
    }
}