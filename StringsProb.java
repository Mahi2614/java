public class StringsProb {
    // remove duplicate strings
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[])// stringbuilder--faster
                                                                                                 // execution
    {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    // print all binary strings of size n without consecutive ones
    public static void printbinaryStr(String str, int n, int lastPlace) {

        // base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        // if (lastPlace == 0) {
        // printbinaryStr(str.append("0"), n - 1, 0);
        // printbinaryStr(str.append("1"), n - 1, 1);
        // } else {
        // printbinaryStr(str.append("0"), n - 1, 0);
        // }
        // or
        printbinaryStr(str + "0", n - 1, 0);
        if (lastPlace == 0) {
            printbinaryStr(str + "1", n - 1, 1);
        }
    }

    public static void main(String[] args) {
        // duplicateremove
        // String str = "annaa";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);

        // binarystring
        printbinaryStr("", 3, 0);

    }
}
