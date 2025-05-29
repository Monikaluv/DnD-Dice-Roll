package Simulation;

import Dice.*;

public class testdice 
{
    int[] array = new int[7];
    protected static String testeverydice()
    {
        Dice d4 = new D4();
        Dice d6 = new D6();
        Dice d8 = new D8();
        Dice d10 = new D10();
        Dice d12 = new D12();
        Dice d20 = new D20();
        Dice d100 = new D100();
        return null; 
        
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
}
