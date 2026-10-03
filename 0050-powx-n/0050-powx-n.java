class Solution { 
    public double myPow(double x, int n) { 
        
        long N = n; 
        boolean negative = false;

        if (N < 0) { 
            negative = true;
            N = -N; 
        }   

        double ans = power(x, N);

        if (negative) {
            return 1.0 / ans;
        }

        return ans;
    } 

    public double power(double x, long n) { 
        
        if (n == 0) { 
            return 1.0; 
        } 
 
        double half = power(x, n / 2); 
 
        if (n % 2 == 0) { 
            return half * half; 
        } else { 
            return half * half * x; 
        } 
    } 
}