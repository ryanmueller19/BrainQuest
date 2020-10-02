

public class UnitTests {
    public static void main(String[] args){

       //Create a Creature
        System.out.println("\nThis should announce a creature:");
        Creature a = new Creature("Hockey Player");
        System.out.println();

       //Check Creatures Healh
        System.out.println("\nHealth should be set to 100 by default");
        System.out.println(a.health() == 100);
        System.out.println();

        //Checks Creatures Treasure
        System.out.println("\nCeature should have no default treasure");
        System.out.println(a.getTreasure() == null);
        System.out.println();

        // Build a Treasure
        System.out.println("\nTreasure's name is Golden HockeyStick");
        Treasure gh = new Treasure("Golden HockeyStick");
        System.out.println(gh.title().equals("Golden HockeyStick"));
        System.out.println();
    }
    
}
