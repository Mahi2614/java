public class largestString {

    // use charat
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    // palindrome
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a palindroome
                return false;
            }
        }
        return true;
    }

    // Que-------finding shortest path
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // south
            if (dir == 'S') {
                y--;
            }
            // north
            else if (dir == 'N') {
                y++;
            }
            // west
            else if (dir == 'W') {
                x--;

            }
            // east
            else {
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float) Math.sqrt(X2 + Y2);
    }

    public static String sunString(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        /*
         * chartat
         * String pehlaNam = "mahi";
         * String dusraNam = "malviya";
         * String fullName = pehlaNam + " " + dusraNam;
         * // System.out.println(fullName + " ");
         * printLetters(fullName);
         * }
         */

        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        // path
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // compare
        // String s1 = "Tony";
        // String s2 = "Tony";
        // String s3 = new String("Tony");

        // if(s1==s2)
        // {
        // System.out.println("Strings are equal");
        // }else{
        // System.out.println("Strings are not equal");
        // }

        // if(s1==s3)
        // {
        // System.out.println("Strings are equal");
        // }else{
        // System.out.println("Strings are not equal");
        // }

        // compare
        // if (s1.equals(s3)) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        String str = "HelloWorld";
        System.out.println(str.substring(0, 5));// inbuild substring function
        // System.out.println(sunString(str, 0, 5));

    }
}