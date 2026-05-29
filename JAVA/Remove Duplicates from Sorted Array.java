class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;

        for(int i = 1 ; i<nums.length;i++){

            if(nums[i]!=nums[i-1]){
                 nums[k] = nums[i];
                 k++;
            }
           
        }
         return k;
    }
}
// here im using two pointer apprach
//if fuction will  check the  current num not eqaual to pervious num 
// example 1,1,2,3,4,4,5 .nums[i] will store new element and nums[i-1] will have pervious number
// k will store the  only unique numbers duplicate will ignoreed