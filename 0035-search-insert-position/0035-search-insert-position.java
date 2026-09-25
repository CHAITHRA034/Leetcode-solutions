class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            // Avoids integer overflow compared to (start + end) / 2
            int mid = start + (end - start) / 2; 
            
            if (nums[mid] == target) {
                return mid; // Target found, return its index
            } else if (nums[mid] < target) {
                start = mid + 1; // Search the right half
            } else {
                end = mid - 1; // Search the left half
            }
        }
        
        // If target is not found, 'start' points to the correct insertion index
        return start; 
    }
}