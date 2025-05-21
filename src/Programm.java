import java.util.Scanner;

public class Programm 
{
    public static void launch()
    {
        CharacterRoller roller = new CharacterRoller();
        roller.StatArrayRoll();
        System.out.println(roller.toString());
        Question();
    }

    public static void Question() throws InvalidArgumentException
    {
        System.out.println("Do you want to roll again? y/n");
        Scanner scanner = new Scanner(System.in);
        String token = scanner.next();

        if(token.equals(new String("y")))
        {
            launch();
        }
        else if(token.equals(new String("n")))
        {
            scanner.close();
            System.exit(0);
        }
        else
        {
            scanner.close();
            throw new InvalidArgumentException("Not a valid answer!");
        }
    }
}
