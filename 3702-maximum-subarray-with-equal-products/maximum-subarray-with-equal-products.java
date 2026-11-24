class Solution {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        if (a == 0 || b == 0)
            return 0;
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            long pro = 1, g = 0, l = 1;

            for (int j = i; j < arr.length; j++) {
                pro *= arr[j];
                g = gcd(g, arr[j]);
                l = lcm(l, arr[j]);

                if (pro == l * g) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}