package Caveman;

/**
 * Class Caveman is an example of how to write a class
 *
 * @author vveggalam25
 * @version 0.1
 */
public class Cavemen {
    private int howStinky, vocab;
    private boolean canBuildFire, hasCave, hasMate;
    private int facialHair;//Scale of 1-10 (10 being most hair)
    private String name;
    private int numClubs;
    private double foodStash; //Weight of the total food in pounds
    public static final double MAX_HEIGHT = 5.9;
    public static final int CURRENT_YEAR = -100000;
    public static void print(Object o){
        System.out.println(o);
    }
    //*******************************CONSTRUCTORS********************
    //ALL Constructors:
    // (1) Have the same name as the class
    // (2) Have NO return type
    // (3) Purpose: to initialize all instance variables and set object up for use...

    /**
     *  Zero arg constructor - sets up a Caveman with default values
     */
    public Cavemen(){
        numClubs = 0;
        facialHair = 0;
        vocab = 0;
        howStinky = 5;
        canBuildFire = false;
        hasCave = true;
        hasMate = false;
        foodStash = 0;
        name = "unassigned";
    }
    public Cavemen(String n, int numWords) {
        facialHair = 0;
        howStinky = 5;
        canBuildFire = false;
        hasCave = true;
        name = n;
        foodStash = 0;
        vocab = numWords;
    }

    /**
     * Overloaded Constructor #2
     * @param n is the Caveman's name
     * @param h is how Stinky they are on a scale of 1-5 (int)
     * @param f is how much food they have in pounds (double)
     */
    public Cavemen(String n, int h, double f) {
        this(); //Sets the defaults
        this.name = n;//refers to instance variable
        this.howStinky = h;
        this.foodStash = f;
    }

    /**
     * Sets the number of clubs for this caveman
     * @param howMany is the number of clubs the Caveman has
     */
    public void setNumClubs(int howMany){
        this.numClubs = howMany;
    }
    /**
     * Sets the how stinky the caveman is on a scale of 1 - 10
     * @param howSmelly is the number of clubs the Caveman has
     * @postcondition: stinkiness must be between 0 and 10
     */
    public void setHowStinky(int howSmelly){
        this.howStinky = howSmelly;
    }
    /**
     * Sets if the caveman can build a fire
     * @param state is if the caveman can start a fire
     * */
    public void setCanBuildFire(boolean state){
        this.canBuildFire = state;
    }
    /**
     * Sets if the caveman has a cave
     * @param state is the if the caveman has a cave
     */
    public void setHasCave(boolean state){
        this.hasCave = state;
    }
    /**
     * Sets if the caveman has a cave
     * @param state is the if the caveman as a mate
     */
    public void setHasMate(boolean state){
        this.hasMate = state;
    }
    /**
     * Sets the name
     * @param name is the caveman's name
     */
    public void setName(String name){
        this.name = name;
    }

    //ACCESSOR METHODS - provide public access to private instance variables
    //setter methods
    /**
     * @return the number of clubs this Caveman has
     */
    public int getNumClubs(){
        return numClubs;
    }
    /**
     * @return the amount of facial hair this Caveman has
     * */
    public int howMuchFacialHair(){
        return facialHair;
    }
    /**
     * @return how stinu this Caveman is
     */
    public int getStinkness(){
        return howStinky;
    }
    /**
     * @return whether this Caveman can create a fire
     */
    public boolean firePower(){
        return canBuildFire;
    }
    /**
     * @return whether this Caveman has a cave
     */
    public boolean checkForCave(){
        return hasCave;
    }
    /**
     * @return whether this Caveman has a mate
     */
    public boolean checkForMate(){
        return hasMate;
    }
    /**
     * @return the Caveman's name
     */
    public String getName(){
        return name;
    }
    /**
     * @return How many words the caveman knows
     */
    public int getNumWords(){
        return vocab;
    }
    /**
     * @return how much food the caveman has
     */
    public double getStash(){
        return foodStash;
    }

    //Other Methods

    /**
     * @param numWords is the amount of words the Caveman will learn
     */
    public void learn(int numWords){
        this.vocab += numWords;
    }

    /**
     * @param scrubabliity is a double which represents the amount this Caveman scrubs as a percentage
     */
    public void shower(double scrubabliity){
        this.howStinky -= (scrubabliity/100) * howStinky;
    }

    /**
     * When this Caveman hunts it will attack randomly
     * If sucessful
     * @return true if sucessful, false otherwise
     *
     */
    public boolean hunt(){
        boolean sucess;
        sucess = (Math.random() < .35);
        if (sucess){
            foodStash += 1.5;
            return true;
        }
        return false;
    }
}
