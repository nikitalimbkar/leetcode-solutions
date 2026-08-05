class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(reverse(x) == x){
            return true;
        }
        return false;
    }
    public int reverse(int n){
         int revNum = 0;
        while(n != 0){
            int dig = n % 10;
            revNum = revNum * 10 + dig;

            n = n/10;
        }
        return revNum;
    }
    }
    

