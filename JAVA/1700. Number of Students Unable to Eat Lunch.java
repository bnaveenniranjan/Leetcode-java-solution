class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int Zeroes = 0;
        int ones = 0;
        int S = sandwiches.length;
        for(int student : students){
            if(student == 1) ones++;
            else Zeroes++;
        }
        for(int i = 0; i < S ; i++){
            if(sandwiches[i] == 0 && Zeroes > 0) Zeroes--;
            else if(sandwiches[i] == 1 && ones > 0) ones--;
            else return S - i;
        }
        return 0;
    }
}