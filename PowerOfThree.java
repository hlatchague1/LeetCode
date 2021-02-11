// Given an integer n, return true if it is a power of three otherwise return false

class PowerOfThree{
    public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        if(n == 0 || n % 2 == 0 || n % 3 != 0) return false;
        while(n > 1){
            if (n == 3) return true;
            if(n % 3 == 0) n = n / 3;
            else{
                return false;
            }
        }
        return false;
    }
}