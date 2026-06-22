class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        //find maximim
        for(int candy :candies){
            maxCandies = Math.max(maxCandies,candy);
        }
        List<Boolean>result = new ArrayList<>();
        //check each child
        for(int candy : candies){
            result.add(candy+extraCandies >= maxCandies);
        }
        return result;
    }
}
