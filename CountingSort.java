public class CountingSort {

    public static void countingSort(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array to store the frequency of each element
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Perform cumulative sum on the count array to prepare for placing elements
        int[] output = new int[arr.length]; // Output array to store the sorted elements
        output[0] = count[0];
        for (int i = 1; i < count.length; i++) {
            output[i] = output[i - 1] + count[i];
          }

        // Stable sorting by placing elements according to decreasing frequencies
        int j = arr.length - 1;
        for (int i = largest; i >= 0; i--) { // Loop from largest to smallest element
            while (count[i] > 0) {
                output[--j] = i; // Decrement j first for stable sorting
                count[i]--;
            }
        }

        // Copy the sorted elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        countingSort(arr);
        printArr(arr); // Output: 1 2 3 4 5
    }
}
