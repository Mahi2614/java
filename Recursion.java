public class Recursion {
    // descending
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }

    // ascending
    public static void printInc(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printInc(n + 1);
    }

    // factrial
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // calculate sum
    public static int calSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = calSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    // fibonacci
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;

        }
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check given array is sorted or not
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // find the first occurance of an element in an array
    public static int firstOccurance(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        return firstOccurance(arr, key, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;

        }
        return isFound;
    }
    // to calculate power

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn =x*xnm1;
        // return xn; or

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        // int arr[] = { 0, 3, 6, 9, 5, 5 };
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurance(arr, 5, 0));
        // System.out.println(lastOccurance(arr, 5, 0));

        System.out.println(power(2, 10));
    }
}

/*
 * public static void main(String[] args) {
 * // int n = 1;// n=10 for dec
 * 
 * // printInc(n);
 * int n = 8;
 * System.out.println(fact(n));
 * System.out.println(calSum(n));
 * System.out.println(fibonacci(n));
 * }
 * }
 */
