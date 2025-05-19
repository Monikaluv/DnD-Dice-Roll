package Dice;

import java.util.Random;

public class D4 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
