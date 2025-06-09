public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        int length = arr.length;
        int pos = length -1;
        for (int i = arr.length -1; i >= 0; i--){
            // If arr[i] is non-zero.
            if(arr[i] != 0 ){
                // Add that element to the right of array.
                arr[pos] = arr[i];
                System.out.printf("%d -> %d : %s\n", i, pos, Arrays.toString(arr));
                // Once element is set on right, decrease the non-zero pointer variable.
                // Hence, non-zero pointer variable moves only when it gets non-zero value.
                pos--;
            }
        }
        // After setting non-zero variable to right, we decreased the non-zero pointer variable by 1.
        // Hence, fill all the array elements to zero from index of non-zero pointer variable till 0.
        while (pos >= 0){
            arr[pos] = 0;
            pos--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
