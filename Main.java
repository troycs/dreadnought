/*
* This is the main driver class for now.
*
*/
public class Main
{
    public static void main(String[] argv)
    {
        System.out.println("dreadnought");
        Ship battleship = new Ship(5);
        System.out.println(battleship.getOrientation());
    }
}
