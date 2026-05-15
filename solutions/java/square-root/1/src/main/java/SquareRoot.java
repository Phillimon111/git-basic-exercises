public class SquareRoot {
    public int squareRoot(int radicand) {
        if (radicand < 0) {
            throw new IllegalArgumentException("Radicand must be non-negative");
        }
        if (radicand == 0 || radicand == 1) {
            return radicand;
        }

        int low = 1;
        int high = radicand;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == radicand) {
                return mid; // found exact square root
            } else if (square < radicand) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Since the problem guarantees perfect squares, we should never reach here
        throw new IllegalArgumentException("Input is not a perfect square");
    }
}