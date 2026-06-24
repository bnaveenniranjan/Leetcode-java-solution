class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        //index   0 1 2 2 1
        //nums    0 1 2 3 4 
        //output  0 4 1 3 2
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0 ;i<nums.length;i++){
        list.add(index[i],nums[i]);
    }
    int[] result = new int[list.size()];
    int ind = 0;
    for(int i : list){
        result[ind++]=i;
    }
    return result;

    }
}