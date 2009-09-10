/*
* This class represents a single ship
* Ships have a certain length which is between 1 and 5 units.
* A ship with length n has n blocks.
* Ships have blocks which have the following two states:
* damaged or undamaged with all blocks undamaged at the start.
* Ships have an anchor point which describes its position on the grid.
*/

public class Ship
{
    //the length of the ship in units
    private int length;

    //the damage state of the ship's blocks
    private boolean[] damage;

    //the orientation of the ship
    private Orientation orientation;

    //ship constructor
    public Ship(int length)
    {
        this.length = length;
        //initalize the block damage array
        this.damage = new boolean[length];
        //set all blocks to undamaged (false)
        for (int i=0; i<length; i++)
            this.damage[i] = false;
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

    //damages the block with the given block number
    public void inflictDamage(int blockId)
    {
        if (blockId >= this.length)
            throw new Exception();
        this.damage[blockId] = true;
    }
}
