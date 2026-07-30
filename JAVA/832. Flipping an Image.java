class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) reverse(arr);
        return image;
    }

    public void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int temp = arr[l];
            arr[l++] = arr[r] ^ 1;
            arr[r--] = temp ^ 1;
        }
    }
}