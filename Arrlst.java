// import java.util.ArrayList;

// import java.util.Collections;
import java.util.*;

public class Arrlst {
    public static void swap(ArrayList<Integer> list1, int idx1, int idx2) {
        int temp = list1.get(idx1);
        list1.set(idx1, list1.get(idx2));
        list1.set(idx2, temp);
    }

    public static void main(String[] args) {
        // classname objectname=new classname();
        ArrayList<Integer> list1 = new ArrayList<>();// <>--shows datatype
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(8);
        list1.add(2);
        list1.add(6);
        list1.add(4);

        list1.add(1, 9);

        System.out.println(list1);
        Collections.sort(list1);// ascending
        System.out.println(list1);

        // descending
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);

        System.out.println(list1.size());

        // print the arrayList
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // Get operstion
        int element = list1.get(2);
        System.out.println(element);

        // remove operation
        list1.remove(2);
        System.out.println(list1);

        // set operation
        list1.set(2, 10);
        System.out.println(list1);

        // contains operation
        System.out.println(list1.contains(1));
        System.out.println(list1.contains(11));

        // print reverse ARRAY LIST
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        // maximum in arraylist
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list1.size(); i++) {
            // if (max < list1.get(i)) {
            // max = list1.get(i);
            // }
            max = Math.max(max, list1.get(i));

        }
        System.out.println("max element =" + max);

        // swapping
        int idx1 = 1, idx2 = 3;
        System.out.println(list1);
        swap(list1, idx1, idx2);
        System.out.println(list1);

        // multidimentional array list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list4 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);// 1 2 3 4 5
            list2.add(i * 1);// 2 4 6 8 10
            list3.add(i * 1);// 3 6 9 12 15

        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(3);
        list2.remove(0);

        System.out.print(mainList);

        // nested loop
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }

        }

    }
}
