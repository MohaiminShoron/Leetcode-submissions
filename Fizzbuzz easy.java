class Solution {
    public int singleNumber(int[] nums) {
        int uniq = nums[0];
        for (int i = 1; i < nums.length; i++) {
            uniq = uniq ^ nums[i];
        }
        return uniq;

    }

    public static void main(String[] args) {
        int result = Solution.singleNumber({1, 2, 3, 2, 1});
        System.out.println();
    }
}
