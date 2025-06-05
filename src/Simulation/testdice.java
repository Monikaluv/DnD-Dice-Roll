package Simulation;

import Dice.*;

public class testdice 
{
    static int[] array = new int[7];
    protected static String testeverydice()
    {
        Dice d4 = new D4();
        Dice d6 = new D6();
        Dice d8 = new D8();
        Dice d10 = new D10();
        Dice d12 = new D12();
        Dice d20 = new D20();
        Dice d100 = new D100();

        array[0] = d4.RollDice();
        array[1] = d6.RollDice();
        array[2] = d8.RollDice();
        array[3] = d10.RollDice();
        array[4] = d12.RollDice();
        array[5] = d20.RollDice();
        array[6] = d100.RollDice();

        return DicetoString();
        
    }
    
    public static String DicetoString()
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
}
