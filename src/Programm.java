import java.util.Scanner;
import Dice.*;

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
                DiceRoll();
                break;
            case "MA":
                ManualArray();
                break;
            case "EXIT":
                System.exit(0);
            default:
                throw new IllegalArgumentException("Not a valid option!");    
        }
    }

    public static void ManualArray() throws InterruptedException
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
            ManualArray();
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

    public static void DiceRoll() throws InterruptedException
    {
        System.out.println("Which dice do you want to roll? D4/D6/D8/D10/D12/D20/D100/EXIT");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        switch(answer)
        {
            case "D4":
                Dice d4 = new D4();
                System.out.println(d4.RollDice());
                break;
            case "D6":
                Dice d6 = new D6();
                System.out.println(d6.RollDice());
                break;
            case "D8":
                Dice d8 = new D8();
                System.out.println(d8.RollDice());
                break;
            case "D10":
                Dice d10 = new D10();
                System.out.println(d10.RollDice());
                break;
            case "D12":
                Dice d12 = new D12();
                System.out.println(d12.RollDice());
                break;
            case "D20":
                Dice d20 = new D20();
                System.out.println(d20.RollDice());
                break;
            case "D100":
                Dice d100 = new D100();
                System.out.println(d100.RollDice());
                break;
            case "BACK":
                launch();
                break;
            case "EXIT":
                System.exit(0);
                break;      
            default:
                scan.close();
                throw new IllegalArgumentException();                                                      
        }
        System.out.println("Roll again? y/n");
        String answer2 = scan.next();
        ReRoll(answer2);
        scan.close();
    }

    public static void ReRoll(String msg) throws InterruptedException
    {
        switch(msg)
        {
            case "y":
                DiceRoll();
                break;
            case "n":
                launch();
            default:
                throw new InvalidArgumentException();        
        }
    }
}
