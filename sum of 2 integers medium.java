class Solution {
    public int getSum(int a, int b) {
        int res = (int) (Math.log(Math.pow(2, a) * Math.pow(2, b)) / Math.log(2));
        return res;
    }
}