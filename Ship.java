/*
* This class represents a single ship
*
*/

public class Ship
{
    private int length;
    private Orientation orientation;

    public Ship(int length)
    {
        this.length = length;
        this.orientation = Orientation.HORIZONTAL;
    }

    //gets the length of this ship in grid units
    //ship length is between 1 and 5 units
    public int getLength()
    {
        return this.length;
    }

    //sets the orientation of the ship
    public void setOrientation(Orientation orientation)
    {
        this.orientation = orientation;
    }

    //gets the orientation of the ship
    public Orientation getOrientation()
    {
        return this.orientation;
    }
}
