package Simulation;

public class testrun 
{
    static double[] arr = new double[100];
    public static void main(String[] args)
    {
        for(int i = 0; i<100; i++)
        {
            System.out.println(test.testRun());
            arr[i] = test.calcAvg(test.arr);
        }

        System.out.println("Total avg = " + Double.toString(calcDoubleAvg(arr)));
        
    }

    protected static double calcDoubleAvg(double[] arr)
    {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        return sum/arr.length;
    }

}
