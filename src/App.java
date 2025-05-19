public class App {
    public static void main(String[] args) throws Exception 
    {
        CharacterRoller roller = new CharacterRoller();
        roller.StatArrayRoll();
        System.out.println(roller.toString());
    }
}
