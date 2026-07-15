public class Solution {
    public int[] arrayRankTransform(int[] arr) {

        // Step 1: Make a copy
        int[] sorted = arr.clone();

        // Step 2: Sort the copy
        Arrays.sort(sorted);

        // Step 3: Create HashMap (Number -> Rank)
        HashMap<Integer, Integer> map = new HashMap<>();

        int rank = 1;

        // Step 4: Store ranks
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        // Step 5: Create answer array
        int[] result = new int[arr.length];

        // Step 6: Replace every number by its rank
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }

        return result;
    }
} {
    
}
