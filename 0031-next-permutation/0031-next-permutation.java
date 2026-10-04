class Solution {
    public void nextPermutation(int[] nums) {
         int n = nums.length;
        int i;

        // 1. Find the first decreasing element
        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        // 2. Find the next greater element and swap
        if (i >= 0) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        // 3. Reverse the remaining elements
        for (int left = i + 1, right = n - 1; left < right; left++, right--) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}