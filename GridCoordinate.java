import java.util.ArrayList;
/*
* Represents a coordinate on the Grid
* Coordinates are represented interally as integers in the 
* range 0-9 inclusive
*/
public class GridCoordinate
{
    private int row;
    private int col;

    //this array is used to convert to and from alphanumeric
    //representation of coordinates eg: A4, B6, J1 etc...
    private final char[] chars = {'A','B','C','D','E','F','G','H','I','J'};

    public GridCoordinate()
    {
        this.row = 0;
        this.col = 0;
    }

    public GridCoordinate(int col, int row)
    {
        this.row = row;
        this.col = col;
    }

    //this constructor creates a new GridCoordinate from 
    //an alphanumeric coordinate string eg: A4, B6, J1
    public GridCoordinate(String alphaNumericCoordinate)
    {
        //slice alphaNumericCoordinate into it's
        //alphabetic and numeric components
        char letter = alphaNumericCoordinate.substring(0,1).charAt(0);
        String number = alphaNumericCoordinate.substring(1);
        //find the given letter in the chars list
        this.row = -1;
        for (int i=0; i<this.chars.length; i++)
        {
            if (this.chars[i] == letter)
                this.row = i;   
        }
        if (this.row == -1)
            System.out.println("error: invalid coordinate"); //replace this with an exception later
        
        //parse the numeric component of the alphanumeric coordinate
        this.row = Integer.parseInt(number);
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public int getRow()
    {
        return this.row;
    }

    public void setCol(int col)
    {
        this.col = col;
    }

    public int getCol()
    {
        return this.col;
    }

    //returns a string representation of this coordinate
    //eg: if col=0 and row=0 the string "A1" is returned
    //eg: if col=2 and row=3 the string "C4" is returned
    //eg: if col=9 and row=9 the string "J10" is returned
    public String toString()
    {
        return Character.toString(this.chars[this.row]) + (this.col+1);
    }

}
