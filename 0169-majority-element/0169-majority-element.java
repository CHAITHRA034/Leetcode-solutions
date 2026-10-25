
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for (int num : nums) {
            if (num == ele) count++;
        }

        return (count > nums.length / 2) ? ele : -1;
    }
}