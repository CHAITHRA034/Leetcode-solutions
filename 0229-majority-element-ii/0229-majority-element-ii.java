class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int threshold=n/3;

        for(int num:nums){
            int count=map.getOrDefault(num,0)+1;
            map.put(num,count);
        

        if(count==threshold+1){
            ans.add(num);
        }
        }

        return ans;
    }
}