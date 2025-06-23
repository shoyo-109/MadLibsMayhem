import java.util.Scanner;

public class MadLibsGame {

    // variabes, defined as static to be used by all method of the class

    static String oddTime, kitchenApplience;
    static String adjective, friendName;
    static String madeUpWorld, oneDigitNumber;
    static String color, clothingItem;
    static String randomQuote, jobRole;
    static String perform, objectName;
    static String song, grossObject;
    static String fictionalPet;


    public static void main(String[] args)
    {

        // objects and classess

        MadLibsGame ob = new MadLibsGame();
        Scanner sc = new Scanner(System.in);


        // calling method for taking values as input from users

        ob.getInput(sc);

        // calling methode for printing story

        ob.printStory();
    }

    // method for taking values as input from users

    void getInput(Scanner sc)
    {
        System.out.println("Enter a weird time (e.g. 1.00 AM, 3:47 AM, 1:23 PM, or 11:11 at night) : ");
        oddTime = sc.nextLine();

        System.out.println("Any Kitchen Applience (e.g. toaster, blender, angry microwave)");
        kitchenApplience = sc.nextLine();

        System.out.println("Enter an adjective (e.g., slimy, glittery, confused, radioactive)");
        adjective = sc.nextLine();

        System.out.println("Name a weird friend : ");
        friendName = sc.nextLine();

        System.out.println("Enter a made-up alien planet name (e.g., Zorgo-Bargle, Floopton-7, Grand Line)");
        madeUpWorld = sc.nextLine();

        System.out.println(	"Enter a silly number (e.g., 5,6,56, 69, 42)");
        oneDigitNumber = sc.nextLine();

        System.out.println("Enter a strange color (e.g., neon purple, banana yellow, glowing green)");
        color = sc.nextLine();

        System.out.println("Enter a weird clothing item (e.g., sequined tutu, disco pants, flaming socks)");
        clothingItem = sc.nextLine();

        System.out.println("Enter a silly quote or slogan (e.g., 'Hishashiburi dana ..... Mugiwara ', 'It's been a while')");
        randomQuote = sc.nextLine();

        System.out.println("Enter a strange job title (e.g. crew's chef, Galactic Hair Stylist, Alien DJ, Intergalactic Dentist)");
        jobRole = sc.nextLine();

        System.out.println("Enter a funny verb (e.g. meat, anata, moonwalk, sneeze, twerk)");
        perform = sc.nextLine();

        System.out.println(	"Enter a plural object (e.g., flaming donuts, magma donuts, donuts )");
        objectName = sc.nextLine();

        System.out.println("Enter a silly song title (e.g. Binks no Sake, Baby Shark, Never Gonna Give You Up)");
        song = sc.nextLine();

        System.out.println(	"Enter a gross object (e.g. pant, soggy tissue, expired yogurt)");
        grossObject = sc.nextLine();

        System.out.println(	"Enter a mythical creature (e.g., unicorn-lizard, zombie kangaroo, fire-breathing alpaca)");
        fictionalPet = sc.nextLine();
    }

    // methode for printing story

    void printStory()
    {
        System.out.println("Last night at exactly " + oddTime + ", I was sucked into a "+kitchenApplience+" by a(n) "+adjective+" alien named "+friendName+" from the planet "+madeUpWorld+".\n" +
                "The alien had "+oneDigitNumber+" eyeballs, "+color+" skin, and wore a "+clothingItem+" with the phrase \""+randomQuote+"\" written in glitter.\n" +
                "They told me I had been chosen to audition as their new "+jobRole+" on Galactic TikTok.\n" +
                "My task? To "+perform+" while juggling "+objectName+" and singing \"" + song+ "\".\n" +
                "If I failed, I’d be turned into a "+grossObject+" and will be fed to their pet "+fictionalPet+".\n" +
                "Luckily, I impressed them by doing the worm dance on a floating recliner, yelling “BY THE POWER OF EL-THORRRR!”\n" +
                "I woke up in my bed, holding a glowing rubber duck wearing sunglasses, and a note that said,\n" +
                "\"Nice moves, Earth nerd. See you on Season 2.\"");
    }
}
