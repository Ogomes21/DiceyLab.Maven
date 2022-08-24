import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    void tossAndSum() {
        // Given N die
        int numberOfDie = 2;
        Dice dice = new Dice(numberOfDie);

        // When we roll them
        int actual = dice.tossAndSum();

        // Then we add the sum
        Assert.assertTrue(actual >= 2 && actual <= 12);
    }
}
