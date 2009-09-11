/*
* This class represents a players grid
* The grid is 10x10 
* Columns are identified by the letters A-L
* Rows are identified by the numbers 1-10
* The grid contains Ship objects
* Initially the grid will contain no Ship objects
* The user will then place 1 of each of the 5 types of Ships
*/

public class Grid
{
    Ship[] ships;

    public Grid()
    {
        //create the ships of this grid
        ships = new Ship[5];
        ships[0] = new Ship(2);
        ships[1] = new Ship(3);
        ships[2] = new Ship(3);
        ships[3] = new Ship(4);
        ships[4] = new Ship(5);

        //for now we will harcode the position of the ships
        //instead of letting the user place them
        ships[4].setOrientation(Orientation.VERTICAL);

        //test toString method of GridCoordinate
        GridCoordinate g = new GridCoordinate(0,0);
        //System.out.println(g);
    }

    //this method will display the grid on screen
    public void display()
    {
        //display the columns headings, A-L
        char[] chars = {'A','B','C','D','E','F','G','H','I','J'};
        System.out.print("    ");
        for (char i : chars)
            System.out.print(Character.toString(i) + "  ");
        System.out.println();
        //display each row
        for (int i=0; i<10; i++)
        {
            //display the upper dashed line
            System.out.print("   +");
            for (int j=0; j<10; j++)
                System.out.print("--+");
            System.out.println();
            //display the middle of the row
            System.out.print(i+1);
            //add extra space if row label is single digit 
            if (i+1<10)
                System.out.print(" ");
            System.out.print(" ¦");
            for (int j=0; j<10; j++)
            {
                System.out.print("  ¦");
            }
            System.out.println();
        }
        //display the upper dashed line
        System.out.print("   +");
        for (int j=0; j<10; j++)
            System.out.print("--+");
        System.out.println();
    }
}
