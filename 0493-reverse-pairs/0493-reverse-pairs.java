class Solution {
    public int reversePairs(int[] nums) {
        int[] temp = new int[nums.length];
        return mergeSort(nums, temp, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int[] temp, int low, int high) {
        int count = 0;
        if (low >= high) {
            return count;
        }

        int mid = low + (high - low) / 2;
        count += mergeSort(arr, temp, low, mid);
        count += mergeSort(arr, temp, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, temp, low, mid, high);

        return count;
    }

    private int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int left = low;
        int right = mid + 1;

        while (left <= mid) {
            while (right <= high && (long) arr[left] > 2L * arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
            left++;
        }
        return count;
    }

    private void merge(int[] arr, int[] temp, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int index = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= high) {
            temp[index++] = arr[right++];
        }

        int i = low;
        while (i <= high) {
            arr[i] = temp[i];
            i++;
        }
    }
}
