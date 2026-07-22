class Solution {
    public int minOperations(int[] nums) {
        int result = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int temp = nums[i-1]-nums[i]+1;
                result += temp;
                nums[i] += temp;
            }
        }
        return result;
    }
}