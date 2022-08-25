import java.util.Random;

public class Dice {
    public int numberOfDie;

    //N is the number of die in our set. Ex: 2 dice; 3 dice
    //Set is N. However many sets will use for the game
    //Grouping of the same type of thing. Ex: Like 5 distant plates. Cards.
    //Random for a random roll
    //Action, method, random-tossed.

public Dice(int numberOfDie) {
    this.numberOfDie = numberOfDie;
}

//Make method
    public Integer tossAndSum() {
    //Generate a random number N (Number of die) times between 1-6.
        int min = 1;
    //Max is exclusive. Set to 7 to include 6.
        int max = 7;
        int sum = 0;
        Random roll = new Random();
        for (int i = 0; i < numberOfDie; i++) {
            sum += roll.nextInt(min, max);
        }
        return sum;
    }
    //create a test that says you can set a value to 2, etc.
}
