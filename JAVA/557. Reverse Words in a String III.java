class Solution {
    public String reverseWords(String s) {
        String [] words = s.split( " ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            result.append(new StringBuilder(word).reverse()).append(" ");

        } 
        return result.toString().trim();
    }
}
//Two Primary Strategies to Solve the Problem:
//1. Approach: Using Python's split and join methods
//Key Data Structures:
//List Comprehension:
//Used to iterate over the words and reverse them.
//Enhanced Breakdown:
//Split the String:
//Use Python's split() method to split the string into individual words.
//Reverse Each Word:
//Use list comprehension and the slicing method to reverse each word.
//Join the Words:
//Join the reversed words back together with a single space between them using the join() method.
//Complexity Analysis:
//Time Complexity:

//O(n), where n is the length of the string s.
//Space Complexity:

//O(n), due to the extra space required for the list comprehension and the split string.