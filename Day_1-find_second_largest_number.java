import java.util.Arrays;

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int s = -1;
        int l = arr[0];
        for(int n : arr){
            if(n > s && n > l){
                s = l;
                l = n;
            }else if(n < l && n > s){
                s = n;
            }
        }
        
        return s;
    }
}
