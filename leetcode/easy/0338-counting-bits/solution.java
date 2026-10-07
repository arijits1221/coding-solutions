class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        int a = 1;
        for (int i = 1; i <= n; i++) {
            if (a * 2 == i) {
                a = i;
            }
            arr[i] = arr[i - a] + 1;
        }
        return arr;
    }
}