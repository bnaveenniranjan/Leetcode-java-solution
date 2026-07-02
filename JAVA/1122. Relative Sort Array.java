class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        List<Integer> result = new ArrayList<>();

        // Add elements in the order of arr2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    result.add(arr1[j]);
                }
            }
        }

        // Sort arr1
        Arrays.sort(arr1);

        // Add remaining elements
        for (int i = 0; i < arr1.length; i++) {

            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(arr1[i]);
            }
        }

        // Convert List to int[]
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}