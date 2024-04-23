import java.util.*;

public class Bitmanipulation {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even
            System.out.println("even no");

        } else {
            System.out.println("odd no");
        }

    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;

        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n | bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit ==0){
        // return clearIthBit(n,i);
        // }else{
        // return setIthBi(n, i)
        // }
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearIBitsinRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {// check our Lsb
                count++;

            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {// check lsb
                ans = ans * a;

            }
            a = a * a;
            n = n >> 1;
        }
        return ans;

    }

    public static void main(String[] args) {

        System.out.println((5 & 6));// and
        System.out.println((5 | 6));// or
        System.out.println((5 ^ 6));// exor
        System.out.println((~5));// neg in deci
        System.out.println((~0));
        System.out.println((5 << 2));// left shift
        System.out.println((5 >> 2));// right shift
        oddOrEven(3); // even(lsb-0) odd(lsb-1)
        oddOrEven(10);
        oddOrEven(0);
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 2));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
        System.out.println(clearIBitsinRange(10, 2, 4));
        System.out.println(isPowerOfTwo(15));
        System.out.println(countSetBits(10));
        System.out.println(fastExpo(3, 5));
    }
}
