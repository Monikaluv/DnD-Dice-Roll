package Simulation;

import Program.*;

public class test 
{ 
    static CharacterRoller roller = new CharacterRoller();
    static int[] arr = new int[6];

    protected static String testRun()
    {
        arr = roller.StatArrayRoll();
        double avg = calcAvg(arr);
        
        return roller.toString() + "; " + Double.toString(avg);
    }

    protected static double calcAvg(int[] arr)
    {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum/arr.length;
    }


}
