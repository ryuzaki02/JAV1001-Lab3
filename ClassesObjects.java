public class ClassesObjects {
    public static void main(String[] args) {
        int sideUp;
        int sides;
        String name;

        // Constructor 1: Default Dice
        System.out.println("This is default dice");
        Dice dice = new Dice();
        sideUp = dice.getSideUp();
        sides = dice.getSides();
        name = dice.getDiceName();
        showDiceData(sides, sideUp, name);
        diceResultBeforeAndAfter(dice);

        // Constructor 2: Dice with number of sides parameter
        System.out.println("This is  dice with number of sides parameter");
        Dice diceWithSides = new Dice(10);
        sideUp = diceWithSides.getSideUp();
        sides = diceWithSides.getSides();
        name = diceWithSides.getDiceName();
        showDiceData(sides, sideUp, name);
        diceResultBeforeAndAfter(diceWithSides);

        // Constructor 3: Dice with number of sides and name parameter
        System.out.println("This is dice with number of sides and name parameter");
        Dice diceWithNameAndSides = new Dice(10, "Death Roll");
        sideUp = diceWithNameAndSides.getSideUp();
        sides = diceWithNameAndSides.getSides();
        name = diceWithNameAndSides.getDiceName();
        showDiceData(sides, sideUp, name);
        diceResultBeforeAndAfter(diceWithNameAndSides);

        find5OfKind();
    }

    public static void showDiceData(int sides, int sideUp, String name) {
        System.out.println("Number of sides: " + sides);
        System.out.println("Face of dice: " + sideUp);
        System.out.println("Name of dice: " + name);
    }

    public static void diceResultBeforeAndAfter(Dice dice) {
        int sideUp = dice.getSideUp();
        System.out.println("Face before roll: " + sideUp);
        dice.roll();
        int sideUpAfterRoll = dice.getSideUp();
        System.out.println("Face after roll: " + sideUpAfterRoll);
    }

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
