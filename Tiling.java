public class Tiling {
    // Given a "2 x n" board and tiles of size "2 x 1", count the number of ways to
    // tile the given board using the 2 x 1 tiles.
    // (A tile can either be placed horizontally or vertically.)

    public static int tilingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tilingProb(n - 1);

        // horizontal choice
        int fnm2 = tilingProb(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void main(String[] args) {
        System.err.println(tilingProb(3));
    }
}
