import java.util.LinkedList;
import java.util.Queue;

/* Author: Alexander Klein
 * Date: 9/17/2021
 * Assignment: Assignment 3
 */
public class Main {
    private static Cell[][] grid = new Cell[9][9];
    public static void main(String args[]) {
        //Manually creates the 9x9 grid.
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new Cell((("" + (char) (i + 97)) + (j+1)),
                        null, null, null, null, null, null, null, null);
            }
        }

        grid[0][0].setDown(grid[0][1]);
        grid[0][0].setRight(grid[1][0]);
        grid[0][0].setDownRight(grid[1][1]);

        grid[7][8].setUp(grid[7][7]);
        grid[7][8].setLeft(grid[6][8]);
        grid[7][8].setUpLeft(grid[6][7]);

        grid[0][8].setUp(grid[0][7]);
        grid[0][8].setRight(grid[1][8]);
        grid[0][8].setUpRight(grid[1][7]);

        grid[7][0].setDown(grid[7][1]);
        grid[7][0].setLeft(grid[6][0]);
        grid[7][0].setDownLeft(grid[6][1]);

        for (int i = 1; i < 8; i++) {
            grid[0][i].setUp(grid[0][i-1]);
            grid[0][i].setDown(grid[0][i+1]);
            grid[0][i].setRight(grid[1][i]);
            grid[0][i].setUpRight(grid[1][i-1]);
            grid[0][i].setDownRight(grid[1][i+1]);

            grid[7][i].setUp(grid[7][i-1]);
            grid[7][i].setDown(grid[7][i+1]);
            grid[7][i].setLeft(grid[6][i]);
            grid[7][i].setUpLeft(grid[6][i-1]);
            grid[7][i].setDownLeft(grid[6][i+1]);
        }

        for (int i = 1; i < 7; i++) {
            grid[i][0].setDown(grid[i][1]);
            grid[i][0].setLeft(grid[i-1][0]);
            grid[i][0].setRight(grid[i+1][0]);
            grid[i][0].setDownLeft(grid[i-1][1]);
            grid[i][0].setDownRight(grid[i+1][1]);

            grid[i][8].setUp(grid[i][7]);
            grid[i][8].setLeft(grid[i-1][8]);
            grid[i][8].setRight(grid[i+1][8]);
            grid[i][8].setUpLeft(grid[i-1][7]);
            grid[i][8].setUpRight(grid[i+1][7]);
        }

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 8; j++) {
                grid[i][j].setUp(grid[i][j-1]);
                grid[i][j].setDown(grid[i][j+1]);
                grid[i][j].setLeft(grid[i-1][j]);
                grid[i][j].setRight(grid[i+1][j]);
                grid[i][j].setUpLeft(grid[i-1][j-1]);
                grid[i][j].setUpRight(grid[i+1][j-1]);
                grid[i][j].setDownLeft(grid[i-1][j+1]);
                grid[i][j].setDownRight(grid[i+1][j+1]);
            }
        }


        //Adds the walls
        grid[3][1].setDownRight(null);

        grid[4][1].setDown(null);
        grid[4][1].setDownRight(null);

        grid[5][1].setDownLeft(null);
        grid[5][1].setDown(null);
        grid[5][1].setDownRight(null);
        grid[5][1].setRight(null);

        grid[6][1].setLeft(null);


        grid[3][2].setRight(null);
        grid[3][2].setDownRight(null);

        grid[4][2].setDownLeft(null);
        grid[4][2].setLeft(null);
        grid[4][2].setUpLeft(null);
        grid[4][2].setUp(null);
        grid[4][2].setUpRight(null);

        grid[5][2].setUpLeft(null);
        grid[5][2].setUp(null);


        grid[1][3].setDownRight(null);

        grid[2][3].setDownRight(null);
        grid[2][3].setDown(null);

        grid[3][3].setDownLeft(null);
        grid[3][3].setDown(null);
        grid[3][3].setDownRight(null);
        grid[3][3].setRight(null);
        grid[3][3].setUpRight(null);

        grid[4][3].setUpLeft(null);
        grid[4][3].setDownLeft(null);
        grid[4][3].setLeft(null);

        grid[5][3].setDownRight(null);

        grid[6][3].setDown(null);


        grid[1][4].setRight(null);
        grid[1][4].setDownRight(null);

        grid[2][4].setDownLeft(null);
        grid[2][4].setLeft(null);
        grid[2][4].setUpLeft(null);
        grid[2][4].setUp(null);
        grid[2][4].setUpRight(null);

        grid[3][4].setUpLeft(null);
        grid[3][4].setUp(null);
        grid[3][4].setUpRight(null);
        grid[3][4].setRight(null);

        grid[4][4].setLeft(null);
        grid[4][4].setUpLeft(null);

        grid[5][4].setRight(null);
        grid[5][4].setDownRight(null);

        grid[6][4].setUp(null);
        grid[6][4].setUpLeft(null);
        grid[6][4].setLeft(null);
        grid[6][4].setDownLeft(null);


        grid[1][5].setUpRight(null);
        grid[1][5].setRight(null);
        grid[1][5].setDownRight(null);

        grid[2][5].setUpLeft(null);
        grid[2][5].setLeft(null);
        grid[2][5].setDownLeft(null);

        grid[5][5].setUpRight(null);
        grid[5][5].setRight(null);
        grid[5][5].setDownRight(null);

        grid[6][5].setUpLeft(null);
        grid[6][5].setLeft(null);
        grid[6][5].setDownLeft(null);

        grid[7][5].setDown(null);


        grid[1][6].setUpRight(null);
        grid[1][6].setRight(null);
        grid[1][6].setDownRight(null);

        grid[2][6].setUpLeft(null);
        grid[2][6].setLeft(null);
        grid[2][6].setDownLeft(null);
        grid[2][6].setDown(null);
        grid[2][6].setDownRight(null);

        grid[3][6].setDownLeft(null);
        grid[3][6].setDown(null);

        grid[5][6].setUpRight(null);
        grid[5][6].setRight(null);
        grid[5][6].setDownRight(null);

        grid[6][6].setUpLeft(null);
        grid[6][6].setLeft(null);
        grid[6][6].setDownLeft(null);

        grid[7][6].setUp(null);


        grid[1][7].setRight(null);
        grid[1][7].setUpRight(null);

        grid[2][7].setUpRight(null);
        grid[2][7].setUp(null);
        grid[2][7].setUpLeft(null);
        grid[2][7].setLeft(null);

        grid[3][7].setUp(null);
        grid[3][7].setUpLeft(null);

        grid[5][7].setRight(null);
        grid[5][7].setUpRight(null);

        grid[6][7].setLeft(null);
        grid[6][7].setUpLeft(null);

        //Runs the search algorithm. Heuristic (Tries to take the absolute shortest path to the goal, knowing it is in
        // the bottom right of the grid.)
        System.out.println("Steepest-Ascent Hill Climbing Algorithm:");
        String output = hillClimb(grid[0][0], grid[7][8]);
        System.out.println("" + output);
    }

    //Steepest-Ascent Hill Climbing.
    private static String hillClimb(Cell root, Cell goal) {
        //Creates the queue.
        Queue<Cell> goalFinder = new LinkedList<>();

        //Prints the root
        System.out.println(root.getName());

        //If it found the goal.
        if (root.equals(goal)) {
            return "Success! ";
        }

        //Adds all children of current root to the queue.
        if (root.getUp() != null) {
            goalFinder.add(root.getUp());
        }
        if (root.getDown() != null) {
            goalFinder.add(root.getDown());
        }
        if (root.getLeft() != null) {
            goalFinder.add(root.getLeft());
        }
        if (root.getRight() != null) {
            goalFinder.add(root.getRight());
        }
        if (root.getUpLeft() != null) {
            goalFinder.add(root.getUpLeft());
        }
        if (root.getUpRight() != null) {
            goalFinder.add(root.getUpRight());
        }
        if (root.getDownLeft() != null) {
            goalFinder.add(root.getDownLeft());
        }
        if (root.getDownRight() != null) {
            goalFinder.add(root.getDownRight());
        }

        //Gets the distance of the root node to the goal and sets the current best to the current root.
        double min = getDist(root, goal);
        Cell best = root;

        //Checks if any of the children of the current root are closer to the goal than the current root.
        while (!goalFinder.isEmpty()) {
            double val = getDist(goalFinder.peek(), goal);

            if (val < min) {
                min = val;
                best = goalFinder.remove();
            } else {
                goalFinder.remove();
            }
        }

        //Checks if the new best node has any children it can jump to from here.
        //(Only down, right, and downright are checked because of the nature of the algorithm which only allows
        // movement in those directions.)
        if (best.getDown() == null && best.getRight() == null && best.getDownRight() == null) {
            System.out.println(best.getName());

            if (best.equals(goal)) {
                return "Success! ";
            }
            return "Failure. ";
        } else {
            //Otherwise, the program runs hillClimb with the new best being the root.
            return hillClimb(best, goal);
        }
    }

    //Gets the distance from the provided node to the goal by converting the name of the node into numbers and running
    //the distance formula.
    private static double getDist(Cell cell, Cell goal) {
        char[] cellCh = cell.getName().toCharArray();
        char[] goalCh = goal.getName().toCharArray();

        int cellX = (int) cellCh[0] - 97;
        int cellY = cellCh[1];

        int goalX = (int) goalCh[0] - 97;
        int goalY = goalCh[1];

        return (Math.sqrt(Math.pow((goalY - cellY), 2) + Math.pow((goalX - cellX), 2))); //Distance formula.
    }
}
