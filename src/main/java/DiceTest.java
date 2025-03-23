


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DiceTest {
    @Test
    public void testGetNumOfDice() {
      Dice dice = new Dice(5);
      assertEquals(5, dice.getNumOfDice(), "getNumOfDice() should return 5");
    }


    @Test
    public void testMultipleDiceRollsrange() {
        Dice dice = new Dice (3);
        int sum = dice.diceRoll();
        assertTrue(sum >= 3 && sum <= 18, "Dice should roll between 3 and 18");

    }













}