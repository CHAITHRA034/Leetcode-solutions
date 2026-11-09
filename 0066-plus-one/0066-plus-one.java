class Solution {
    public int[] plusOne(int[] digits) {
          int n = digits.length;

        // Traverse from the last digit
        for (int i = n - 1; i >= 0; i--) {

            // If digit is less than 9, simply add 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry continues
            digits[i] = 0;
        }

        // If all digits were 9
        int[] ans = new int[n + 1];
        ans[0] = 1;

        return ans;
    }
}