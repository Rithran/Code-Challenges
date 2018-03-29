
public class ConwaysGameOfLife
{
    public static void main(String[] args)
    {
        int X = 10, Y = 10;
 
        // Intialize the grid, two dimensional arrays make this easy.
        int[][] grid = { { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                         { 0, 0, 1, 1, 0, 0, 0, 0, 1, 0 },
                         { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                         { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
 
        // Display the grid
        System.out.println("First Generation");
        for (int i = 0; i < X; i++)
        {
            for (int j = 0; j < Y; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        nextGeneration(grid, X, Y);
    }
 
    // Function to print next generation
    static void nextGeneration(int grid[][], int X, int Y)
    {
        int[][] future = new int[X][Y];
 
        // Loop through every cell
        for (int l = 1; l < X - 1; l++)
        {
            for (int m = 1; m < Y - 1; m++)
            {
                // Find # of neighbors that are alive
                int livingNeighbors = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        livingNeighbors += grid[l + i][m + j];
 
                // The cell needs to be subtracted from
                // its neighbors as it was counted before
                livingNeighbors -= grid[l][m];
 
                // Implement rules of life
 
                // Cell is lonely and dies
                if ((grid[l][m] == 1) && (livingNeighbors < 2))
                    future[l][m] = 0;
 
                // Cell dies due to over population
                else if ((grid[l][m] == 1) && (livingNeighbors > 3))
                    future[l][m] = 0;
 
                // A new cell is born
                else if ((grid[l][m] == 0) && (livingNeighbors == 3))
                    future[l][m] = 1;
 
                // Does not change
                else
                    future[l][m] = grid[l][m];
            }
        }
 
        System.out.println("Creating next generation...");
        for (int i = 0; i < X; i++)
        {
            for (int j = 0; j < Y; j++)
            {
                if (future[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
