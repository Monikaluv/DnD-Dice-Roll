import java.util.Scanner;

public class Programm 
{
    public static void launch() throws InterruptedException
    {
        System.out.println("Normal Dice roll or Roll a Manual Array? DR/MA/EXIT");
        Scanner scan = new Scanner(System.in);
        navigate(scan.next());
        scan.close();
    }

    public static void navigate(String msg) throws InterruptedException
    {
        switch(msg)
        {
            case "DR":
                System.out.println("WIP");
                System.exit(0);
                break;
            case "MA":
                Roll();
                break;
            case "EXIT":
                System.exit(0);
        }
    }

    public static void Roll() throws InterruptedException
    {
        CharacterRoller roller = new CharacterRoller();
        roller.StatArrayRoll();
        System.out.print("Rolling Array");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".\n");
        Thread.sleep(500);
        System.out.println(roller.toString());
        Thread.sleep(500);
        RollAgainQuestion();
    }

    public static void RollAgainQuestion() throws InvalidArgumentException, InterruptedException
    {
        System.out.println("Do you want to roll again? y/n");
        Scanner scanner = new Scanner(System.in);
        String token = scanner.next();

        if(token.equals(new String("y")))
        {
            Roll();
        }
        else if(token.equals(new String("n")))
        {
            launch();
        }
        else
        {
            scanner.close();
            throw new InvalidArgumentException("Not a valid answer!");
        }
        scanner.close();
    }
}
