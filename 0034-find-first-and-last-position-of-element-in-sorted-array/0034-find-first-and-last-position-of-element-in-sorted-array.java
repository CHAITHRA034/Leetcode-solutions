class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=lowerbound(nums,target);

        if(first==nums.length||nums[first]!=target)
        return new int[]{-1,-1};

        int last=upperbound(nums,target)-1;

        return new int[]{first,last};
    }
    public int lowerbound(int[] nums,int target){
        int low=0;
        int high=nums.length;

        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]>=target){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public int upperbound(int[] nums,int target){
        int low=0;
        int high=nums.length;

        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]>target){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}