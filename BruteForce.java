import java.util.ArrayList;

//complexity---O(n^2)
public class BruteForce {
    // pair sum-brute force
    // public static boolean pairSum1(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // pair-sum 2 pointer approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            // case-1
            if (list.get(lp) + list.get(rp) == target) {
                return true;

            }
            // case2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                // case3
                rp--;
            }
        }
        return false;

    }

    // 2 pointer approach
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            // calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);

            // update ptr
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }

        }

        // // brute force
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int ht = Math.min(height.get(i), height.get(j));
        // int width = j - 1;
        // int currwater = ht * width;
        // maxWater = Math.max(maxWater, currwater);

        // }
        // }
        return maxWater;
    }

    // pair sum 2 brute force
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {// breaking point
                bp = i;
                break;

            }
        }
        if (bp == -1) {
            return false;
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest

        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // cae3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        // System.out.println(storeWater(height));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int target = 4;
        // System.out.println(pairSum1(list, target));
        System.out.println(pairSum2(list, target));

    }
}
