public class Creature {
    //instance variables
    private String name;
    private int health = 100;
    private Treasure booty;
   /**
    * Creature Constructor
    */
   
    public Creature(String name){
        System.out.println(name + " is born!");
        this.name = name;
    }

    public Creature(String name, Treasure t){
       this(name);
       booty = t;


    }

    public Creature (String name, int health){
        this(name);
        this.health = health;

    }
    //ACCESSORS

    public String name() {
        return this.name;
    }

    public int health() {
        return this.health;
    }

    public Treasure getTreasure() {
        return this.booty;
    }

    //mutators --another part of encapuslation
    public void name (String name){
        this.name = name;
    }
    /**
     * the Creature object's constructure
     */
    public Creature(){
        this.name = "Villager";
    }

    @Override
    public String toString(){
        return this.name + " - Health:" + this.health;
    }

}