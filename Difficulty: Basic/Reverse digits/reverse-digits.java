

class Solution {
    public int reverseDigits(int n) {


 int rem = n;
        int ans = 0;

        while (rem > 0) {
            int digit = rem % 10;
            ans = ans * 10 + digit;
            rem = rem / 10;
        }

        return ans;
    }
}