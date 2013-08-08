import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class MinesweeperMain
{
    public static void main() {
        //Disable tooltips and other annoying things
        System.setProperty("info.gridworld.gui.selection", "hide");
        System.setProperty("info.gridworld.gui.tooltips", "hide");
        System.setProperty("info.gridworld.gui.frametitle", "Minesweeper");

        //Instantiate minefield
        MineField field = new MineField(new BoundedGrid<RandomTile>(3, 3));

        //Randomly add in tiles
        for (int r = 0; r < field.getGrid().getNumRows(); r++) {
            for (int c = 0; c < field.getGrid().getNumCols(); c++) {
                Location tempLoc = new Location(r, c);
                field.add(tempLoc, new RandomTile(field, tempLoc));
            }
        }
        
        field.setMessage("Welcome to Minesweeper");
        
        field.show();
    }
}
