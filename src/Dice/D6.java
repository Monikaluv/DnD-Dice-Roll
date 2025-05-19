package Dice;

import java.util.Random;

public class D6 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}