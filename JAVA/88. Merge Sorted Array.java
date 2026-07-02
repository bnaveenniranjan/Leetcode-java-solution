class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> values = new ArrayList<>();

        
        for (int i = 0; i < m; i++) {
            values.add(nums1[i]);
        }

        for (int i = 0; i < n; i++) {
            values.add(nums2[i]);
        }

        Collections.sort(values);

        for (int i = 0; i < values.size(); i++) {
            nums1[i] = values.get(i);
        }
    }
}