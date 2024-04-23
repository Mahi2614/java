public class FriendsPairing {
    // Given n friends, each one can remain single or can be paired up with some
    // other friend. Each friend can be paired only once. Find out the total number
    // of ways in which friends can remain single or can be paired up.
    public static int friendPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        /*
         * // choice
         * // single
         * int fnm1 = friendPairing(n - 1);
         * 
         * // pair
         * int fnm2 = friendPairing(n - 2);
         * int pairWays = (n - 1) * fnm2;
         * 
         * // totways
         * int totWays = fnm1 + pairWays;
         * return totWays;
         */

        // Or
        return friendPairing(n - 1) + (n - 1) * friendPairing(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }
}
