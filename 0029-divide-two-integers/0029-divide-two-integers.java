class Solution {
    public int divide(int dividend, int divisor) {
        double res=(long)dividend/divisor;
        int r=(int)Math.ceil(res);
        return r;
    }
}