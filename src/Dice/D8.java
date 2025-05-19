package Dice;

import java.util.Random;

public class D8 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(8) + 1;
    }
}