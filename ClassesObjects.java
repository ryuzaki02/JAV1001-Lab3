/*  
    Student ID           :- A00257629
    Student Name         :- Aman Thakur
    
    AND

    Student ID           :- A00240755
    Student Name         :- Rushabh Shah
    
    Program & Assignment :- MAPD / 
    Program Defination   :- JAV1001-Lab 3 - Classes/ Objects
    Program Description  :- JAV-1001 - 50733 - App Development for Android - 202205 - 001
 */

public class ClassesObjects {
    public static void main(String[] args) {
        int sideUp;
        int sides;
        String name;

        // ************ Create different sized dice using each constructor ************
        // Constructor 1: Default Dice
        System.out.println("\n");
        System.out.println("1-");
        System.out.println("This is default dice");
        Dice dice = new Dice();
        sideUp = dice.getSideUp();
        sides = dice.getSides();
        name = dice.getDiceName();
        showDiceData(sides, sideUp, name);
        System.out.println("\n");

        // ************ Roll the dice and display their results (before and after)
        // ************
        diceResultBeforeAndAfter(dice);

        // Constructor 2: Dice with number of sides parameter
        System.out.println("\n");
        System.out.println("2-");
        System.out.println("This is  dice with number of sides parameter");
        Dice diceWithSides = new Dice(10);
        sideUp = diceWithSides.getSideUp();
        sides = diceWithSides.getSides();
        name = diceWithSides.getDiceName();
        showDiceData(sides, sideUp, name);
        System.out.println("\n");

        // ************ Roll the dice and display their results (before and after)
        // ************
        diceResultBeforeAndAfter(diceWithSides);

        // Constructor 3: Dice with number of sides and name parameter
        System.out.println("\n");
        System.out.println("3-");
        System.out.println("This is dice with number of sides and name parameter");
        Dice diceWithNameAndSides = new Dice(10, "Death Roll");
        sideUp = diceWithNameAndSides.getSideUp();
        sides = diceWithNameAndSides.getSides();
        name = diceWithNameAndSides.getDiceName();
        showDiceData(sides, sideUp, name);
        System.out.println("\n");

        // ************ Roll the dice and display their results (before and after)
        // ************
        diceResultBeforeAndAfter(diceWithNameAndSides);

        // ************ Choose one Die object and set it to show it's highest value
        // ************
        System.out.println("\n");
        System.out.println("4-");
        diceWithSides.showHighestValue();

        // ************ BONUS (optional): create 5 six-sided dice. Roll each Die in a
        // loop until you get 5 of a kind. Count and display the number of rolls.
        // ************
        System.out.println("\n");
        System.out.println("5-");
        find5OfKind();
        System.out.println("\n");
    }

    // This method takes sides, sideUp and name as argument and show it to user
    //
    public static void showDiceData(int sides, int sideUp, String name) {
        System.out.println("Number of sides: " + sides);
        System.out.println("Face of dice: " + sideUp);
        System.out.println("Name of dice: " + name);
    }

    // This method takes dice object as parameter
    // Shows Side up before and after a single roll
    //
    public static void diceResultBeforeAndAfter(Dice dice) {
        int sideUp = dice.getSideUp();
        System.out.println("Face before roll: " + sideUp);
        dice.roll();
        int sideUpAfterRoll = dice.getSideUp();
        System.out.println("Face after roll: " + sideUpAfterRoll);
    }

    // This method create 5 dice objects
    // Then roll all dices one by one until a 5 of a kind appears
    // Shows number of total rolls before 5 of a kind happened
    //
    public static void find5OfKind() {
        Dice[] diceArray = new Dice[5];
        for (int i = 0; i < diceArray.length; i++) {
            diceArray[i] = new Dice();
        }
        int prevSide = -1;
        int i = 0;
        int count = 0;
        while (i < diceArray.length) {
            Dice dice = diceArray[i];
            dice.roll();
            int sideUp = dice.getSideUp();
            if (prevSide == -1) {
                prevSide = sideUp;
            } else if (prevSide != sideUp) {
                i = 0;
                count += 1;
            } else {
                i += 1;
            }
        }
        System.out.println("Found 5 of a kind in: " + count);
    }
}
