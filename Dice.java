public class Dice {
    private String name;
    private int sides;
    private int sideUp;

    public Dice() {
        this.sides = 6;
        this.name = "d6";
        roll();
    }

    public Dice(int sides) {
        this.sides = sides;
        this.name = getDiceNameFor(sides);
        roll();
    }

    public Dice(int sides, String diceName) {
        this.sides = sides;
        this.name = diceName;
        roll();
    }

    public void roll() {
        int roundRandom = (int) Math.round(Math.random() * 10);
        if (roundRandom == 0) {
            this.sideUp = 1;
        } else {            
            this.sideUp = (int) Math.round((roundRandom * this.sides) / 10);
        }
    }

    // Getters or Accessors
    public int getSides() {
        return this.sides;
    }

    public int getSideUp() {        
        return this.sideUp;
    }

    public String getDiceName() {
        return this.name;
    }

    // Setters or Mutators
    public void setSides(int sides) {
        this.sides = sides;
        this.name = getDiceNameFor(sides);
    }

    public void setName(String diceName) {
        this.name = diceName;
    }

    private String getDiceNameFor(int sides) {
        return this.name = "d" + sides;
    }
}
