
public class Bins {
    // Bins should have an array or list of some sort.
    // That is meant to track the # of times all possible dice roll sums have been reached
    // If there is a die object meant to represent two dice, the corresponding
    // Bins class should be able to track every sum between 2 and 12
    // If it were for 3, it would be between 3 - 18. The lowest roll combo and the highest combo
    // Arrays start at 0 so adjust the 10, it'll be accurate
    // 0 will always be equal to the lowest possible roll. Subtract the number of dice to get your min.

    private static int min; // minimum roll value
    private static int max; // maximum roll value
    static int[] bin;

    public Bins() {
        this.min = 1;
        this.max = 6;
        this.bin = new int[max + 1];
    }

    public Bins(int min, int max) {
        // Look into accessed via instance reference
        this.min = min;
        this.max = max;
        this.bin = new int[max + 1];
    }

    public void incrementBin(int num) {
        bin[num - min]++;
    }

    // Create a tracking class Bins that can be used to track these results.

    public Integer getBin(int tossSumToGetCountOf) {
        return bin[tossSumToGetCountOf - min];
    }
}

