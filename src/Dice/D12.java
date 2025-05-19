package Dice;

import java.util.Random;

public class D12 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(12) + 1;
    }
}