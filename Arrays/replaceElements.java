Replace Elements With Greatest Element On Right Side

You are given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.
Example 1:
Input: arr = [2,4,5,3,1,2]
Output: [5,5,3,2,2,-1]

Example 2:
Input: arr = [3,3]
Output: [3,-1]

Solution:
class Solution {
    public int[] replaceElements(int[] arr) {
       for(int i=0;i<arr.length;i++){
        int max = -1;
        for(int j= i+1;j<arr.length;j++){
            if(arr[j] > max){
                max = arr[j];
            }
        }
       arr[i] = max;
       }
       return arr;
    }
}
