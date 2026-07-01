  class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n  = nums.length;
        if(nums[0]>=n){
            return n;
        }
        for(int x = 1;x<=n;x++){
            int candidate = n-x;
            if(nums[candidate]>=x && nums[candidate-1]<x){
                return x;
            }
        }
        return -1;
    }
}