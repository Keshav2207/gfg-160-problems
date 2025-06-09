
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 0, 5, 9};
        int length = arr.length;
        // Since we're swapping elements, i.e. first goes to last and second goes
        // to second-last of an array. hence we need not traverse through whole array length.
        // traverse just half the length to 'Reverse' an array.
        for(int i = 0; i < length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[length -1 - i];
            arr[length -1 -i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
