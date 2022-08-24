import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void incrementBinTest() {

        // Given
        Bins bin = new Bins(); // Created a Bin object

        // When
        bin.incrementBin(5);

        // Then
        int actual = bin.getBin(5);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBin() {

        //Given
        Bins bin = new Bins();
        bin.incrementBin(1);
        bin.incrementBin(2);
        bin.incrementBin(2);
        //Checking for the sum of 1. It came back once. Actual checks for 1. 1/3

        //When
        int actual = bin.getBin(1);
        int expected = 1;

        //Then
        Assert.assertEquals(expected, actual);
    }

}
