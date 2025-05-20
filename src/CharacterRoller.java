import java.util.Arrays;

import Dice.*;

public class CharacterRoller
{
    int[] array = new int[6];
    public CharacterRoller()
    {

    }

    private int StatRoll()
    {
        D6 dice = new D6();
        int stat = 0;

        int[] statarr = new int[4];
        for(int i=0; i<statarr.length; i++)
        {
            statarr[i] = dice.RollDice();
        }
        Arrays.sort(statarr);
        for(int i=1; i<statarr.length;i++)
        {
            stat += statarr[i];
        }
        return stat;
    }

    public int[] StatArrayRoll()
    {
        clearArr();
        for(int i = 0; i < array.length;i++)
        {
            array[i] = StatRoll();
        }
        return array;
    }

    private void clearArr()
    {
        array = new int[]{0,0,0,0,0,0};
    }

    @Override
    public String toString()
    {
        String returnString = "[";
        for(int i=0; i<array.length;i++)
        {
            returnString += Integer.toString(array[i]);
            if(i!=array.length-1)
            {
                returnString += ", ";
            }
        }
        returnString += "]";
        return returnString;
    }

    public void testRoll()
    {
        System.out.println(StatRoll());
    }
}