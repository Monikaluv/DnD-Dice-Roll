package Dice;

import java.util.Random;

public class D10 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
