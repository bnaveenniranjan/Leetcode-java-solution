class Solution {
    public int getWinner(int[] arr, int k) {
              int winner = arr[0];
              int wintimes = 0;
              for(int i = 1; i<arr.length;i++){
                if(arr[i] > winner){
                    winner = arr[i];
                    wintimes = 1;
                }else{
                    wintimes++;
                }
                if(wintimes >= k){
                    return winner;
                }
              }
              return winner;