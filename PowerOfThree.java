// Given an integer n, return true if it is a power of three otherwise return false

class PowerOfThree{
    public boolean isPowerOfThree(int n) {       
        if(n == 0) return false;
        while(n > 1){
            if (n == 3) return true;
            n = n / 3;  
        }
        return false;
    }
}