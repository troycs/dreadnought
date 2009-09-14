/*
* This class is represents a single player game
* ie one player vs computer
* This type of game should be easier to build than an online type
* therefore we will build the single player mode first and
* then build the two player online mode.
*/
public class SinglePlayerGame
{
    private Grid playerGrid;
    private Grid computerGrid;
    
    public SinglePlayerGame()
    {
        playerGrid = new Grid();
        computerGrid = new Grid();
        
        playerGrid.startInteractiveDeployment();
    }
}
