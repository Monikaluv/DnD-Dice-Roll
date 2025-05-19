package Dice;

import java.util.Random;

public class D20 implements Dice
{
    @Override
    public int RollDice() 
    {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
}
