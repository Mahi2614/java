public class Backtracking {
    public static void changeArr(int arr[], int i, int val) {
        // basse case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // find subsets
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);

            }
            return;
        }
        // yes choice
        findSubsets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSubsets(str, ans, i + 1);
    }

    // permutation
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;

        }

        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"=>"ab"+"de"="abde"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        // backtrack array
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);

        // subsets
        String str = "abc";
        findSubsets(str, " ", 0);

        // permutation
        String str = "abc";
        findPermutation(str, " ");

    }
}
