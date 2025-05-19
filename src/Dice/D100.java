package Dice;

import java.util.Random;

public class D100 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
