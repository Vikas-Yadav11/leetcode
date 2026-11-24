
class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            long product = 1;
            int gcd = 0;
            long lcm = 1;

            for (int j = i; j < n; j++) {
                product *= nums[j];

                gcd = findGcd(gcd, nums[j]);

                lcm = (lcm * nums[j]) / findGcd((int)lcm, nums[j]);

                if (product == (long) gcd * lcm) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);
    }
}
