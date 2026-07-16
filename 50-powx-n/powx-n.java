class Solution {
    public double myPow(double x, int n) {
        
        

        if(n == 0){
            return 1;
        }
        double half = myPow(x,n/2);
        if(n < 0){
            x = 1/x;
            n = -n;
        }

        if(n %2 == 0){
            double result = half*half;
            return result;
        }
        else{
            double result = x *half*half;
            return result;
        }

        
        
        
    }
}